// Write a program to input numbers in a 4 x 4 array, display the array. Replace all the boundary elements with '0' and print the new array. 

import java.util.*;
class Boundary_Replace
{
    public static void main(String Args[])
    {
        try(Scanner input=new Scanner(System.in);)
        {
            int multi_array[][]=new int[4][4];
            int i,j;
            for(i=0;i<4;i++)
            {
                for(j=0;j<4;j++)
                {
                    System.out.print("["+(i)+"] ["+(j)+"]: ");
                    multi_array[i][j]=input.nextInt();
                }
            }
            
            System.out.println("The array");
            for (i = 0; i < 4; i++) 
            {
                for (j = 0; j < 4; j++) 
                {
                    System.out.print(multi_array[i][j]+" ");
                }
                System.out.println();
            }

            for(i=0;i<4;i++)
            {
                for(j=0;j<4;j++)
                {
                    if(i==0||j==0||i==3||j==3)
                    {
                        multi_array[i][j]=0;
                    }
                }
            }

            System.out.println("The boundary elements replaced.");
            for (i = 0; i < 4; i++) 
            {
                for (j = 0; j < 4; j++) 
                {
                    System.out.print(multi_array[i][j]+" ");
                }
                System.out.println();
            }
            
        }
    }
}