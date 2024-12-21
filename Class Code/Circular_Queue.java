import java.util.Scanner;
class Circular_Queue 
{
    int q[] = new int[20];
    int f, r, size;

    Circular_Queue(int n) 
    {
        for (int i = 0; i < 20; i++) 
        {
            q[i] = 0;
        }
        f = -1;
        r = -1;
        size = n;
    }

    void insertqueue() 
    {
        try (Scanner input = new Scanner(System.in);) 
        {
            if (f == 0 && r == (size - 1) || f == r + 1) 
            {
                System.out.println("Queue Overflow");
            }
            else
            {
                if (f == -1 && r == -1) 
                {
                    f = 0;
                    r = 0;
                }
                else 
                {
                    if (r == (size - 1)) 
                    {
                        r = 0;
                    } 
                    else 
                    {
                        r = r + 1;
                    }
                }
                System.out.print("Enter a number : ");
                int item = input.nextInt();
                q[r] = item;
            }
        }
    }

    void deletequeue() 
    {
        if (f == -1 && r == -1) 
        {
            System.out.println("Queue underflow");
        } 
        else 
        {
            int val = q[f];
            if (f == r) 
            {
                f = r = -1;
            }
            else 
            {
                f = (f + 1) % size;
            }
            System.out.println("Deleted element: " + val);
        }
    }

    public static void main(String Args[]) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the Circular Queue: ");
        int size = scanner.nextInt();
        Circular_Queue queue = new Circular_Queue(size);

        int choice;
        do 
        {
            System.out.println("\nCircular Queue Menu");
            System.out.println("1. Insert Element");
            System.out.println("2. Delete Element");
            System.out.println("3. Quit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) 
            {
                case 1:
                    queue.insertqueue();
                    break;
                case 2:
                    queue.deletequeue();
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } 
        while (choice != 3);
        scanner.close();
    }
}
