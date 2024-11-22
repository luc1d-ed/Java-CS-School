//Write a program which will input the annual income of ten people and find their total and average.

import java.util.Scanner;
class Total_average
{
    public static void main(String Args[])
    {
        try(Scanner input=new Scanner(System.in);)
        {
            int salary=0,total=0;
            for(int i=1;i<=10;i++)
            {
                System.out.print("Enter the salary of the "+i+" person: ");
                salary=input.nextInt();
                total+=salary;
            }
            System.out.println("The total salary of 10 people is "+total+".");
            System.out.println("The average salary of the 10 persons is "+(total/10)+".");
        }
    }
}