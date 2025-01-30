// Write a program to input the total time in seconds. Convert it to hours, minutes and seconds

import java.util.Scanner;
class Time
{
    public static void main(String Args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the time in seconds : ");
        int t_secs = in.nextInt();
        int hrs = t_secs/3600;
        int sec_left = t_secs%3600;
        int min = sec_left/60;
        int sec = sec_left%60;
        System.out.print(hrs +" hours, "+min+" minutes and "+sec+" seconds.");
        in.close();
    }
}