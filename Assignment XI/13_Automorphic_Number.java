/* Write a program to input a number and check if it is an Automorphic number or not.
   An automorphic number is a number whose square ends in the same digits as the number itself.
   Example, 25
   25^2 = 625
   and 5^2 = 25.
*/

import java.util.Scanner;
class Automorphic_Number
{
    public static void main(String Args[])
    {
        try(Scanner input=new Scanner(System.in);)
        {
            System.out.println("Enter a number.");
            int input_number=input.nextInt();
            int length=(String.valueOf(input_number).length());
            int square=(int) Math.pow(input_number,2);
            int last_digits=(square%(int)Math.pow(10,length));
            if(last_digits==input_number)
            {
                System.out.println("The input number "+input_number+" is an automorphic  number.");
            }
            else
            {
                System.out.println("The input number "+input_number+" is not an automorphic  number.");
            }
        }
    }
}