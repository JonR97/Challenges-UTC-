package challenge16;
import java.util.Scanner;

public class Challenge16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = input.nextInt();
        System.out.print("Please enter the power number: ");
        int power = input.nextInt();
        System.out.println(num + " to the power of " + power + " is " + (java.lang.Math.pow(num, power)));
    }
    
}
