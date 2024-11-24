//Write a program to input a sentence and print those words which do not contain a vowel, also count those words.

import java.util.Scanner;
class Vowel_Count
{
    public static void main(String Args[])
    {
        try(Scanner input=new Scanner(System.in);)
        {
            System.out.println("Enter a sentence.");
            String sentence=input.nextLine();
            String words[]=sentence.split(" ",0);
            String vowels = "aeiouAEIOU";
            int word_count=0;
            for (String word : words) 
            {
                boolean has_Vowel = false;
                for(int i=0;i<word.length();i++)
                {
                    if(vowels.indexOf(word.charAt(i)) != -1)
                    {
                        has_Vowel=true;
                        break;
                    }
                }
                if(!has_Vowel)
                {
                    System.out.println(word);
                    word_count++;
                }
            }
            System.out.println("There are "+word_count+" word(s) present in the sentence which do not contain any vowel.");
        }
    }
}