import java.util.*;
class Marks extends Student
{
    int p , c, m, cs, e, t;
    double per;
    char g;

    void enterdata()
    {
        super.inputdata();
        try(Scanner input = new Scanner(System.in);)
        {
            System.out.print("Physics : ");
            p = input.nextInt();
            System.out.print("Chemistry : ");
            c = input.nextInt();
            System.out.print("Maths : ");
            m = input.nextInt();
            System.out.print("Computer Science : ");
            cs = input.nextInt();
            System.out.print("English : ");
            e = input.nextInt();
        }
    }

    void compute()
    {
        t = (p+c+m+cs+e);
        per = ((t/500.0)*100);
        if(per>90)
        {
            g = 'A';
        }
        else if(per<90&&per>=80)
        {
            g = 'B';
        }
        else if(per<80&&per>=70)
        {
            g = 'C';
        }
        else if(per<70&&per>=60)
        {
            g = 'D';
        }
        else if(per<60&&per>=40)
        {
            g = 'E';
        }
        else
        {
            g = 'F';
        }
    }

    void displaydata()
    {
        super.printdata();
        System.out.println("Physics : "+p);
        System.out.println("Chemistry : "+c);
        System.out.println("Maths : "+m);
        System.out.println("Computer Science : "+cs);
        System.out.println("English : "+e);
        System.out.println("Total : "+t);
        System.out.println("Grade : "+g);
    }

    public static void main(String Args[])
    {
        Marks object = new Marks();
        object.enterdata();
        object.compute();
        object.displaydata();
    }
}