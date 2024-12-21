import java.util.*;
class RingGame
{
    int ring[];
    int max;
    int upper;
    
    RingGame(int m)
    {
        max = m;
        upper = -1;
        ring = new int [max];
    }

    void jump_in(int value)
    {
        if (upper == max - 1) 
        {
            System.out.println("Column is full. Start removing rings");
            return;
        }
        ring[++upper] = value;
    }

    void jump_out()
    {
        if (upper == -1) 
        {
            System.out.println("Congratulations! \nThe game is over.");
        }
        upper--;
    }


    public static void main(String Args[])
    {
        try (Scanner input = new Scanner (System.in);)
        {
            RingGame object = new RingGame(10);
            while (true) 
            {
                System.out.println("1. Jump In");
                System.out.println("2. Jump Out");
                System.out.println("3. Exit");
                int choice = input.nextInt();
                switch (choice)
                {
                    case 1:
                        System.out.print("Enter the value to jump in : ");
                        int value = input.nextInt();
                        object.jump_in(value);
                        break;
                    case 2:
                        object.jump_out();
                        break;
                    case 3:
                        System.out.println("Exiting game....");
                        return;
                    default:
                        System.out.println("Invalid choice!");
                }
            }
        }
    }
}