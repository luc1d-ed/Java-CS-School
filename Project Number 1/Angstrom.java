import java.util.Scanner;
class Angstrom_Number
{
    public static void main(String Args[])
    {
        try (Scanner input=new Scanner(System.in);)
        {
            System.out.println("Enter a number: ");
            int input_number=input.nextInt();
            int loop_number=input_number,temporary_number=0,check_number=0;
            while(loop_number!=0)
            {
                temporary_number=(loop_number%10);
                check_number=check_number+(temporary_number*temporary_number*temporary_number);
                
            }
        }
    }
}