
package challenge7;
import java.util.Scanner;

public class Challenge7 {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.print("Please enter the speed at which you have travelled: ");
        int speed = input.nextInt();
        System.out.print("Please enter the time it took you in minutes: ");
        int time = input.nextInt();
        System.out.println("You have travelled " + (speed * time) + "m");
    }
    
}
