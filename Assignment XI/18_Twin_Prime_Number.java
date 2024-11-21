/* Write a program to input two numbers and check if they are twin prime numbers or not.
Twin primes are pairs of prime numbers that have a difference of 2. 
Example: (3, 5)
*/

import java.util.Scanner;
class Twin_Prime_Number
{
    public static void main(String Args[])
    {
        try(Scanner input= new Scanner(System.in);)
        {
            System.out.println("Enter two numbers.");
            int input_number_1=input.nextInt();
            int input_number_2=input.nextInt();
            int factor_count_1=0,factor_count_2=0;
            for(int i=1;i<=input_number_1;i++)
            {
                if(input_number_1%i==0)
                {
                    factor_count_1++;
                }
            }
            for(int j=1;j<=input_number_2;j++)
            {
                if(input_number_2%j==0)
                {
                    factor_count_2++;
                }
            }
            if((factor_count_1==2)&&(factor_count_2==2))
            {
                int difference=(input_number_1-input_number_2);
                if(difference==2||difference==-2)
                {
                    System.out.println(input_number_1+" and "+input_number_2+" are twin prime numbers.");
                }
                else
                {
                    System.out.println(input_number_1+" and "+input_number_2+" are not twin prime numbers.");
                }
            }
            else
            {
                System.out.println(input_number_1+" and "+input_number_2+" are not twin prime numbers.");
            }
        }
    }
}