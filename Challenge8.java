package challenge8;
import java.util.Scanner;

public class Challenge8 {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int first = input.nextInt();
        System.out.print("Please enter another number: ");
        int second = input.nextInt();
        System.out.println("Please enter a number corrosponding to one of the following options.");
        System.out.println(" ");
        System.out.println("1.Additon");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        int choice = input.nextInt();
        if(choice==1){
            System.out.println(first + " + " + second + " = " + (first + second));
        }else if (choice==2){
            System.out.println(first + " - " + second + " = " + (first - second));
        }else if (choice==3){
            System.out.println(first + " * " + second + " = " + (first * second));
        }else if (choice==4){
            System.out.println(first + " / " + second + " = " + (first / second));
        }else{
            System.out.println("Please choice one of the first options.");
        }
    }
    
}


// int x =5;

// if(x==5)
