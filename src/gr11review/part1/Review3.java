package gr11review.part1;
import java.io.*;
/**
* a program that prints the odd numbers from 20 to 100 and prints 
* the numbers from 29 to 2 in decreasing order.
*@author: Addison Chan
*/
public class Review3{
  public static void main (String[] args)throws Exception{
    //variables
    int intnumber;
	  int intcountdown;
    //forloop counting up
	    for (intnumber = 21; intnumber <=99; intnumber += 2){
	      System.out.println(intnumber);
	    }
	      System.out.println("----------------");
    //for loop counting down
	    for (intcountdown = 29; intcountdown >=2; intcountdown --){
	      System.out.println(intcountdown);
	  }
  
  
  
  
  }
}