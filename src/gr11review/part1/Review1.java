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
  
     System.out.println("What day do you want to print?");
    intday = Integer.parseInt(keyboard.readLine());
    //if statement
        if (intmonth = 1){
			    System.out.println(intday);
		    }else if (intmonth = 2){
			    intday= intday +31;
			    System.out.println(intday);
		    }else if (intmonth = 3){
			    intday= intday + 59;
			    System.out.println(intday);
		    }else if (intmonth = 4){
			    intday= intday +90;
			    System.out.println(intday);
		    }else if (intmonth = 5){
			    intday= intday +120;
			    System.out.println(intday);
		    }else if (intmonth = 6){
			    intday= intday +151;
			    System.out.println(intday);
		    }else if (intmonth = 7){
			    intday= intday +181;
			    System.out.println(intday);
		    }else if (intmonth = 8){
			    intday= intday +212;
			    System.out.println(intday);
		    }else if (intmonth = 9){
			    intday= intday +242;
			    System.out.println(intday);
		    }else if (intmonth = 10){
			    intday= intday +273;
			    System.out.println(intday);
		    }else if (intmonth = 11){
			    intday= intday +303;
			    System.out.println(intday);
		    }else if (intmonth = 12){
			    intday= intday +334;
			    System.out.println(intday);	
		}
     }

}