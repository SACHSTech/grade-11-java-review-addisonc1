package gr11review.part1;
import java.io.*;
import java.text.DecimalFormat;
/**
* a cash register program similar to the one above, except instead of prompting for the number items,*the user is able to keep entering item prices until the enter 0
*@author: Addison Chan
*/
public class Review6{
  public static void main (String[] args)throws Exception{
    //variables
    double dblitem;
    double dblsubtotal;
    double dbltax;
    double dbltotal;
    double dblprice;
    //intializing variables
    dblprice = 1;
    int intcount;
    intcount = 0;
    dblsubtotal = 0;
    //setting up decimal format and keyboard reader
    DecimalFormat dcm = new DecimalFormat("#.##");
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
    //while loop until you put in 0
    while (dblprice != 0){
      intcount = intcount +1;
      System.out.println("Enter the price for item "+intcount);
      dblprice = Double.parseDouble(keyboard.readLine());
      dblsubtotal = dblprice +dblsubtotal ;

    }
    
    System.out.println("Subtotal " +dblsubtotal);
      dbltax = dblsubtotal * 0.13;
      System.out.println("tax: " +dbltax);
      dbltotal = dblsubtotal + dbltax;
      System.out.println("total: " +dbltotal);
  }
}