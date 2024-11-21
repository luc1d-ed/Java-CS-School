//Write a program to input the marks obtained by a student in three subjects. Pass it to a parametrized function which returns the grade obtained by the student. Call the function in the main function to display the grade obtained.

import java.util.Scanner;
class Student_Grade
{
    char Grade(int m1,int m2,int m3)
    {
        char grade=' ';
        double average=((m1+m2+m3)/3);
        if(average>90)
        {
            grade='A';
        }
        else if(average<90&&average>=80)
        {
            grade='B';
        }
        else if(average<80&&average>=70)
        {
            grade='C';
        }
        else if(average<70&&average>=60)
        {
            grade='D';
        }
        else if(average<60&&average>=40)
        {
            grade='E';
        }
        else
        {
            grade='F';
        }
        return grade;
    }   
    public static void main(String Args[])
    {
        try(Scanner input=new Scanner(System.in);)
        {
            System.out.print("Enter the marks scored by the student in English: ");
            int marks_1=input.nextInt();
            System.out.print("Enter the marks scored by the student in Physics: ");
            int marks_2=input.nextInt();
            System.out.print("Enter the marks scored by the student in Chemistry: ");
            int marks_3=input.nextInt();
            Student_Grade object=new Student_Grade();
            char result=object.Grade(marks_1,marks_2,marks_3);
            System.out.println("The grade obtained by the student is "+result+".");
        }
    }
}