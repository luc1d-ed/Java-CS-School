/*Write a program which will input age of 'n' number of people and find number of people in each of the following category.
(i) Kid (1-12) years
(ii) Teenager (13-19) years
(iii) Adult (20-59)
(iv) Senior citizen 60 years and above
*/

import java.util.Scanner;
class Age_Group
{
    public static void main(String Args[])
    {
        try(Scanner input=new Scanner(System.in);)
        {
            System.out.print("How many people do you have in your mind? ");
            int number_people=input.nextInt();
            int kid_count=0,teenage_count=0,adult_count=0,senior_count=0;
            for(int i=1;i<=number_people;i++)
            {
                System.out.print("Enter the age of the "+i+" person: ");
                int age=input.nextInt();
                if(age<12)
                {
                    kid_count++;
                }
                else if(age>12&&age<20)
                {
                    teenage_count++;
                }
                else if(age>=20&&age<60)
                {
                    adult_count++;
                }
                else
                {
                    senior_count++;
                }
            }
            System.out.println("There are total "+kid_count+" kid(s) among "+number_people+" people.");
            System.out.println("There are total "+teenage_count+" teenager(s) among "+number_people+" people.");
            System.out.println("There are total "+adult_count+" adult(s) among "+number_people+" people.");
            System.out.println("There are total "+senior_count+" senior citizen(s) among "+number_people+" people.");
        }
    }
}