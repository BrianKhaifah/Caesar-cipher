
import java.util.Scanner;

public class CeaserCipher {

    public static void main(String[] args) {

        String cipher = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String  lowerCase  =  cipher.toLowerCase();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Text;...");
        String message = scan.next();
        int length = message.length();
        System.out.println( " Enter the Key;...");
        int key = scan.nextInt();
        System.out.println( " The Encrypted Message is...");



    }

}
