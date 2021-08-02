
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


        for ( int i =0; i< length; i++){
            for ( int j = 0; j<26; j++){
                if ( message.charAt(i) == lowerCase.charAt(j)){
                    System.out.println ( lowerCase.charAt( ( j + key) %26) );

                }
                else  if ( message.charAt(i) == lowerCase.charAt(j)){
                    System.out.println( cipher.charAt( (j + key) %26 ) );
                }
            }
        }
        System.out.println();

    }

}
