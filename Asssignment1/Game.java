import java.util.*;
import java.util.Scanner;


public class Game{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Pen game welcomes you!");
        System.out.println("Enter 1 if you want to play first, else 0 : ");

        int userChance = scanner.nextInt();

        // random number of pens between [40,80]
        int low = 40;
        int high = 80;

//        int totalPens= (int)low + (int)(Math.random()* (high-low+1));
        int totalPens = 12;

        System.out.println("Total number of pens in this game : "+totalPens);


        while(totalPens > 0){

            if (userChance == 1){
                System.out.println("Pick the pen(s) : ");
                int pickedPenByUser = scanner.nextInt();

                while(pickedPenByUser < 1 || pickedPenByUser > 3){
                    System.out.println("Invalid pick, Pick ( 1 or 2 or 3 ) : ");
                    pickedPenByUser = scanner.nextInt();
                }

                totalPens -= pickedPenByUser;
                System.out.println("You picked "+pickedPenByUser+" pen(s), Total pens remaining : "+totalPens +" \n");

            }
            else{
                int pickedPenByComputer = findOptimalPick(totalPens);
                totalPens -= pickedPenByComputer;

                System.out.println("Computer picked "+pickedPenByComputer+" pen(s), Total pens remaining : "+totalPens+" \n");

            }

            if (totalPens == 0){
                if (userChance==1){
                    System.out.println("You won! :D");
                }
                else{
                    System.out.println("Computer won! Better luck next time :o ");
                }

            }

            userChance = Math.abs(userChance-1);
        }

        scanner.close();

    }


    private  static int findOptimalPick(int totalPens){
        int pickPen;

        if (totalPens % 4 ==0){
            pickPen = 1;
        }
        else{
            pickPen = totalPens % 4;
        }

        return Math.min(pickPen,Math.min(3,totalPens));
    }
}