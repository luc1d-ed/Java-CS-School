/* Write a program to input 10 numbers in a Single Dimensional Array.
 * Using Bubble Sort technique arrange the array in ascending order and display the sorted array.
 * Input a number and using linear search check whether the element is present in the array or not.
 * Use the following methods:
 * (i) void input()
 * (ii) void sort()
 * (iii) void search()
 * (iv) void display()
 * Create a main method and create the object of the class and call other functions.
 */

import java.util.*;
class Bubble_Linear
{
    int number[]=new int[10];
    int search;
    boolean isPresent=false;

    void input()
    {
        try(Scanner input=new Scanner(System.in);)
        {
            int i;
            for(i=0;i<10;i++)
            {
                System.out.print("Enter the "+(i+1)+" number : ");
                number[i]=input.nextInt();
            }
            System.out.print("Enter the number you want to search for : ");
            search=input.nextInt();
        }
    }

    void sort()
    {
        int i,j;
        for (i=0;i<10;i++) 
        {
            for (j=0;j<9-i;j++) 
            {
                if (number[j] < number[j + 1]) 
                {
                    int temporary = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = temporary;
                }
            }
        }
    }

    void search()
    {
        for(int i=0;i<10;i++)
        {
            if(number[i]==search)
            {
                isPresent=true;
            }
        }
    }

    void display()
    {
        System.out.println("The sorted array : ");
        for(int value:number)
        {
            System.out.print(value+" ");
        }
        System.out.println();
        if(isPresent)
        {
            System.out.println("The number you searched for is present in the array.");
        }
        else
        {
            System.out.println("The number you searched for is not present in the array.");
        }
    }

    public static void main(String Args[])
    {
        Bubble_Linear object = new Bubble_Linear();
        object.input();
        object.sort();
        object.search();
        object.display();
    }
}
