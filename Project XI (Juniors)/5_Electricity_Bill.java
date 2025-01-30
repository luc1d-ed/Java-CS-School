/* Write a program to input the units of electricity consumed and find the electricity bill charged at the following rates :
                            first 100 units - 4 INR/ unit
                            next 200 units - 5 INR/ unit
                            next 300 units - 6 INR/ unit
                            above 400 units - 7 INR/ unit */

import java.util.Scanner;
class Electricity_Bill
{
    public static void main(String Args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the units of electricity consumed : ");
        int units = in.nextInt();
        int bill=0;
        if(units<=100)
        {
            bill = (units*4);
        }
        else if(units>100&&units<=300)
        {
            bill = (100*4)+((units-100)*5);
        }
        else if(units>300&&units<=600)
        {
            bill = (100*4)+(200*5)+((units-300)*6);
        }
        else
        {
            bill = (100*4)+(200*5)+(300*6)+(units-600)*7;
        }
        System.out.print("Bill amount : "+bill);
        in.close();
    }
}