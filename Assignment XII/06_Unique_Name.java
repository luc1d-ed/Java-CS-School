/* Write a program to input a name and check whether it is a unique name or not
 * (A name is said to be unique in which the letters do not repeat)
 */
import java.util.*;
class Unique_Name 
{
    public static void main(String args[])
    {
        try(Scanner in = new Scanner(System.in);)
        {
            System.out.print("Enter a string : ");
            String name = in.nextLine().toUpperCase();
            boolean isUnique = true;
            for (int i = 0; i < name.length(); i++) 
            {
                char ch = name.charAt(i);
                for (int j = i + 1; j < name.length(); j++) 
                {
                    if (ch == name.charAt(j)) 
                    {
                        isUnique = false;
                        break;
                    }
                }
                if (!isUnique)
                {
                    break;
                }
            }
            if (isUnique)
            {
                System.out.println(name+" is a Unique Name.");
            }
            else
            {
                System.out.println(name+" is not a Unique Name.");
            }
        }
    }
}
