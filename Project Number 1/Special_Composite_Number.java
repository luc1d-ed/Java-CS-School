/* Write a program to input a two digit number and check whether it is a special composite number or not.
A number is referred as a Special Composite number if the sum and the product of the digits of the number are equal to the original number */
//input datatype as int

import java.util.Scanner;
class Special_composite_number
{
     public static void main(String Args[])
     {
         try (Scanner input=new Scanner(System.in);)
         {
            System.out.println("Enter a two digit number to check if it is a special composite number or not.\nA number is referred as a Special Composite number, \nIf the sum and the product of the digits of the number are equal to the original number.");
            int input_number=input.nextInt();
            if(input_number>=1&&input_number<=99)
            {
                //Splitting the digits
                int tens=input_number%10;
                int ones=input_number/10;
                if(((tens+ones)+(tens*ones))==input_number)
                {
                    System.out.println("The number provided - "+input_number+" is a Special Composite Number.");
                }
                else
                {
                    System.out.println("The number provided - "+input_number+" is not a special composite number.");
                }
            }
            else
            System.out.println("Please enter a two digit number as required.");
        }
    }
}