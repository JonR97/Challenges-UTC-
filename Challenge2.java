
package challenge2;
import java.util.Scanner;

public class Challenge2 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What country do you live in? ");
        String country = input.nextLine();
        System.out.print("What is the population of your country? ");
        int population = input.nextInt();
        System.out.println(country + " has a population of " + population + ".");
    }
    
}
