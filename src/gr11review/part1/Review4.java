package gr11review.part1;
import java.io.*;
import java.text.DecimalFormat;
/**
* a program that asks the user how many items he/she would like to purchase. The program then gets the prices for the items one by one. At the end of entering items, print out the total, the tax (13%) and the grand total.
*@author: Addison Chan
*/
public class Review4{
  public static void main (String[] args)throws Exception{
    double dblamount;
    double dblprice;
    double dblsubtotal;
    double dbltax;
    double dbltotal;
    int intcount;
    dblprice =0;

    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("how many items do you want to buy?")
    dblamount = Double.parseDouble(keyboard.readLine());
    for (dblamount == intcount){
      System.out.println("Enter the price for the item"+intcount);
      dblprice = Double.parseDouble
    }
    System.out.println("Subtotal"+dblprice)
    dbltax = dblprice * 0.13;
    System.out.println("tax:"+dbltax)
    dbltotal = dblprice + dbltax
    System.out.println("total:"+dbltotal)
  }
}