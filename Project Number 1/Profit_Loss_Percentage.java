//Write a program to input the CP and SP of a product and find the profit or loss percentage.

import java.util.Scanner;
class Profit_Loss_Percentage
{
    public static void main(String Args[])
    {
        try (Scanner input=new Scanner(System.in);)
        {
            System.out.println("What article are you selling?");
            String article_name=input.nextLine();
            System.out.println("What was the cost price(CP) of "+article_name+"? i.e. the amount you paid for buying that article.");
            int cost_price=input.nextInt();
            System.out.println("What was the selling price(SP) of "+article_name+"? i.e. the amount in which you sold.");
            int selling_price=input.nextInt();
            if(cost_price>selling_price)
            {
                int loss = (cost_price-selling_price);
                double loss_percentage = ((double)loss/cost_price)*100;
                System.out.println("You have encountered a loss on selling the product \nLoss: "+loss+"\nLoss percentage: "+loss_percentage+"%");
            }
            else if(cost_price<selling_price)
            {
                int profit = (selling_price-cost_price);
                double profit_percentage = ((double)profit/cost_price)*100;
                System.out.println("You have made some profit on selling the product \nProfit: "+profit+"\nProfit percentage: "+profit_percentage+"%");
            }
            else
            {
                System.out.println("You have neither made any profit or loss on the sale of the product.");
            }
        }
    }
}