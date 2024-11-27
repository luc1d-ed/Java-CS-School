// Write a program in java to make various operations in a queue.

import java.util.*;
class Queue_Operations
{
    int rear;
    int front;
    int size;
    int q[];

    Queue_Operations(int n)
    {
        rear = -1;
        front = -1;
        q = new int[n];
        size = n;
    }

    void enqueue(int item)
    {
        if (rear == (size-1))
        {
            System.out.println("Queue Overflow.");
        }
        else
        {
            if(front == -1)
            {
                front = 0;
            }
            rear = rear+1;
            q[rear] = item;
        }
    }

    void dequeue()
    {
        if(front == -1)
        {
            System.out.println("The queue is empty.");
        }
        else
        {
            if(front>rear)
            {
                front = -1;
                rear = -1;
            }
            int dq = q[front];
            front++;
            System.out.println(dq+" dequeued from the queue.");
        }
    }

    void display()
    {
        if (front == -1)
        {
            System.out.println("The queue is empty.");
        }
        else
        {
            System.out.println("Elements of the queue are : ");
            for (int i=front ; i<=rear ; i++ )
            {
                System.out.print(q[i]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String Args[])
    {
        try (Scanner input = new Scanner(System.in);)
        {
            System.out.print("Enter the size of the array : ");
            int s = input.nextInt();
            Queue_Operations object = new Queue_Operations(s);
            while (true)
            {
                System.out.println("\nQueue Operations:");
                System.out.println("1. Enqueue");
                System.out.println("2. Dequeue");
                System.out.println("3. Display Queue");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                int choice = input.nextInt();
                switch (choice)
                {
                    case 1:
                        System.out.print("Enter the element to enqueue: ");
                        int element = input.nextInt();
                        object.enqueue(element);
                        break;
                    
                    case 2:
                        object.dequeue();
                         break;
                    
                    case 3:
                        object.display();
                        break;
                
                    case 4:
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