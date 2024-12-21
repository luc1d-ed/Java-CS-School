import java.util.*;
class Strange
{
    int ele[];
    int capacity;
    int top;

    Strange (int cap)
    {
        capacity = cap;
        top = -1;
        ele = new int[capacity];
    }

    void pushItem(int value)
    {
        if (top == capacity - 1) 
        {
            System.out.println("Strange is full");
            return;
        }
        ele[++top] = value;
    }

    int popItem()
    {
        if (top == -1) 
        {
            System.out.println("Strange is empty. \nReturning 9999");
            return 9999;
        }
        return ele[top--];
    }

    public static void main(String Args[])
    {
        Strange object = new Strange (20);
        try (Scanner input = new Scanner (System.in);)
        {
            while (true)
            {
                System.out.println("------Strange Menu------");
                System.out.println("1. Push item");
                System.out.println("2. Pop item");
                System.out.println("3. Exit");
                System.out.print("Choose an option : ");
                int choice = input.nextInt();
                switch(choice)
                {
                    case 1:
                        for(int i=0;i<20;i++)
                        {
                            System.out.print("Enter an item to push : ");
                            int item = input.nextInt();
                            object.pushItem(item);
                        }
                        break;
                    case 2:
                        System.out.println("Popped item : "+object.popItem());
                        break;
                    case 3:
                        System.out.println("Exiting program...");
                        return;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        }
    }
}

