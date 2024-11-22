//Write a program which will input 'n' number of integer data and find sum of all negative data, sum of all positive even data and sum of all positive odd data.

import java.util.Scanner;
class Number_Sum
{
    public static void main(String Args[])
    {
        try(Scanner input=new Scanner(System.in);)
        {
            System.out.println("How many integers are you going to enter?");
            int n=input.nextInt();
            int input_number=0;
            int sum_odd=0,sum_negative=0,sum_positive=0;
            for(int i=1;i<=n;i++)
            {
                System.out.print("Enter the "+i+" term: ");
                input_number=input.nextInt();
                if(input_number>0)
                {
                    if((input_number%2)!=0)
                    {
                        sum_odd=(sum_odd+input_number);
                    }
                    else
                    {
                        sum_positive=(sum_positive+input_number);
                    }
                }
                else
                {
                    sum_negative=(sum_negative+input_number);
                }
            }
            System.out.println("The sum of all the negative numbers entered is "+sum_negative);
            System.out.println("The sum of all the positive numbers entered is "+sum_positive);
            System.out.println("The sum of all the odd numbers entered is "+sum_odd);
        }
    }
}