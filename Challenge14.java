
package challenge14;
import java.util.Scanner;
import java.util.Random;

public class Challenge14 {
//
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int x = rand.nextInt(100) + 1;
        int counter = 0;
        boolean y = true;
        while(y == true){
            System.out.print("Guess the number: ");
            int z = input.nextInt();
            counter++;
            if (z == x){
                System.out.println("Congrats, you guess the number " + x);
                System.out.println("It took you " + counter + " guesses!");
        }
            if (z < x){
                System.out.println("Your guess was too low, try again.");
                counter++;
            }
            if (z > x){
                System.out.println("Your guess it too high, try again.");
                counter++;
            }
        }
        
    }
    
}
