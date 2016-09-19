
package challenge12;
import java.util.Scanner;

public class Challenge12 {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.print("Please enter a letter: ");
        String letter = input.nextLine();
        System.out.print("Please enter a number: ");
        int x = input.nextInt();
        
        while (x > 0){
            System.out.print(letter);
            x--;
        }
    }
    
}
