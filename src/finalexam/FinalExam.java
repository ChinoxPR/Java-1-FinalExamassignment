/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finalexam;
import java.util.Scanner; // imported Scanner class for User input
/**
 *
 * @author John Hernandez 7/18/24
 */
public class FinalExam 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // Variables created
        String flavor;
        String size;
        int count;
        
        // Scanner obj created for user input
        Scanner input = new Scanner(System.in);
        
        //Input
        System.out.println("Enter your flavor of ice cream you would like to order");
        flavor = input.nextLine(); //Scanner will collect next string input
        
        System.out.println("What size are you looking for Example: S,M,L");
        size = input.nextLine(); // Scanner will collect next string input
        
        System.out.println("Many many count of ice cream your looking to buy");
        count = input.nextInt(); // Scanner will collect next int input
        input.nextLine();// consumes the new line character for next user input
        
        // IceCream obj was created with 3 arguments that was collected from user input
        IceCream iceCream = new IceCream(flavor, size, count);
        
        // IceCream obj was created from copying from another Icecream obj
        IceCream iceCreamCopy = new IceCream(iceCream);
        
        // toString method is activated from calling the IceCream objs in System.out
        System.out.println(iceCream);
        System.out.println(iceCreamCopy);
        
        System.out.println("Enter your another ice cream flavor you would like to order");
        flavor = input.nextLine(); //Scanner will collect next string input
        
        System.out.println("What size are you looking for Example: S,M,L");
        size = input.nextLine();//Scanner will collect next string input
        
        System.out.println("Many many count of ice cream your looking to buy");
        count = input.nextInt();//Scanner will collect int input
        
        //Another IceCream obj that collected 3 arguments from user input
        IceCream iceCreamNumber3 = new IceCream(flavor, size, count);
        
        // toString method activated from calling IceCream obj in System.out
        System.out.println("\n" + iceCreamNumber3);
        
        
        // if statements to find out if the two ice cream objs inner fields are equal
        if (iceCream.equals(iceCreamCopy))
        {
            System.out.println("Both ice creams are the same");
        }
        else
        {
            System.out.println("Both ice creams are different");
        }
        
         // if statements to find out if the two ice cream objs inner fields are equal
        if (iceCream.equals(iceCreamNumber3))
        {
            System.out.println("Both ice creams are the same");
        }
        else
        {
            System.out.println("Both ice creams are different");
        }
    }
    
}
