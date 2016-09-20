package challenge17;
import java.util.Scanner;

public class Challenge17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int x = input.nextInt();
        System.out.print("Please enter another number: ");
        int y = input.nextInt();
        int count = 0;
        
        while(count <=10){
            System.out.print(x + ", ");
            System.out.print(y + ", ");
            int a = x+y;
            int b = y+a;
            x = a;
            y = b;       
            count++;
        }
    }
    
}
