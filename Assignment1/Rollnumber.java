import java.util.*;
import java.util.Scanner;

public class Rollnumber {

    private static int binarySearch(int N,String[] rollNum, String key){

        int i = 0;
        int j = N-1;

        int roll_num_to_search_for = Integer.valueOf(key);

        int comparison = 1;

        while(i<=j){
            int mid = (i+j)/2;
            int roll = Integer.valueOf(rollNum[mid]);

            if (roll == roll_num_to_search_for){
                return comparison;
            }
            else if (roll < roll_num_to_search_for){
                i = mid+1;
            }
            else{
                j = mid-1;
            }

            comparison += 1;
        }

        return  -1;

    }




    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Size, Roll Numbers and Roll number to search for ");
        String input = scanner.nextLine();

        String[] parts = input.split(",");

        int N = Integer.valueOf(parts[0].trim());

        String roll_number_to_search_for = parts[2].trim();

        String[] rollNum = parts[1].trim().split(" ");

        if (rollNum.length != N) {
            System.out.println("Error: The number of roll numbers provided does not match the size.");
            return;
        }

        int ans = binarySearch(N,rollNum,roll_number_to_search_for);

        System.out.println(ans);

    }
}