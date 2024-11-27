// Specify the class WordPile giving the details of the constructor,void pushChar(char c) and char popChar(). The main function and the algorithm need not be written. Write a program in Java for conversion of WordPile into stack.

class WordPile
{
    int top, size;
    char ST[];

    WordPile(int n)
    {
        top = -1;
        size = n;
        ST = new char [size];
    }

    void pushChar(char c)
    {
        if (top == (size-1))
        {
            System.out.println("Overflow.");
        }
        else
        {
            top = top+1;
            ST [top] = c;
            System.out.println(c + " pushed into WordPile.");
        }
    }

    void popChar()
    {
        if (top == -1)
        {
            System.out.println("The stack is empty.");
        }
        else
        {
            char v = ST [top];
            top = top-1;
            System.out.println(v + " character popped from WordPile");
        }
    }
}