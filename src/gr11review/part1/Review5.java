package gr11review.part1;
import java.io.*;
import java.text.DecimalFormat;

/**
* After the first year $100.00 has been invested and the interest is 2.5/100*100 = $2.50. 
*Thus the amount of money after the first year is now $100.00 + $2.50 = $102.50.
*@author: Addison Chan
*/
public class Review5{
  public static void main (String[] args)throws Exception{
    double dblyearlydepo;
    double dblintrestrate;
    double dbltargetamount;
    double dbltime;
    double dblinvest;
    DecimalFormat dcm = new DecimalFormat("#.##");
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
    dbltime = 0;
    dblinvest = 0;

    System.out.println("Enter the yearly invested amount:");
    dblyearlydepo = Double.parseDouble(keyboard.readLine());
    System.out.println("Enter the compound interest rate:");
    dblintrestrate = Double.parseDouble(keyboard.readLine());
    System.out.println("Enter the target amount:");
    dbltargetamount = Double.parseDouble(keyboard.readLine());

      while (dblinvest <= dbltargetamount){
        dblinvest = dblinvest + dblyearlydepo;
        dblinvest = (dblintrestrate/100 * dblinvest) + dblinvest ;
        dbltime = dbltime + 1;
        
      }
      System.out.println("The target amount will be earned in "+dbltime +"years");
  }
}
