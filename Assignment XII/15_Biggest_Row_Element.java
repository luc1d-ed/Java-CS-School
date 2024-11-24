/* Write a program to input the numbers in a 4 x 5 array and find the biggest element in each row. */

import java.util.*;
class Biggest_Row_Element
{
    public static void main(String Args []) 
    {
        int[][] array = new int[4][5];
        try (Scanner input = new Scanner(System.in)) 
        {
            System.out.println("Enter 4 x 5 array elements:");
            for (int i = 0; i < 4; i++) 
            {
                for (int j = 0; j < 5; j++) 
                {
                    System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                    array[i][j] = input.nextInt();
                }
            }
        }
        int[] maxElements = new int[4];
        for (int i = 0; i < 4; i++) 
        {
            int max = array[i][0];
            for (int j = 1; j < 5; j++) 
            {
                if (array[i][j] > max) 
                {
                    max = array[i][j];
                }
            }
            maxElements[i] = max;
        }
        System.out.println("The biggest element in each row:");
        for (int i = 0; i < 4; i++) 
        {
            System.out.println("Row " + i + ": " + maxElements[i]);
        }
    }
}
