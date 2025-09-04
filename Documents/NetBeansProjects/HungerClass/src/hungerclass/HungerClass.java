/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hungerclass;
import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class HungerClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner hunger = new Scanner(System.in);
        System.out.println("Hi hi, what's your name?");
        String name = hunger.nextLine();
        
        System.out.println("Hi " + name + " what is your favourite meal?");
        String favMeal = hunger.nextLine();
        System.out.println( name + " Are you still hungry? (Yes/No)");
        String hungry = hunger.nextLine().toLowerCase();//updating the priming input
        
        while (hungry.equals("yes")){
            System.out.println("You can take another bite of " + favMeal);
             System.out.println(name + " Are you still hungry? (Yes/No)");
              hungry = hunger.nextLine().toLowerCase();//updating the priming input
        }
              
              while (!hungry.equals("yes") && !hungry.equals("no")){
                  System.out.println("please select either YES or NO");
                  System.out.println("Hi hi, " + name + " are you hungry ( Yes/No");
                  hungry = hunger.nextLine().toLowerCase();
              }
        
        System.out.println("wena na! You're full");
        hunger.close();
    }
    
}
