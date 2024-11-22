/* Write a program to input the basic salary of a person. Find the net payment based on the following addition and deduction.
                        DA=55% of basic
                        HRA=25% of basic
                        PF=18% of basic
    Gross salary=Basic+Da+HRA
    Net pay=Gross salary-PF */
    
    import java.util.Scanner;
    class Person_Salary
    {
        public static void main(String Args[])
        {
            try(Scanner input=new Scanner(System.in);)
            {
                System.out.print("Enter the basic salary of an employee: ");
                double basic_salary=input.nextDouble();
                double DA=(0.55*basic_salary);
                double HRA=(0.25*basic_salary);
                double PF=(0.18*basic_salary);
                double gross_salary=(basic_salary+DA+HRA);
                double payable_salary=(gross_salary-PF);
                System.out.println("The net payment of the employee is "+payable_salary+".");
            }
        }
    }
    