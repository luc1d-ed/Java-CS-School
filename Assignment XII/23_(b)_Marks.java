import java.util.*;
class Marks extends Student 
{
    int phy, chem, maths, cs, eng, total;
    double per;

    void readData()
    {
        super.inputData();
        try (Scanner input = new Scanner(System.in);)
        {
            System.out.println("Enter the marks of the given subjects");
            System.out.print("Physics : ");
            phy = input.nextInt();
            System.out.print("Chemistry : ");
            chem = input.nextInt();
            System.out.print("Mathematics : ");
            maths = input.nextInt();
            System.out.print("Computer Science : ");
            cs = input.nextInt();
            System.out.print("English : ");
            eng = input.nextInt();
        }
    }

    void compute()
    {
        total = (phy + chem + maths + cs + eng);
        per = (total/500.0)*100;
    }

    void printData()
    {
        super.printData();
        System.out.println("Physics : " +phy);
        System.out.println("Chemistry : " +chem);
        System.out.println("Mathematics : " +maths);
        System.out.println("Computer Science : " +cs);
        System.out.println("English : " +eng);
        System.out.println("Total : " +total);
        System.out.println("Percentage : " +per);
    }
    
    public static void main(String Args[])
    {
        Marks object = new Marks();
        object.readData();
        object.compute();
        object.printData();
    }
}