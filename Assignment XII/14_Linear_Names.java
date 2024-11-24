/* Write a program to input 10 names in a Single Dimensional Array.
 * Input a name and using linear search technique check whether the element is present in the array or not.
 */

 import java.util.*;
 class Linear_Names
 {
    public static void main(String Args[])
    {
        try(Scanner input=new Scanner(System.in);)
        {
            String names[]=new String[10];
            int i;
            for(i=0;i<10;i++)
            {
                System.out.print("Enter the "+(i+1)+" name: ");
                names[i]=input.next();
            }
            System.out.print("Write the name you want to search for: ");
            String search=input.next();
            boolean isPresent=false;
            for(i=0;i<10;i++)
            {
                if(search.equalsIgnoreCase(names[i]))
                {
                    isPresent=true;
                }
            }
            if(isPresent)
            {
                System.out.println("The name you searched for "+search+" is present in the array.");
            }
            else
            {
                System.out.println("The name you searched for "+search+" is not present in the array.");
            }

        }
    }
 }