package gr11review.part1;
import java.io.*;
/**
* that asks the user to enter a month number (1 = January, 2 = February etc.) and day and
* then prints the day of the year. Assume that it is not a leap year.
*@author: Addison Chan
*/
public class Review1 {
  public static void main(String[] args)throws Exception{
    // variables
    int intmonth;
    int intday;
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
    intmonth = 0;
    intday = 0;
    // get the days and months
    System.out.println("What month do you want to print?");
    intmonth = Integer.parseInt(keyboard.readLine());
    //("what day of the month do you want to print?");
     
System.out.println("What month do you want to print?");
    intmday = Integer.parseInt(keyboard.readLine());  }
}