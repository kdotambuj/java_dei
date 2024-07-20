import java.util.*;
import java.util.Scanner;


public class Gravity {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the time (in seconds) : ");
        int time = scanner.nextInt();

        float g = 9.81f;

        float distanceTravelled = 0.5f * g * (float)(time*time);

        System.out.printf("Distance Travelled: %f ",distanceTravelled);
    }
}