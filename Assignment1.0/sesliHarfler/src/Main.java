import java.util.Objects;
import java.util.Scanner;

public class Main {
    static String[] sesliHarf = {"A","I","O","U","E","İ","Ö","Ü"};
    static String[] inceListe = {"E","İ","Ö","Ü"};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Sesli bir harf giriniz ya da çıkmak için C'ye basınız");
            String input = scanner.nextLine().toUpperCase().trim();

            if(input.equals("C")){
                scanner.close();
                break;
            } else{
                boolean isLetterAppropriate = false;
                for (String letter:sesliHarf){
                    if(Objects.equals(letter, input)){
                        isLetterAppropriate = true;
                        break;
                    }
                }
                if (isLetterAppropriate){
                    boolean letterType = LetterType(input);
                    if (letterType) {
                        System.out.println(input+" ince sesli bir harftir.");
                    }
                    else{
                        System.out.println(input+" kalın sesli bir harftir.");
                    }
                }
                else{
                    System.out.println("Lütfen 'sesli' harf giriniz.");
                }

            }
        }

    }
    public static boolean LetterType(String letter){
        for (String letters:Main.inceListe) {
            if(Objects.equals(letter, letters)){
                return true;
            }
        }
        return false;
    }
}

