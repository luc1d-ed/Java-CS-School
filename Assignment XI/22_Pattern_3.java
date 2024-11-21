/*Write a program to print the following pattern:
    1   
    12
    123
    1234
    12345
    1234
    123
    12
    1
*/
class Pattern_3
{
    public static void main(String Args[])
    {
        int i,j,k;
        for( i=1;i<=5;i++)
        {
            for(j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
        for(i=4;i>=1;i--)
        {
            for(j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
