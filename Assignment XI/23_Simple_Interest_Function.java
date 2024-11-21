//  Write a program to input principle, time and rate. Pass it to a parametrized function which returns the amount using simple interest.

import java.util.Scanner;
class Simple_Interest
{
    float SI(int P, float R, float T) 
    {
        float simple_interest=((P*R*T)/100);
        return simple_interest;
    }
    public static void main(String Args[])
    {
        try(Scanner input=new Scanner(System.in);)
        {
            System.out.print("Enter the principle borrowed: ");
            int principle=input.nextInt();
            System.out.print("Enter the rate at which the principle was borrowed: ");
            float rate=input.nextFloat();
            System.out.print("Enter the time alloted in years: ");
            float time=input.nextFloat();
            Simple_Interest object=new Simple_Interest();
            float result=object.SI(principle,rate,time);
            System.out.println("The Simple Interest for the principle of "+principle+" given at the rate of "+rate+" for "+time+" years is "+result);
        }
    }
}
