//Write a program to input twenty number and find the biggest, second biggest and the smallest number among them.

import java.util.Scanner;
import java.util.Arrays;
class Biggest_Smallest_Second_Biggest
{
    public static void main(String Args[])
    {
        try(Scanner input=new Scanner(System.in);)
        {
            System.out.println("Enter twenty numbers");
            int array[]=new int [20];
            for(int i=0;i<=19;i++)
            {
                array[i]=input.nextInt();
            }
            Arrays.sort(array);
            System.out.println("The biggest number is "+array[19]+".");
            System.out.println("The second biggest number is "+array[18]+".");
            System.out.println("The smallest number is "+array[0]+".");
        }
    }
}