class Bill extends Detail
{
    int n;
    double amt;
    Bill(String nam, String add, long tel, double ren, int call)
    {
        super(nam,add,tel,ren);
        n = call;
        amt = 0.0;
    }

    void call()
    {
        if(n>=1 && n<=100)
        {
            amt = rental;
        }
        else if (n>=101 && n<=200)
        {
            amt = (0.6*n)+rental;
        }
        else if (n>=200 && n<=300)
        {
            amt = (0.8*n)+rental;
        }
        else
        {
            amt = n + rental;
        }
    }

    void show()
    {
        super.show();
        System.out.println("The amount to be paid by the customer :"+amt);
    }
}