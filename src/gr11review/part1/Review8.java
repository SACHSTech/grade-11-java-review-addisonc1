package gr11review.part1;
import java.io.*;
/**
* a program that simulates 1000 pulls of a slot machine, such that 3 random 
*numbers (between 0 and 8) are generated for each pull. 
*Output the result of each pull on a single line (a space separating the 3
* numbers) 
*and the total count of the number times a triple (all 3 numbers equal) was pulled. 
*@author: Addison Chan
*/
public class Review8{
  public static void main (String[] args)throws Exception{
    //variable
    int intnumbers;
    int intfnumbers;
    int intcount;
    int intrandom1;
    int intrandom2;
    int intrandom3;
    int inttriple;
    //variable intial
    intnumbers = 9;
    intfnumbers = 0;
    inttriple = 0;
    //for loop for each roll
    for (intcount = 0 ; intcount < 999; intcount++){
    intrandom1 = (int)((Math.random() * intnumbers ) + intfnumbers); 
    System.out.print(" \n" + intrandom1);
    
    intrandom2 = (int)((Math.random() * intnumbers) + intfnumbers); 
    System.out.print(" " + intrandom2);

    intrandom3 = (int)((Math.random() * intnumbers) + intfnumbers); 
    System.out.print(" " + intrandom3);
    //counting all the same 3rd numbers
    if (intrandom1 == intrandom2 && intrandom2 == intrandom3 ){
      inttriple = inttriple + 1;
    }

    }
    //the same triple numbers calculator
    System.out.print("\n"+ inttriple);
  }
}