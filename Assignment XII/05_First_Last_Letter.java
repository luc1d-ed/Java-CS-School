/*Write a program to input a sentence, develop a menu based upon which print
  (i) Word formed by combining first letters of each word.
  (ii) Word formed by combining the last letters of each word.

  Input: Joe discovered that traffic cones make excellent megaphones
  Output
  Option 1: Jdttcmem
  Option 2: edtcsets

*/

import java.util.*;

class First_Last_Letter 
{
    public static void main(String Args[])
     {
        try (Scanner input = new Scanner(System.in);)
         {
            System.out.print("Enter a sentence: ");
            String sentence = input.nextLine();
            String words[] = sentence.split(" ");
            String new_word = "";
            System.out.println("Please choose from the following: \n(i)Word formed by combining first letters of each word. \n(ii) Word formed by combining the last letters of each word. \nEnter '1' or '2' to validate your choice.");
            int choice = input.nextInt();
            switch (choice)
             {
                case 1:
                    for (String word : words)
                     {
                        new_word += word.charAt(0);
                    }
                    System.out.println("The new word is : "+ new_word);
                    break;
                case 2:
                    for (String word : words) 
                    {
                        System.out.println(word);
                        new_word += word.charAt(word.length() - 1);
                    }
                    System.out.println("The new word is : " + new_word);
                    break;
                default:
                    System.out.println("Please enter either '1' or '2' to continue.");
            }
        }
    }
}