import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Enter the first natural number or press E for exit");
            String input1 = scanner.nextLine();

            if(Objects.equals(input1.toUpperCase(), "E")){
                scanner.close();
                break;
            } else if (Integer.parseInt(input1)>=0) {
                System.out.println("Enter the second natural number or press E for exit");
                String input2 = scanner.nextLine();
                boolean areFriendNumbers = areFriendNumbers(Integer.parseInt(input1), Integer.parseInt(input2));
                if(Objects.equals(input2.toUpperCase(), "E")) {
                    scanner.close();
                    break;
                } else if (Integer.parseInt(input2)>=0) {
                    if(areFriendNumbers){
                        System.out.println(input1+" and "+input2+" are friend numbers");
                    }
                    else {
                        System.out.println(input1+" and "+input2+" are not friend numbers");
                    }
                }
                else{
                    System.out.println("Please enter a proper value");
                }
            }
            else{
                System.out.println("Please enter a proper value");
            }

        }
    }

    private static boolean areFriendNumbers(int number1, int number2) {
        boolean bool;
        int total1=0;
        int total2=0;
        for(int i = 1; i < number1; i++)
        {
            if(number1%i==0)
            {
                total1 = total1 + i;
            }
        }
        for(int i = 1; i < number2; i++)
        {
            if(number2%i==0)
            {
                total2 = total2 + i;
            }
        }
        bool= total1 == number2 && total2 == number1;

        return bool;
    }
}