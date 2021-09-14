package org.example;
import java.util.Locale;
import java.util.Scanner;
/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dynie Mesoneuvre
 */
public class App 
{
    public static void main( String[] args )
    {
        //IF/ELSE statements using inputs to solve car problems
       Scanner input = new Scanner(System.in);
       System.out.println("Is the car silent when you turn the key?");
       String key = input.nextLine();
       if(key.equals("y")) {
           System.out.println("Are the battery terminals corroded?");
           String battery = input.nextLine();
           if (battery.equals("y")) {
               System.out.println("Clean terminals and try starting again.");
               System.exit(0);
           } else if (battery.equals("n")) {
               System.out.println("Replace cables and try again.");
               System.exit(0);
           }
       }
       if(key.equals("n"))
       {
           System.out.println("Does the car make a slicking noise?");
           String noise = input.nextLine();
           if(noise.equals("y"))
           {
               System.out.println("Replace the battery.");
               System.exit(0);
           }
           else if(noise.equals("n"))
           {
               System.out.println("Does the car crank up but fail to start?");
               String fail = input.nextLine();
               if(fail.equals("y"))
               {
                   System.out.println("Check spark plug connections.");
                   System.exit(0);
               }
               else if(fail.equals("n"))
               {
                   System.out.println("Does the engine start and then die?");
                   String dies = input.nextLine();
                   if(dies.equals("y"))
                   {
                       System.out.println("Does you car have fuel injection?");
                       String fuel = input.nextLine();
                       if(fuel.equals("y"))
                       {
                           System.out.println("Get it in for service.");
                           System.exit(0);
                       }
                       else if(fuel.equals("n"))
                       {
                           System.out.println("Check to ensure the choke is opening and closing.");
                           System.exit(0);
                       }
                   }
                   else if(dies.equals("n"))
                   {
                       System.out.println("This should not be possible.");
                       System.exit(0);
                   }
               }
           }

       }

    }
}
