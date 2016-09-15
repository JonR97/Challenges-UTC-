
package challenge3;
import java.util.Scanner;

public class Challenge3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your first number? ");
        int firstNumber = input.nextInt();
        System.out.print("What is your second number? ");
        int secondNumber = input.nextInt();
        if (firstNumber > secondNumber){
            System.out.println(firstNumber + " divided " + secondNumber + " equals " + (firstNumber/secondNumber) );
        }else{
            System.out.println(secondNumber + " divided " + firstNumber + " equals " + (secondNumber/firstNumber) );
        }
    }
    
}
