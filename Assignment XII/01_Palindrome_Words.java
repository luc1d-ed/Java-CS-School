/* Write a program to find the number of palindromes present in it, also count the number of palindromes present in it.
   A palindrome word is a word  that is same spelt either forwards or backwards
   Example: wow, racecar
*/

import java.util.Scanner;
class Palindrome_Words
{
    public static void main(String Args[])
    {
        try(Scanner input=new Scanner(System.in);)
        {
            System.out.print("Enter a sentence: ");
            String sentence=input.nextLine().toLowerCase();
            String words[] = sentence.split(" ");
            int count = 0;
            for (String word : words)
            {
                boolean isPalindrome = true;
                for (int i = 0; i < word.length() / 2; i++) 
                {
                    if (word.charAt(i) != word.charAt(word.length() - i - 1)) 
                    {
                        isPalindrome = false;
                        break;
                    }
                }
                if (isPalindrome) 
                {
                    System.out.println(word);
                    count++;
                }
            }
            System.out.println(count + " words in the given sentence are palindrome words.");
        }
    }
}



        

       