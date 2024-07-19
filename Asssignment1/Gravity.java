import java.util.*;
import java.util.Scanner;


public class Gravity {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the time (in seconds) : ");
        int time = scanner.nextInt();

        final double g = 9.81f;

        double distanceTravelled = 0.5 * g * time * time;

        System.out.printf("Distance Travelled: %f ",distanceTravelled);
    }
}