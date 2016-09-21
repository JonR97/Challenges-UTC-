package challenge13;
import java.util.Scanner;


public class Challenge13 {

    public static void main(String[] args) {
                    boolean answer = true;

        while(answer == true){
            Scanner input = new Scanner(System.in);
            System.out.print("Please enter a number: ");
            String x = input.nextLine();
            x.toLowerCase();
            
            if(x=="stop"){
                break;
            }
            
            int num_x = Integer.parseInt(x);
            System.out.print("Please enter another number: ");
            String y = input.nextLine();
            y.toLowerCase();
            
            if(y=="stop"){
                break;
            }
            
            int num_y = Integer.parseInt(y);
            System.out.println(num_x + " + " + num_y + " = " + (num_x+num_y));
        }
        
            

            }
        }

       
   
