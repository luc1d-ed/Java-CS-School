/* Write a program to input the basic salary of a person and find the next payment
                            (i) DA = 55% pf basic
                            (ii) HRA = 25% of basic
                            (iii) PF = 18% of basic
    Gross Salary = Basic + DA + HRA
    Net Pay = Gross Salary - PF */

import java.util.Scanner;
class Basic_Salary
{
    public static void main(String Args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the basic salary : ");
        int bsal = in.nextInt();
        double DA = (55/100)*bsal;
        double HRA = (25/100)*bsal;
        double PF = (18/100)*bsal;
        double gross = bsal+DA+HRA+PF;
        double net = gross-PF;
        System.out.print("The net salary will be : "+net);
        in.close();
    }
}