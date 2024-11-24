/* Write a program that asks the user to enter an integer (n). Create an arrays with 'n' elements.
* Ask the user to enter the 'n' double value to populate the array.
* Create another array which stores the square root of the number. Display both the arrays. */
import java.util.*;
class Square_Root
{
    public static void main(String Args[])
    {
        try(Scanner input=new Scanner(System.in);)
        {
            System.out.print("Enter the value for 'n' : ");
            int n=input.nextInt();
            double array[]=new double[n];
            double sqrt[]=new double[n];
            int i;
            for(i=0;i<n;i++)
            {
                System.out.print("Enter the "+(i+1)+" element : ");
                array[i]=input.nextDouble();
                sqrt[i]=Math.sqrt(array[i]);
            }
            for(i=0;i<n;i++)
            {
                System.out.println(array[i]+"\t"+sqrt[i]);
            }
        }
    }
}