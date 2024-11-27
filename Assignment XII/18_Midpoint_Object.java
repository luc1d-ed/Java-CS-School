/* The co-ordinates of a point P on a two dimensional place can be represented by P(x, y) with 'x' as the x co-ordinate and y as the y co-ordinate.
 The co-ordinates of midpoint of two points P1(x1, y1)and P2(x2, y2) 
 can be calculated as P(x, y) where x = (x1 + x2)/2y = (y1 + y2)/2. 
 Design a class with the following details

 Class Name: Point

 Data members/ Instance Variables:
 x : Stores the x co-ordinates
 y : Stores the y co-ordinates

 Member functions
    Point() : Constructor to initialize x = 0, y = 0;
    void readPoint() : Accept the co-ordinates x and y of points
    Point midPoint(Point A, Point B) : Calculates and returns the midpoint of the two points A andB.
    void displayPoint() : Displays the co-ordinates of a point.

 Specify the class Point giving details of the constructor Point(), member functions void readPoint(),Point midPoint(Point, Point) and void displayPoint() along with the main() function to create an object and call the functions accordingly to calculate the midpoint between any two given points. */

import java.util.*;
class Point
{
    int x,y;
    Point()
    {
        x = 0;
        y = 0;
    }
    void readpoint()
    {
        try(Scanner input = new Scanner (System.in);)
        {
            System.out.print("x : ");
            x = input.nextInt();
            System.out.print("y : ");
            y = input.nextInt();
        }
    }
    Point midpoint(Point A, Point B)
    {
        Point answer=new Point();
        answer.x = (A.x + B.x)/2;
        answer.y = (A.y + B.y)/2;
        return(answer);
    }
    void displaypoint()
    {
        System.out.print("x : "+ x);
        System.out.print("y : "+ y);
    }
    public static void main(String Args[])
    {
        Point Point_A = new Point();
        Point Point_B = new Point();
        Point Midpoint = new Point();
        System.out.println("For point A");
        Point_A.readpoint();
        System.out.println("For point B");
        Point_B.readpoint();
        System.out.println("Midpoint of the two points.");
        Midpoint.midpoint(Point_A, Point_B);
        Midpoint.displaypoint();
    }
}