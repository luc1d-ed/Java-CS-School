/*Write a program to print the following pattern:
    (b)5
       54
       543
       5432
       54321
*/
class Pattern_2
{
    public static void main(String Args[])
    {
        for(int i=5;i>=1;i--)
        {
            for(int j=5;j>=i;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}