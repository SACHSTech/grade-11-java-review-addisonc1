package gr11review.part1;
import java.io.*;
/**
* Allow the user to select an option and react appropriately to the option selection using 
* a switch case structure.
*@author: Addison Chan
*/
public class Review2{
  public static void main (String[] args)throws Exception{
    int intchoice;
	  intchoice = 0;
	  System.out.println("0 - print an joke about your hair");
	  System.out.println("1 - print a joke about your feet");
	  System.out.println("2 - print a joke about your clothes");
	  System.out.println("3 - print a joke about your teacher");
	  System.out.println("Choose an option");
	  intchoice = Integer.parseInt(keyboard.readLine());e   
         
      switch(intchoice){
        case 0:
		  	  System.out.println("How does the man on the moon cut his hair?");
			    System.out.println("Eclipes it!");
			    break;
        case 1:
			    System.out.println("If your nose runs and your feet smell you're built upside down");
		      break;
        case 2:
			    System.out.println("What kind of clothing do Karens wear?");
			    System.out.println(" A lawsuit");
			    break;
        case 3:
		      System.out.println("Why were the teacher's eyes crossed?");
			    System.out.println("She couldn't control her pupils!");
			    break;
        default :
			    System.out.println("Invalid menu option");
			
		}
		
      
  }
}
 