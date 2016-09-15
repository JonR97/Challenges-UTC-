
package challenge4;
import java.util.Scanner;

public class Challenge4 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = input.nextInt();
        if(number<=100){
            System.out.println(number + " is less than 100.");
            }else{
            System.out.println(number + " is larger than 100.");
        }
    }
    
}
