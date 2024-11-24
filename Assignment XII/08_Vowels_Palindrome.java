/* Using the switch statement, write a menu driven program
 * (i) To input a sentence and count the number of vowels present in it.
 * (ii) To input a word and check if it is palindrome or not.
 */

import java.util.*;
class Vowels_Palindrome
{
    public static void main(String Args[])
    {
        try(Scanner input=new Scanner(System.in);)
        {
            System.out.println("What do you want to do? \n(i) To find the number of vowels present in a sentence. \n(ii) To check whether a word is palindrome or not. \nEnter '1' or '2' to validate your choice.");
            int choice=input.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter a sentence : ");
                    String sentence=input.nextLine();
                    String words[]=sentence.split(" ",0);
                    String vowels="aeiouAEIOU";
                    int vowel_count=0;
                    for(String word:words)
                    {
                        for(int i=0;i<word.length();i++)
                        {
                            if(vowels.indexOf(word.charAt(i))!=-1)
                            {
                                vowel_count++;
                            }
                        }
                    }
                    System.out.println(vowel_count+" vowels are present in the given sentence.");
                    break;
                case 2:
                    System.out.print("Enter a word : ");
                    String word=input.next();
                    String new_word="";
                    for (int i = word.length()-1; i >= 0; i--) 
                    {
                        new_word+=word.charAt(i);
                    }
                    if (new_word.equalsIgnoreCase(word)) 
                    {
                        System.out.println(word+" is a palindrome word.");
                    }
                    else
                    {
                        System.out.println(word+" is not a palindrome word.");
                    }
                    break;
                default:
                    System.out.println("Please enter a valid choice.");
            }
        }       
    }
}