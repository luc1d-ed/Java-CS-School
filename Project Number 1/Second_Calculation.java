//Write a program to input total time in seconds. Convert it into hours, minutes and seconds.

import java.util.Scanner;
class Second_Calculation
{
     public static void main(String Args[])
     {
         try (Scanner input=new Scanner(System.in);)
         {
            System.out.println("Enter the time you have observed in seconds.");
            int input_time=input.nextInt();//Taking the input in seconds.
            int hours=(input_time/3600);//Gives the number of hours.
            int seconds_left=(input_time%3600);//Give the seconds left after the calculation of hours.
            int minutes=seconds_left/60;//Gives the minutes.
            int seconds=seconds_left%60;//Gives the left seconds.
            System.out.println("The time passed after you started observing is "+hours+" hour(s), "+minutes+" minute(s) and "+seconds+" second(s).");
         }
    }
}