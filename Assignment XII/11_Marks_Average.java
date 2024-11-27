/* The annual examination result of 50 students in a class is tabulated as follows: 
        Roll Number | Subject A | Subject B | Subject C
   Write a program to read the data, calculate and display the following:
   (a) Average marks obtained by all students
   (b) Print the roll number and average marks of the students whose average marks is above 80.
  (c) Print the roll number and avearage marks of the students whose average marks if below 40. 
*/

import java.util.*;
class Marks_Average
{
    public static void main(String Args[])
    {
        try(Scanner input=new Scanner(System.in);)
        {
            int i;
            int subject_a[] = new int[50];
            int subject_b[] = new int[50];
            int subject_c[] = new int[50];
            double average[] = new double[50];
            for(i=0;i<50;i++)
            {
                System.out.print("Roll number "+(i+1)+" in A : ");
                subject_a[i]=input.nextInt();
                System.out.print("Roll number " + (i + 1) + " in B : ");
                subject_b[i] = input.nextInt();
                System.out.print("Roll number " + (i + 1) + " in C : ");
                subject_c[i] = input.nextInt();
                average[i]=(subject_a[i]+subject_b[i]+subject_c[i])/3;
            }
            for(i=0;i<50;i++)
            {
                System.out.println("Average marks of roll number "+(i+1)+" is "+(average[i]));
            }
            System.out.println("The roll numbers which have a average marks of more than 80 are");
            for(i=0;i<50;i++)
            {
                if(average[i]>80)
                {
                    System.out.println(i+1);
                }
            }
            System.out.println("The roll numbers which have a average marks of less than 40 are");
            for (i = 0; i < 50; i++) 
            {
                if (average[i] < 40) 
                {
                    System.out.println(i+1);
                }
            }
        }
    }
}