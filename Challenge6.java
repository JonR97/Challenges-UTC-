
package challenge6;
import java.util.Scanner;

public class Challenge6 {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.print("Please enter the height of the rectangle in cm: ");
        int height = input.nextInt();
        System.out.print("Please enter the width of the rectangle in cm: ");
        int width = input.nextInt();
        System.out.println("The area of the rectangle is " + (width * height) + "cm");
        
    }
    
}
