/* A super class Detail has been defined to store the details of the customer.
 Define a subclass Bill to compute the monthly telephone charge of the customer as per the chart given below:

 Number of calls Rate
 1 - 100 Only rental charge
 101- 200 60 paise per call + rental charge
 200 - 300 80 paise per call + rental charge
 Above 300 1 rupee per call + rental charge

The details of both classes are given below
Class name : Detail
Data members/ Instance Variables
 - String name : To store the name of the customer
 - String address : To store the address of the customer
 - long tel_no : To store the telephone number of the customer
 - double rental : To store the monthly rental charge

Member functions
 - Detail() : Parametrized constructor to assign values to the data members
 - void show() : To show the details of the customer

Class name : Bill
Data members/ Instance Variables
 - int n : To store the number of phone calls
 - double amt : To store the amount to be paid by the customer

Member functions
 - Bill() : Parametrized constructor to assign values to data members and to initialize amt = 0.0
 - void call() : Calculates the monthly telephone bill as per the charge given above
 - void show() : To display the detail of the customer and amount to be paid.

Specify the class Detail giving details of the constructor() and void show().
Using the concept of inheritance , specify the class Bill giving details of the constructor(), void call() and void
show().
The main function and algorithm need not be written
*/

class Detail
{
    String name, address;
    long tel_no;
    double rental;
    Detail(String n, String a, long t, double r)
    {
        name = n;
        address = a;
        tel_no = t;
        rental = r;
    }
 
    void show()
    {
        System.out.println("Name : "+name);
        System.out.println("Address : "+address);
        System.out.println("Telephone number : "+tel_no);
        System.out.println("Rental Charge : "+rental);
    }
}