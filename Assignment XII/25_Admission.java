/* A class Admission contains the admission number of 100 students. Some of the data members/ member
functions are given below:
Class name: Admission
Data members/ Instance Variables
 - int Ad_no[] : Integer array to store admission number

Member functions
 - Admission() : Constructor to initialize the array elements
 - void fill_Array : To accept element of array and rearrange in ascending order.
 - int binSearch(int l, int u, int v) : To search for particular admission number(v) using binary search and
recursive techniques and return 1 if found and -1 if not found

Specify the class Admission giving details of the constructor, void fill_Array() and int binSearch(int l, int u, int v).
Define the main function and call the functions according to enable the task. 
*/

import java.util.*;
class Admission
{
    int Ad_no[];

    Admission()
    {
        Ad_no = new int[100];
    }

    void fill_array()
    {
        try (Scanner input = new Scanner(System.in);)
        {
            System.out.println("Enter the admission number of the students : ");
            for(int i=0; i<100; i++)
            {
                System.out.print("["+(i+1)+"] : ");
                Ad_no[i] = input.nextInt();
            }
            Arrays.sort(Ad_no);
        }
    }

    int binSearch(int l, int u, int v)
    {
        if (l <= u)
        {
            int mid = l + (u - l) / 2;
            if (Ad_no[mid] == v)
            {
                return 1;
            }
            else if (Ad_no[mid] < v)
            {
                return binSearch(mid + 1, u, v);
            }
            else
            {
                return binSearch(l, mid - 1, v);
            }
        }
        return -1;
    }

    public static void main(String Args[])
    {
        try (Scanner input = new Scanner(System.in);)
        {
            Admission object = new Admission();
            object.fill_array();
            System.out.print("Search for : ");
            int search = input.nextInt();
            int result = object.binSearch(0,99,search);
            if(result == -1)
            {
                System.out.println(search+" is not present.");
            }
            else
            {
                System.out.println(search+" is present.");
            }
        }
    }
}