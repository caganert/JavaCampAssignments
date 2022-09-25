import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Enter a natural number or press E to exit");
            String input = scanner.nextLine();
            
            if(Objects.equals(input.toUpperCase(), "E")){
                scanner.close();
                break;
            } else if (Integer.parseInt(input)>=0) {
                boolean isPerfectNumber = isPerfectNumber(Integer.parseInt(input));
                if(isPerfectNumber){
                    System.out.println(input+" is a perfect number");
                }
                else{
                    System.out.println(input+" is not a perfect number");
                }
            }
            else{
                System.out.println("Please enter a proper value");
            }

        }
    }

    private static boolean isPerfectNumber(int number) {
        boolean bool;
        int total = 0;
        for (int i = 1; i <number ; i++) {
            if(number%i==0){
                total+=i;
            }
        }
        bool = total == number;

        return bool;
    }
}