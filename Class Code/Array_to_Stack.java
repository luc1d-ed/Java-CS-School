import java.util.*;
class Array_to_Stack
{
    int m[];
    int st [];
    int cap;
    int top;

    Array_to_Stack(int n)
    {
        cap = n;
        top = -1;
        m = new int [50];
        st = new int [50];
    }

    void input_marks()
    {
        try (Scanner input = new Scanner (System.in);)
        {
            for (int i = 0;i < 50;i++)
            {
                System.out.print("Enter the marks : ");
                m[i] = input.nextInt();
                Arrays.sort(m);
            }        
            for (int j = 0;j<50;j++)
            {
                pushmarks(m[j]);
            }
        }
    }

    void pushmarks(int v)
    {
        if (top == cap - 1) 
        {
            System.out.println("Not possible");
            return;
        }
        st[++top] = v;
    }
    
    int popmarks()
    {
        if (top == -1) 
        {
            return -9999;
        }
        return st[top--];
    }

    void display()
    {
        for(int i = 0;i <= top;i++)
        {
            System.out.print(st[i]+" ");
        }
    }

    public static void main(String Args[])
    {
        Array_to_Stack object = new Array_to_Stack(50);
        try ( Scanner input = new Scanner (System.in);)
        {
            while (true) 
            {
                System.out.println("1. Input Marks");
                System.out.println("2. Pop Marks");
                System.out.println("3. Display the stack");
                System.out.println("4. Exit");
                int choice = input.nextInt();
                switch (choice)
                {
                    case 1:
                        object.input_marks();                            
                        break;
                    case 2:
                        object.popmarks();
                        break;
                    case 3:
                        object.display();
                        break;
                    case 4:
                        System.out.println("Exiting program....");
                        return;
                    default:
                        System.out.println("Invalid choice!");
                }
            }
        }
    }
}