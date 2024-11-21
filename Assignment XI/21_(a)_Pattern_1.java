/* Write a program to print the following pattern:
    (a) 12345
        12345
        12345
        12345
        12345
*/
class Pattern_1
{
    public static void main(String Args[])
    {
        int count=0;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                System.out.print(j);
                count++;
                if(count%5==0)
                {
                    System.out.print("\n");
                }
            }
        }
    }
}