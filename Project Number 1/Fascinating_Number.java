/*When a number( 3 digits or more ) is multiplied by 2 and 3, and when both these products are concatenated with the original number, then it results in all digits from 1 to 9 present exactly once. 
  There could be any number of zeros and are ignored. */
//EXAMPLE
/*  Input: 192 
    Output: Yes 
    After multiplication with 2 and 3, and concatenating with original number, resultant number is 192384576 which contains all digits from 1 to 9.
    Input: 853 
    Output: No 
    After multiplication with 2 and 3, and concatenating with original number, the resultant number is 85317062559. In this, number 4 is missing and the number 5 has appeared multiple times.  */

import java.util.Scanner;
class Fascinating_Number
{
    public static void main(String Args[])
    {
        try (Scanner input=new Scanner(System.in);)
        {
            System.out.print("Enter a number: ");
            int input_number=input.nextInt();
            String concat_string="";
            if(input_number<100)
            {
                System.out.println("Please input a three digit number.");
            }
            else
            {
                concat_string=(""+input_number+(input_number*2)+(input_number*3));
            }
            System.out.println(concat_string);
            
        }
    }
}