package gr11review.part1;
import java.io.*;
/**
* a program that will input a sentence from the user and store 
* it in a String variable called theSentence.  
*@author: Addison Chan
*/
public class Review8{
  public static void main (String[] args)throws Exception{
    int intnumbers;
    int intfnumbers;
    int intcount;
    int intrandom1;
    int intrandom2;
    int intrandom3;
    int inttriple;

    intnumbers = 9;
    intfnumbers = 0;
    inttriple = 0;
    for (intcount = 0 ; intcount < 999; intcount++){
    intrandom1 = (int)((Math.random() * intnumbers ) + intfnumbers); 
    System.out.print(" \n" + intrandom1);
    
    intrandom2 = (int)((Math.random() * intnumbers) + intfnumbers); 
    System.out.print(" " + intrandom2);

    intrandom3 = (int)((Math.random() * intnumbers) + intfnumbers); 
    System.out.print(" " + intrandom3);
    
    if (intrandom1 == intrandom2 && intrandom2 == intrandom3 ){
      inttriple = inttriple + 1;
    }




    }
    
    System.out.print("\n"+ inttriple);
  }
}