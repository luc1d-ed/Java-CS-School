/* Write a program which will input a number and check whether it is a special number or not.
   (A number is said to be special if the sum of the factorials of the digits is equal to the original number.) 
   Example: 145
*/

import java.util.*;
class Special_Number 
{
    public static void main(String Args[]) 
    {
        try (Scanner input = new Scanner(System.in);) 
        {
            System.out.print("Enter a number: ");
            int input_number = input.nextInt();
            int store_input_number = input_number;
            int factorial, check_number = 0, temporary = 0;
            int number_digits = (String.valueOf(input_number).length());
            for (int i = 0; i < number_digits; i++) 
            {
                temporary = (store_input_number % 10);
                factorial = 1;
                for (int j = 1; j <= temporary; j++) 
                {
                    factorial *=  j;
                }
                check_number += factorial;
                store_input_number = (store_input_number / 10);
                
            }
            if (check_number == input_number) 
            {
                System.out.println(input_number + " is a Special number.");
            }
            else 
            {
                System.out.println(input_number + " is not a Special number.");
            }
        }
    }
}