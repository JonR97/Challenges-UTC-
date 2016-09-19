
package challenge11;
import java.util.Scanner;

public class Challenge11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int x = input.nextInt();
        int y = 1;
       while (y <= x){
           System.out.println(y);
           y++;
       }
    }
    
}
