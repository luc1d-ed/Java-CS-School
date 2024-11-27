// Write a program to input 10 numbers in 2 different arrays and find the sum of the 2 arrays and store it in the third array.

import java.util.*;
class Sum_Array
{
    public static void main(String Args[])
    {
        try(Scanner input=new Scanner(System.in);)
        {
            int i;
            int array_1[]=new int[10];
            int array_2[]=new int[10];
            int sum[]=new int[10];
            System.out.println("Enter elements for the first array.");
            for(i=0;i<10;i++)
            {
                System.out.print((i+1)+" element: ");
                array_1[i]=input.nextInt();
            }
            System.out.println("Enter elements for the second array.");
            for(i=0;i<10;i++)
            {
                System.out.print((i+1)+" element: ");
                array_2[i] = input.nextInt();
                sum[i]=array_1[i]+array_2[i];
            }
            System.out.println("The sum of the elements.");
            for(int value:sum)
            {
                System.out.println(value);
            }
        }
    }
}