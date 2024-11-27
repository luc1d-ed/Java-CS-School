/* An array containing the marks of 50 students in ascending order is to be pushed into the stack. 
   Define a class Array_to_Stack with the following details:
   
   Class Name: Array_to_Stack
   Data members/ Instance Variables
    - int m : To store the marks
    - int st[] : To store stack elements
    - int cap : Maximum capacity of array and stack
    - int top : To point the index of the topmost element of the stack

  Member functions
    - Array_to_Stack (int n) : Parametrized constructor to initialize cap = n and top = -1
    - void inputMarks() : To input marks from the user and store it in the array array[] in ascending order and simultaneously push the marks into the stack st[] by invoking the function pushMarks()
    - void pushMarks(int v) : To push the marks into the stack at top location if possible otherwise display "Not Possible"
    - int popMarks() : To return marks from the stack if possible otherwise return 9999
    - void display() : To display stack element
 
    Specify the class Array_to_Stack giving details of the constructor(int n), void inputMarks(), void pushMarks(), void popMarks() and void display(). 
*/

import java.util.*;
class Array_to_Stack
{
    int m;
    int array[];
    int st[];
    int cap;
    int top;

    Array_to_Stack(int n)
    {
        cap = n;
        top = -1;
        array = new int[n];
        st = new int[n];
    }

    void inputMarks()
    {
        try (Scanner input = new Scanner(System.in);)
        {
            System.out.println("Enter the marks of the students.");
            for (int i =0; i<50; i++)
            {
                System.out.print("Marks for "+ (i+1)+" : ");
                array[i] = input.nextInt();
                input.nextLine();
                pushMarks(array[i]);
            }
            Arrays.sort(st);
        }
    }

    void pushMarks( int v)
    {
        if (top == (cap-1))
        {
            System.out.println("Not Possible.");
        }
        else
        {
            top = top+1;
            st[top] = v;
        }
    }

    void popMarks()
    {
        if (top == -1)
        {
            System.out.println("9999");
        }
        else
        {
            int b = st[top];
            top = top-1;
            System.out.println(b+" popped out of the stack.");
        }
    }

    void display()
    {
        System.out.println("The marks scored by 50 students are : ");
        for(int i=0; i<=top; i++)
        {
            System.out.print((i+1)+ " : "+st[i]+"\n");
        }
    }

    public static void main(String Args[])
    {
        try (Scanner input = new Scanner(System.in);)
        {
            Array_to_Stack object = new Array_to_Stack(50);
            object.inputMarks();
            while(true)
            {
                System.out.println("\nMenu for Array to Stack");
                System.out.println("1.Pop items");
                System.out.println("2.Display Stack");
                System.out.println("3.Exit");
                System.out.print("Enter your choice: ");
                int choice = input.nextInt();
                input.nextLine();
                switch(choice)
                {
                    case 1:
                        object.popMarks();
                    break;
    
                    case 2:
                        object.display();
                    break;
    
                    case 3:
                        System.out.println("Exiting the program.");
                        System.exit(0);
                    break;
                    
                    default:
                        System.out.println("Invalid choice.");
                }
            }
        }
    }
}