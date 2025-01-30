// Write a program to input three angles. Check whether they form a triangle or not. If triangle is formed check whether it is acute angled, right angled or obtuse angled triangle.

import java.util.Scanner;
class Triangle
{
    public static void main(String Args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three angles");
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int a3 = in.nextInt();
        if((a1+a2+a3)==180)
        {
            System.out.println("The angles can form a triangle.");
            if(a1==90||a2==90||a3==90)
            {
                System.out.println("The triangle formed is a right angled triangle.");
            }
            else if(a1>90||a2>90||a3>90)
            {
                System.out.println("The triangle formed is an obtuse angled triangle.");
            }
            else
            {
                System.out.println("The triangle formed is an acute angled triangle.");
            }
        }
        else
        {
            System.out.println("The angles cannot form a triangle.");
        }
        in.close();
    }
}