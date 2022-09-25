import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Enter list length");
            int arrayLength = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter max number");
            int maxNumber = Integer.parseInt(scanner.nextLine());

            int[] numbers = getNumberList(arrayLength, maxNumber);

            System.out.println("Guess a number between 1-"+maxNumber+" or press E for exit");
            String input = scanner.nextLine();

            if(Objects.equals(input.toUpperCase(), "E")) {
                scanner.close();
                break;
            } else if (Integer.parseInt(input)>=1 && Integer.parseInt(input)<=maxNumber) {
                int intInput = Integer.parseInt(input);
                boolean isFound = false;
                for(int number:numbers){
                    if(intInput==number){
                        isFound = true;
                        break;
                    }
                }
                if (isFound) {
                    System.out.println("Congrats, You got it right!");
                }
                else{
                    System.out.println("No, wrong guess :( The list will be regenerated");
                }
            }
            else{
                System.out.println("Please enter a proper number");
            }
        }

    }

    private static int[] getNumberList(int length, int max){
        Random r = new Random();
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            int number = r.nextInt(max);
            boolean unique = false;
            do{
                for (int k : numbers) {
                    if (k == number) {
                        number = r.nextInt(max);
                        unique = false;
                        break;
                    } else {
                        unique = true;
                    }
                }
            }while(!unique);
            numbers[i] = number;
        }
        return numbers;
    }
}