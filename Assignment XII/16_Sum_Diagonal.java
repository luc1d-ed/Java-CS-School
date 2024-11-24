/* Write a program to input the numbers in a 4 x 4 array and display the sum of its left and right diagonals. */

import java.util.*;
class Diagonal_Sum 
{
    public static void main(String[] args) 
    {
        int[][] array = new int[4][4];
        try (Scanner input = new Scanner(System.in)) 
        {
            System.out.println("Enter 4 x 4 array elements:");
            for (int i = 0; i < 4; i++) 
            {
                for (int j = 0; j < 4; j++) 
                {
                    System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                    array[i][j] = input.nextInt();
                }
            }
        }
        int Left_Sum = 0;
        for (int i = 0; i < 4; i++) 
        {
            Left_Sum += array[i][i];
        }
        int Right_Sum = 0;
        for (int i = 0; i < 4; i++) 
        {
            Right_Sum += array[i][3 - i];
        }
        System.out.println("Sum of left diagonal: " + Left_Sum);
        System.out.println("Sum of right diagonal: " + Right_Sum);
    }
}
