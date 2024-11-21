/*Write a program to print the sum of the following series:
	(a) (1/2)+(3/4)+(5/6)...(19/20)
*/
class Series_1
{
    public static void main(String Args[])
    {
        double sum=0.0;
        for(double i=1.0;i<=19.0;i++)
        {
            double j=(i+1.0);
            sum+=(i/j);
        }
        System.out.println(sum);
    }
}