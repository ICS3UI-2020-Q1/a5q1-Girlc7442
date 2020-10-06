import java.util.Scanner;

/**
 *
 * @author Cole Girling
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //scanner for user input
    Scanner input = new Scanner(System.in);

    //ask the user for an integer they would like to create a multiplication table for
    System.out.println("Please enter an integer to create a multiplication table for");
    int usernumber = input.nextInt();
    
    //while i is less than 13 this will run
     for(int i = 1; i <= 12; i++){
       //loop action: multiply i and the userNumber
       int times = i * usernumber;
       //loop action: display the times of i and userNumber
       System.out.println(i + " x " + usernumber + " = " + times);
     }
    
  }
}
