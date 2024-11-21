//Write a program to input total time in seconds. Convert it into hours, minutes and seconds.

import java.util.Scanner;
class Second_Calculation
{
    public static void main(String Args[])
    {
        try(Scanner input=new Scanner(System.in);)
        {
            System.out.println("Enter the time in seconds.");
            int input_time=input.nextInt();
            int hours=(input_time/3600);
            int seconds_left=(input_time%3600);
            int minutes=(seconds_left/60);
            int seconds=(seconds_left%60);
            System.out.println("The converted time is "+hours+" hour(s) "+minutes+" minute(s) and "+seconds+" second(s)");
        }
    }
}