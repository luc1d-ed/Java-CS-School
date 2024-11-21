//Write a program using function overloading to find the area of a rectangle, square and circle.

import java.util.Scanner;
class Area_Rectangle_Square_Circle
{
    int area(int l,int b)
    {
        return (l*b);
    }
    int area(int s)
    {
        return(s*s);
    }
    double area(double r)
    {
        double pi=3.14;
        return (pi*r*r);
    }
    public static void main(String Args[])
    {
        try(Scanner input=new Scanner(System.in);)
        {
            String choice=" ";
            System.out.println("Enter R to find the area of a rectangle.");
            System.out.println("Enter S to find the area of a square.");
            System.out.println("Enter C to find the area of a circle.");
            choice=input.next();
            Area_Rectangle_Square_Circle object=new Area_Rectangle_Square_Circle();
            double result=0;
            switch (choice)
            {
                case "R":
                case "r":
                    System.out.print("Enter the length of the rectangle: ");
                    int length=input.nextInt();
                    System.out.print("Enter the breadth of the rectangle: ");
                    int breadth=input.nextInt();
                    result=object.area(length,breadth);
                    System.out.println("The area of the rectangle with length "+length+" and breadth "+breadth+" is "+result+".");
                break;
                case "S":
                case "s":
                    System.out.print("Enter the length of the side of a square: ");
                    int side=input.nextInt();
                    result=object.area(side);
                    System.out.println("The area of the square with length of the side "+side+" is "+result+".");
                break;
                default:
                    System.out.print("Enter the length of the radius of a circle: ");
                    double radius=input.nextDouble();
                    result=object.area(radius);
                    System.out.println("The area of the circle with length of the radius "+radius+" is "+result+".");
            }
        }
    }
}
