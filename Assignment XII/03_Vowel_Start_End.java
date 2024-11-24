/* Write a program to input a sentence and find the number of words which begin and end with a vowel; also print those words.


*/

import java.util.Scanner;
class Vowel_Start_End 
{
    public static void main(String Args[])
    {
        try(Scanner input=new Scanner(System.in);)
        {
            System.out.print("Enter a sentence: ");
            String sentence=input.nextLine();
            String words[]=sentence.split(" ",0);
            String vowels = "aeiouAEIOU";
            int length = 0, word_count=0;
            for (String word : words) 
            {
                length = word.length();
                if (vowels.indexOf(word.charAt(0)) != -1 && vowels.indexOf(word.charAt(length - 1)) != -1) 
                {
                    System.out.println(word);
                }
            }
            System.out.println("There are "+word_count+" word(s) present in the sentence which start and end with a vowel.");
        }
    }
}