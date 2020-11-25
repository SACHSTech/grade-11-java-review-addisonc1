package gr11review.part1;
import java.io.*;
/**
* a program that will input a sentence from the user and store 
* it in a String variable called theSentence.  
*@author: Addison Chan
*/
public class Review7{
  public static void main (String[] args)throws Exception{
    //variables
    String strthesentence; 
    int intcount;
    int intacounter;
    int intletters;
    int intnospace;
    int intspaces;
    int intoddcounter;
    //variables state
    intspaces = 0;
    intacounter = 0;

    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
    //sentence
    System.out.println("Enter the sentence");
      strthesentence = keyboard.readLine();

      intletters = strthesentence.length();
      intnospace = strthesentence.replace(" ","").length();
      intspaces = intletters - intnospace;
      
     for(intcount = 0; intcount < strthesentence.length(); intcount++){
       if(strthesentence.charAt(intcount) == 'a'){
        intacounter = intacounter + 1;
       }


     }
     while(intoddcounter = 0; strthesentence){

     }
     System.out.println("total characters in the sentence is "+ intletters);
     System.out.println("total spaces in the sentence is "+ intspaces);
     System.out.println("total letter a's in the sentence is "+ intacounter);
    



  }
}