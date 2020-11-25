package gr11review.part1;
import java.io.*;
/**
* After the first year $100.00 has been invested and the interest is 2.5/100*100 = $2.50. 
*Thus the amount of money after the first year is now $100.00 + $2.50 = $102.50.
*@author: Addison Chan
*/
public class Review3{
  public static void main (String[] args)throws Exception{
    double dblyearlydepo;
    double dblintrestrate;
    double dbltargetamount;
    double dbltime;
    double dblinvest;
    
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
    dblyearlydepo = 0;
    dblintrestrate = 0;
    dbltargetamount = 0;
    dbltime = 0;
    System.out.println("Enter the yearly invested amount:");
    dblyearlydepo = Integer.parseInt(keyboard.readLine());
    System.out.println("Enter the compound interest rate:");
    dblintrestrate = Integer.parseInt(keyboard.readLine());
    System.out.println("Enter the target amount:");
    dbltargetamount = Integer.parseInt(keyboard.readLine());
      while (dblinvest <= dbltargetamount){
        dblinvest = dblintrestrate/dblyearlydepo * 100;
        dbltime = dbltime + 1;
      }
      System.out.println("The target amoun will be earned in 15 years.");
  }
}
