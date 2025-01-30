/*Write a program to input the basic salary of a person. Find the net payment based upon the following addition and deduction.
        DA=55% of basic
        HRA=25% of Basic
        PF=18% of Basic
  Gross salary=Basic + DA + HRA
  Net Pay=Gross pay-PF
*/

import java.util.Scanner;
class Person_Salary
{
    public static void main(String Args[])
    {
        try (Scanner input=new Scanner(System.in);)
        {
            System.out.println("Enter your Employee call name at the Shackleton Cooperation.");
            String employee_name=input.nextLine();
            System.out.println("Enter the salary of "+employee_name+" at the Shackleton Cooperation.");
            double basic_salary=input.nextDouble();
            double DA=0.55*basic_salary;
            double HRA=0.25*basic_salary;
            double PF=0.18*basic_salary;
            double gross_salary=(basic_salary+DA+HRA);
            double payable_salary=(gross_salary-PF);
            System.out.println("The payable salary of "+employee_name+" is "+payable_salary);
        }
    }
}