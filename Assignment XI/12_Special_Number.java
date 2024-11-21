/* Write a program to input a number and check if it is a Special Number or not.
   A special number is defined as a number where the sum of the factorials of its digits is equal to the number itself.
   Example, 145 
   1! + 4! + 5!
   = 1 + 24 + 120
   = 145.
*/

import java.util.Scanner;
class Special_Number
{
    public static void main(String Args[])
    {
        try(Scanner input=new Scanner(System.in);)
        {
            System.out.println("Enter a number.");
            int input_number=input.nextInt();
            int store_input_number=input_number;
            int factorial=1,check_number=0,temporary=0;
            int number_digits=(String.valueOf(input_number).length());
            for(int i=1;i<=number_digits;i++)
            {
                temporary=(store_input_number%10);
                for(int j=1;j<=temporary;j++)
                {
                    factorial=factorial*j;
                }
                check_number=(check_number+factorial);
                store_input_number=(store_input_number/10);
            }
            if(check_number==input_number)
            {
                System.out.println("The number given "+input_number+" is a Special number.");
            }
            else
            {
                System.out.println("The number given "+input_number+" is not a Special number.");
            }
        }
    }
}