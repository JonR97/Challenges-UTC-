
package challenge5;
import java.util.Scanner;

public class Challenge5 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.print("Enter your test score: ");
        int score = input.nextInt();
        if(score>20){
            System.out.println("You achieved an A!");
        }else if (score >= 10){
            System.out.println("You achieved a C!");
        }else if (score <10){
            System.out.println("You failed the test.");
        }
    }
    
}

