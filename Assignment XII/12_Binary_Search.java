// Write a program to input 10 numbers in a single dimensional array. Input a number and using Binary Search Technique check whether the number is present in the array or not.
import java.util.*;

class Binary_Search 
{
    public static void main(String Args[]) 
    {
        try (Scanner input = new Scanner(System.in);) 
        {
            int array[] = new int[10];
            int i;
            for (i = 0; i < 10; i++) 
            {
                System.out.print((i + 1) + " element : ");
                array[i] = input.nextInt();
            }
            Arrays.sort(array);
            System.out.print("Enter the number you want to search for : ");
            int search=input.nextInt();
            boolean isPresent=false;
            int low = 0, high = 9;
            while (low <= high) 
            {
                int mid = (low+high) / 2;
                if (array[mid] == search) 
                {
                    System.out.println("The element is present at index " + mid);
                    isPresent=true;
                    break;
                } 
                else if (array[mid] < search) 
                {
                    low = mid + 1;
                }
                else 
                {
                    high = mid - 1;
                }
            }
            if(!isPresent)
            {
                System.out.println("The element is not present in the array.");
            }
        }
    }
}