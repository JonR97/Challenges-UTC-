
package challenge15;
import java.util.Scanner;

public class Challenge15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int y = input.nextInt();
        int x = 0;
        while(x <=100){
            if(x % y == 0){
                System.out.println(x + " is not divisible by " + y );
            }
            System.out.println(x + " / " + y + " = " + (x/y));
            x++;
       }
    }
    
    
 
}
