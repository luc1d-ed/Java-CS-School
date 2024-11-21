// Write a program to input two numbers and find their HCF and LCM.

import java.util.Scanner;
class HCF_LCM
{
    public static void main(String Args[])
    {
        try(Scanner input=new Scanner(System.in);)
        {
            System.out.println("Enter two numbers.");
            int number_1=input.nextInt();
            int number_2=input.nextInt();
            int HCF=0,LCM=0;
            int product=(number_1*number_2);
            for(int i=1;i<=product;i++)
            {
                if(((number_1%i)==0)&&((number_2%i)==0))
                {
                    HCF=i;
                }
            }
            LCM=(product/HCF);
            System.out.println("The HCF of the numbers "+number_1+" and "+number_2+" is "+HCF);
            System.out.println("The LCM of the numbers "+number_1+" and "+number_2+" is "+LCM);
        }
    }
}