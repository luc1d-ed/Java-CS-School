/* Write a program to input the sentence and reprint it after exchanging the first and last words of the sentence.
   Input: Hello how are you
   Output:  you how are Hello
*/

import java.util.*;
class First_Last_Word
{
    public static void main(String Args[])
    {
        try(Scanner input=new Scanner(System.in);)
        {
            System.out.print("Enter a sentence: ");
            String sentence=input.nextLine();
            String words[]=sentence.split(" ",0);
            int array_length=words.length;
            String temporary;
            temporary=words[0];
            words[0]=words[array_length-1];
            words[array_length-1]=temporary;
            for (String word:words)
            {
                System.out.print(word+" ");
            }
        }
    }
}