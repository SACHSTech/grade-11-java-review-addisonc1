package gr11review.part1;
import java.io.*;
/**
* Allow the user to select an option and react appropriately to the option selection using 
* a switch case structure.
*@author: Addison Chan
*/
public class Review2{
  public static void main (String[] args)throws Exception{
    int intchoice;
    intchoice = 0;
    System.out.println("Choose a choice");
    System.out.println("0 - print an joke about your hair");
    System.out.println("1 - print a joke about your feet");
    System.out.println("2 - print a joke about your clothes");
    System.out.println("3 - print a joke about your teacher.");
    intchoice = readint(); 
 