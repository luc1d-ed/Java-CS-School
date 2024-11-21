//Write a program to input twenty number and find the biggest, second biggest and the smallest number among them.

import java.util.*;
class Biggest_Second_Biggest_Smallest
{
    public static void main(String args[])
    {
        try(Scanner input=new Scanner(System.in);)
        {
        System.out.print("Enter a number: ");
        int input_number=input.nextInt();
        int smallest=input_number, highest=input_number, second_highest=input_number;
        for(int i=2;i<=20;i++)
        {
            System.out.print("Enter a number: ");
            input_number=input.nextInt();
            if(second_highest==highest && input_number<highest)
            {
                second_highest=input_number;
            }
            if(input_number>highest)
            {
             second_highest=highest;
                highest=input_number;
            }
            if(input_number<highest && input_number>second_highest)
            {
             second_highest=input_number;
            }
            if(input_number<smallest)
            smallest=input_number;
        }
            System.out.println("The highest number is "+highest+".");
            System.out.println("The second highest number is "+second_highest+".");
            System.out.println("The smallest number is "+smallest+".");
        }
    }
}