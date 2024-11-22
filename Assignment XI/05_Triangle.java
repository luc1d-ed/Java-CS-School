/*Write a program to input three angles and check whether they form a triangle or not. If triangle is formed then check whether the triangle is:
(i) Acute angled triangle
(ii) Obtuse angled triangle
(iii) Right angled triangle */

import java.util.Scanner;
class Triangle_Check
{
    public static void main(String Args[])
    {
        try(Scanner input=new Scanner(System.in);)
        {
            System.out.println("Enter any three angles.");
            System.out.print("Enter the first angle: ");
            int angle_1=input.nextInt();
            System.out.print("Enter the second angle: ");
            int angle_2=input.nextInt();
            System.out.print("Enter the third angle: ");
            int angle_3=input.nextInt();
            if((angle_1+angle_2+angle_3)==180)
            {
                System.out.println("The triangle is possible with the angles "+angle_1+", "+angle_2+" and "+angle_3+".");
                if(angle_1<90&&angle_2<90&&angle_3<90)
                {
                    System.out.println("The triangle formed is an acute angled triangle.");
                }
                else if(angle_1==90||angle_2==90||angle_3==90)
                {
                    System.out.println("The triangle formed is a right angled triangle");
                }
                else
                {
                    System.out.println("The triangle formed is an obtuse angled triangle.");
                }
            }
            else
            {
                System.out.println("The triangle is not possible with the angles "+angle_1+", "+angle_2+" and "+angle_3+".");
            }
        }
    }
}