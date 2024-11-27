/* A class Student defines student related information such as name, roll number and date of birth while another class Marks defines marks in various subjects, total percentage and grade of the student.

The details of the classes are given below:

Class name : Student

Data members/ Instance Variables
 - String name, DOB : String variables to store name and date of birth of student.
 - int roll_num : Integer variable to store roll number

Member functions
 - void inputData() : To input values of all the data members.
 - void printData() : To display the values of all data members.

Class name : Marks
Data members/ Instance Variables
 - int phy, chem, maths, cs, eng, total, per
 - double per

Member functions
 - void readData() : To read marks in all subjects out of 100
 - void compute() : To find and store total marks, percentage and grade
 - void printData() : To display the details

Specify the class Student with its functions. Using concept of inheritance specify the class marks with its
functions.
Class Marks is derived from class Student. 
*/

import java.util.*;
class Student
{
    String name, DOB;
    int roll_num;

    void inputData()
    {
        try(Scanner input = new Scanner(System.in);)
        {
            System.out.print("Name: ");
            name = input.next();
            System.out.print("Date of birth: ");
            DOB = input.next();
            System.out.print("Roll number: ");
            roll_num = input.nextInt();
            input.nextLine();
        }
    }

    void printData()
    {
        System.out.println("\nName : "+name);
        System.out.println("Date of Birth : "+DOB);
        System.out.println("Roll no. : "+roll_num);
    }
}


