/* An angle can be measured in degrees and minutes.
    Example: Angle A = 70 degrees and 35 minutes
             Angle B = 50 degrees and 40 minutes
         Now find the sum of these two angles
             Angle C = 70 degrees and 35 minutes + 50 degrees and 40 minutes
                     = 121 degrees and 14 minutes (As 1 degree = 60 minutes)
A class called Angle has been defined to calculate the angle related functions. Some of the functions/ methods are shown below:
Class Name: Angle
Data members/ Instance Variables:
    - dd : Degrees
    - mm : Minutes

Member functions
    - Angle() : Constructor to initialize dd = 0, mm = 0;
    - void readAngle() : To read angle as dd mm;
    - void displayAngle() : To display angle as dd mm;
    - void sumAngle(Angle A, Angle B) : To find sum of the two angles in degrees and minutes.
    - void diffAngle(Angle A, Angle B) : To find the difference between the two angles in degrees and minutes.
  
Specify the class Angle giving details of the constructor, void sumAngle(Angle A, Angle B), void diffAngle(Angle A, Angle B) only. You may assume the other functions are written for you. */

import java.util.*;
class Angle
{
    int dd, mm;

    Angle()
    {
        dd = 0;
        mm = 0;
    }

    void readAngle()
    {
        try(Scanner input = new Scanner(System.in);)
        {
            System.out.print("Enter the angle in degree : ");
            dd = input.nextInt();
            System.out.print("Enter the angle in minutes : ");
            mm = input.nextInt();
        }
    }

    void displayAngle()
    {
        System.out.println("Degree : "+dd);
        System.out.println("Minutes : "+mm);
    }

    void sumAngle(Angle A, Angle B) 
    {
        this.dd = A.dd + B.dd;
        this.mm = A.mm + B.mm;
        if (this.mm >= 60) 
        {
            this.mm = this.mm - 60;
            this.dd = this.dd + 1;
        }
    }

    void diffAngle(Angle A, Angle B) 
    {
        if (A.mm < B.mm) 
        {
            A.dd = A.dd - 1;
            A.mm = A.mm + 60;
        }
        this.dd = A.dd - B.dd;
        this.mm = A.mm - B.mm;
    }

    public static void main(String Args[])
    {
        Angle A = new Angle();
        A.readAngle();
        Angle B = new Angle();
        B.readAngle();

        Angle C = new Angle();
        C.sumAngle(A,B);
        System.out.println("The sum of the two angles is :");
        C.displayAngle();

        Angle D = new Angle();
        D.diffAngle(A,B);
        System.out.println("The difference between the two angles is: ");
        D.displayAngle();
    }
}