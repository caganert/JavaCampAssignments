import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        while(true){
            System.out.println("Enter a number or press E for exit : ");

            String input = scanner.nextLine().toUpperCase();

            if(Objects.equals(input, "E")){
                scanner.close();
                break;
            }
            else{
                boolean isPrimeNumber = isPrimeNumber(Integer.parseInt(input));
                if (isPrimeNumber){
                    System.out.println(input+" is a prime number.");
                }
                else{
                    System.out.println(input+" is not a prime number.");
                }
            }

        }
    }

    public static boolean isPrimeNumber(int number){
        if(number>2){
            for (int i = 2; i < number; i++) {
                if(number%i==0) {
                    return false;
                }
            }
        }
        else return number == 2;

        return true;
    }
}