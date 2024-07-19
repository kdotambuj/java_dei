import java.util.*;
import java.util.Scanner;

public class Encrypt {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string ");
        String exp = scanner.nextLine();

        int len = exp.length();

        int i = 0;
        int j = len-1;

        String encryptedString = "";

        boolean takeFromStart = true;

        while(i<=j){
            if (takeFromStart){
                encryptedString += exp.charAt(i);
                i += 1;
                takeFromStart = false;
            }
            else{
                encryptedString += exp.charAt(j);
                j -= 1;
                takeFromStart = true;
            }
        }

        System.out.println(encryptedString);

    }
}