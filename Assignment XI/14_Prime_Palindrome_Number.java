/* Write a program to input a number and check if it is a Prime palindrome or not.
   A prime palindrome is a number that is both a prime number and a palindrome.
   Example: 11
*/ 

import java.util.Scanner;
class Prime_Palindrome
{
    public static void main(String Args[])
    {
        try(Scanner input=new Scanner(System.in);)
        {
            System.out.print("Enter a number: ");
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
            boolean palindrome=(check_number==input_number);
            if(palindrome)
            {
                int factor_count=0;
                for(int i=1;i<=input_number;i++)
                {
                    if(input_number%i==0)
                    {
                        factor_count++;
                    }
                }
                if(factor_count==2)
                {
                    System.out.println(input_number+" is a prime palindrome number.");
                }
                else
                {
                    System.out.println(input_number+" is not a prime palindrome number.");
                }
            }
            else
            {
                System.out.println(input_number+" is not a prime palindrome number.");
            }
        }
    }
}