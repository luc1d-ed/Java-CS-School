import java.util.*;
class Student
{
    String name, dob;
    int roll;

    void inputdata()
    {
        try(Scanner input = new Scanner(System.in);)
        {
            System.out.print("Name : ");
            name = input.next();
            System.out.print("Date of birth : ");
            dob = input.next();
            System.out.print("Roll number : ");
            roll = input.nextInt();
            input.nextLine();
        }
    }

    void printdata()
    {
        System.out.println("Name : "+name);
        System.out.println("Roll Number : "+roll);
        System.out.println("Date of Birth : "+dob);
    }
}