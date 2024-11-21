/* Write a program to input a two-digit number and check whether it is a special composite number or not.
    A number is defined as a special composite number if the sum and the product of the digits of the number are equal to the original number. 
    Example: 19
    1+9 = 10
    1*9 = 9
    10+9 = 19
    */

import java.util.Scanner;
class Special_Composite_Number
{
    public static void main(String Args[])
    {
        try(Scanner input=new Scanner(System.in);)
        {
            System.out.print("Enter a two digit number to check whether it is a special composite number or not: ");
            int input_number=input.nextInt();
            int tens=(input_number/10);
            int ones=(input_number%10);
            if(((tens+ones)+(tens*ones))==input_number)
            {
                System.out.println("The number provided "+input_number+" is a special composite number.");
            }
            else
            {
                System.out.println("The number provided "+input_number+" is a not special composite number.");
            }
        }
    }
}