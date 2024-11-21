/* Write a program to input a number and check if it is a Twisted Prime number or not.
A twisted prime number is a prime number whose reverse is also a prime number.
Example: 17
*/

import java.util.Scanner;
class Twisted_Prime
{
    public static void main(String Args[])
    {
        try(Scanner input=new Scanner(System.in);)
        {
            System.out.print("Enter a number: ");
            int input_number=input.nextInt();
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
                int store_input_number=input_number;
                int temporary=0,check_number=0;
                int number_digits=(String.valueOf(input_number).length());
                for(int i=1;i<=number_digits;i++)
                {
                    temporary=(store_input_number%10);
                    check_number=((check_number*10)+temporary);
                    store_input_number=store_input_number/10;
                }
                factor_count=0;
                for(int j=1;j<=check_number;j++)
                {
                    if(check_number%j==0)
                    {
                        factor_count++;
                    }
                }
                if(factor_count==2)
                {
                    System.out.println(input_number+" is a twisted prime number.");
                }
                else
                {
                    System.out.println(input_number+" is not a twisted prime number.");
                }
            }
            else
            {
                System.out.println(input_number+" is not a twisted prime number.");
            }
        }
    }
}