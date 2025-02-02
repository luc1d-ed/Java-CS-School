/* Write a program to input the number of calls made and find the telephone bills charged at the following rate : 
                            first 100 calls - no charge
                            next 200 calls - 1 INR /call
                            next 200 calls - 1.5 INR /call
                            above 500 calls - 2 INR /call
    Then the customer also has to pay the monthly rental of 150 INR. */

import java.util.Scanner;
class Telephone_Bill
{
    public static void main(String Args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of calls : ");
        int calls = in.nextInt();
        double bill = 0;
        if(calls<=100)
        {
            bill = 150;
        }
        else if(calls>100&&calls<=300)
        {
            bill = (calls-100)+150;
        }
        else if(calls>300&&calls<=500)
        {
            bill = (200*1)+((calls-300)*1.5);
        }
        else
        {
            bill =(200*1)+(200*1.5)+(calls-500)*2;
        }
        System.out.println("Bill amount : "+bill);
        in.close();
    }
}