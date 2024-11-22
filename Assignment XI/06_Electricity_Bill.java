/* Write a program to input the units of electricity consumed and find the electricity bill charged at the following rates:
                Up to 100 units - 4 /unit
                Next 200 units - 5 /unit
                Next 200 units - 6 /unit
                Above 500 units - 7 /unit */

import java.util.Scanner;
class Electricity_Bill
{
    public static void main(String Args[])
    {
        try(Scanner input=new Scanner(System.in);)
        {
            System.out.print("Units of electricity consumed: ");
            int consumed_units=input.nextInt();
            int bill=0;
            if(consumed_units<=100&&consumed_units>=1)
            {
                bill = consumed_units*4;
            }
            else if(consumed_units>100&&consumed_units<=300)
            {
                bill = 400+(consumed_units-100)*5;
            }
            else if(consumed_units>300&&consumed_units<=500)
            {
                bill = 1400+(consumed_units-300)*6;
            }
            else if(consumed_units>500)
            {
                bill = 2600+(consumed_units-500)*7;
                System.out.println(consumed_units-500);
            }
            System.out.println("The bill amount: "+bill);
        }
    }
}

