/*Write a program to input a sentence, develop a menu based upon which print
  (i) Word formed by combining first letters of each word.
  (ii) Word formed by combining the last letters of each word.
*/

import java.util.*;

class First_Last_Letter {
    public static void main(String Args[]) {
        try (Scanner input = new Scanner(System.in);) {
            System.out.println("Enter a sentence.");
            String sentence = input.nextLine();
            String words[] = sentence.split(" ");
            String new_word = "";
            System.out.println(
                    "Please choose from the following: \n(i)Word formed by combining first letters of each word. \n(ii) Word formed by combining the last letters of each word. \nEnter '1' or '2' to validate your choice.");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    for (String word : words) {
                        new_word += word.charAt(0);
                    }
                    System.out.println(
                            "The new word formed after taking only the first letters of the words present in the sentence is : "
                                    + new_word);
                    break;
                case 2:
                    for (String word : words) {
                        new_word += word.charAt(word.length() - 1);
                    }
                    System.out.println(
                            "The new word formed after taking only the last letters of the words present in the sentence is : "
                                    + new_word);
                    break;
                default:
                    System.out.println("Please enter either '1' or '2' to continue.");
            }
        }
    }
}