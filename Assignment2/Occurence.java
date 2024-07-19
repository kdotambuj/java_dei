import java.util.*;
import java.util.Scanner;

public class Occurence{
      public static void main(String[] args){

          Scanner scanner = new Scanner(System.in);
          System.out.println("Enter the sentence");

          String s = scanner.nextLine();
          int len = s.length();

          int[] freq = new int[26]; // all characters frequency is zero

          for (int i =0; i<len; i++){
              char ch = s.charAt(i);

              if ((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
                  if (ch-'a'>=0){
                      freq[ch-'a'] += 1;
                  }
                  else freq[ch-'a'+32] +=1;
              }
          }

          Arrays.sort(freq);
          for (int i =25; i>=0 ; i--){
              if (freq[i]==0) break;
              else System.out.print(freq[i]+" ");
          }
    }
}