/* Write a program which will input a number and check if it's an Armstrong number or not.
    An Armstrong number is a number that is equal to the sum of its own digits raised to the power of the number of digits.
    Example, 153
    1^3 + 5^3 + 3^3 = 153.
*/

import java.util.Scanner;
class Armstrong_Number
{
    public static void main(String Args[])
    {
        try(Scanner input=new Scanner(System.in);)
        {
            System.out.print("Enter a number: ");
            int input_number=input.nextInt();
            int digit=0,store_input_number=input_number,check_number=0;
            int number_digits=(String.valueOf(input_number).length());
            for(int i=1;i<=number_digits;i++)
            {
                digit=(store_input_number%10);
                check_number=check_number+(digit*digit*digit);
                store_input_number=(store_input_number/10);
            }
            if(check_number==input_number)
            {
                System.out.println(input_number+" is an Armstrong Number.");
            }
            else
            {
                System.out.println(input_number+" is not an Armstrong Number.");
            }
        }
    }
}