/*Write a program to input three angles and check whether they form a triangle or not.
If triangle is formed check whether the triangle is
(i) Acute angle triangle
(ii) Right angled triangle
        OR
(iii) Obtuse angled triangle*/

import java.util.Scanner;
class Triangle_Sum_Check
{
    public static void main(String Args[])
    {
         try(Scanner input=new Scanner(System.in);)
         {
            System.out.println("Enter any three angles.");
            System.out.println("Enter the first angle.");
            int angle_1=input.nextInt();
            System.out.println("Enter the second angle.");
            int angle_2=input.nextInt();
            System.out.println("Enter the third angle.");
            int angle_3=input.nextInt();
            if((angle_1+angle_2+angle_3)==180)
            {
                System.out.println("The triangle is possible with the angles "+angle_1+" ,"+angle_2+" and "+angle_3+".");
                if(angle_1<90&&angle_2<90&&angle_3<90)
                {
                    System.out.println("The triangle formed is acute angled triangle.");
                }
                else if(angle_1>90||angle_2>90||angle_3>90)
                {
                    System.out.println("The triangle formed is obtuse angled triangle.");
                }
                else
                {
                    System.out.println("The triangle formed is right angled triangle.");
                }
            }
            else
            {
                System.out.println("The triangle is not possible with the angles "+angle_1+" , "+angle_2+" and "+angle_3);
            }
        }
    }
}