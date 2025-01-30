/*Write a program to input the units of electricity consumed and find the electricity bill charged at the following rates:
* Upto 100 units = Rupees 4 per unit
* Next 200 units= Rupees 5 per unit
* Next 200 units = Rupees 6 per unit
* Above 500 units = Rupees 7 per unit
*/

import java.util.Scanner;
class Electricity_Bill
{
    public static void main(String Args[])
    {
        try(Scanner input=new Scanner(System.in);)
        {
            System.out.print("Consumer's name: ");
            String consumer_name=input.nextLine();
            System.out.println("Enter your circle:\n Bokaro\n Chatra\n Deoghar\n Dhanbad\n Dumka\n East Singhbhum\n Garhwa\n Giridih\n Godda\n Gumla\n Hazaribag\n Jamtara\n Khunti\n Koderma\n Latehar\n Lohardaga\n Pakur\n Palamu\n Ramgarh\n Ranchi\n Sahibganj\n Seraikela-Kharsawan\n Simdega\n West Singhbhum");
            String consumer_circle=input.nextLine();
            System.out.print("Units of elctricity consumed: ");
            int consumed_units=input.nextInt();
            if(consumed_units<=100&&consumed_units>0)
            {
                System.out.println("Consumer Name: +"+consumer_name+"\nCircle: "+consumer_circle+"\nConsumed Units: "+consumed_units+"\nBill: "+(consumed_units*4)+" INR.");
            }
            else if(consumed_units>100&consumed_units<=300)
            {
                System.out.println("Consumer Name: +"+consumer_name+"\nCircle: "+consumer_circle+"\nConsumed Units: "+consumed_units+"\nBill: "+(((consumed_units-200)*5)+400)+" INR.");
            }
            else if(consumed_units>300&&consumed_units<=500)
            {
                System.out.println("Consumer Name: +"+consumer_name+"\nCircle: "+consumer_circle+"\nConsumed Units: "+consumed_units+"\nBill: "+(((consumed_units-300)*6)+1400)+" INR.");
            }
            else 
            {
                System.out.println("Consumer Name: +"+consumer_name+"\nCircle: "+consumer_circle+"\nConsumed Units: "+consumed_units+"\nBill: "+(((consumed_units-500)*7)+2600)+" INR.");   
            }
        }
    }
}