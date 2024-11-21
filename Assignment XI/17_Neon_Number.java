/* Write a program to input a number and check if it is a Neon number or not.
A neon number is a number where the sum of digits of its square is equal to the original number.
Example: 9
9^2 = 81
8 + 1 = 9
*/

import java.util.Scanner;
class Neon_Number
{
    public static void main(String Args[])
    {
        try(Scanner input=new Scanner (System.in);)
        {
            System.out.print("Enter a number: ");
            int input_number=input.nextInt();
            int square=(input_number*input_number);
            int sum=0,temporary=0;
            while(square>0)
            {
                temporary = square % 10;
                sum += temporary;
                square = square / 10;
            }
            if(sum==input_number)
            {
                System.out.println(input_number+" is a Neon number.");
            }
            else
            {
                System.out.println(input_number+" is not a Neon number.");
            }
        }
    }
}