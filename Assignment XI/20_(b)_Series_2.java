/*Write a program to print the sum of the following series:
	(b)1+(1*2)+(1*2*3)...till 10 terms.
*/
class Series_2
{
    public static void main(String Args[])
    {
        int sum=0,previous=1;
        for(int i=1;i<=10;i++) 
        {
            sum+=previous;
            previous+=(previous*i);
        }
        System.out.println(sum);
    }
}