/* Write a program to input a number and check if it is a Palindrome or not.
   A palindrome number is a number that reads the same forwards and backwards. 
   Example: 12321
*/

import java.util.Scanner;
class Palindrome_Number
{
    public static void main(String Args[])
    {
        try(Scanner input=new Scanner(System.in);)
        {
            System.out.println("Enter a number.");
            int input_number=input.nextInt();
            int store_input_number=input_number;
            int temporary=0,check_number=0;
            int number_digits=(String.valueOf(input_number).length());
            for(int i=1;i<=number_digits;i++)
            {
                temporary=(store_input_number%10);
                check_number=((check_number*10)+temporary);
                store_input_number=store_input_number/10;
            }
            if(check_number==input_number)
            {
                System.out.println(input_number+" is a Palindrome number.");
            }
            else
            {
                System.out.println(input_number+" is not a Palindrome number.");
            }
        }
    }
}