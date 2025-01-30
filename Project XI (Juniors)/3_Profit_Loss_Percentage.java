// Write a program to input CP and SP and find profit and loss percentage.

import java.util.Scanner;
class Profit_Loss
{
    public static void main(String Args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the CP : ");
        int CP = in.nextInt();
        System.out.print("Enter the SP : ");
        int SP = in.nextInt();
        if(SP>CP)
        {
            double LP = ((SP-CP)/CP)*100;
            System.out.print("The Loss Percent is : "+LP+"%");
        }
        else
        {
            double PP = ((CP-SP)/CP)*100;
            System.out.print("The Profit Percent is : "+PP+"%");
        }
        in.close();
    }
}