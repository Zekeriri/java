import exercise.StockPrice;

public class LabStock
{
    public static void main(String[] args)
    {
        StockPrice sp1 = new StockPrice("AAPL", "2006-12-1", 91.8, 92.33, 90.1, 91.32,
                28395700);
        StockPrice sp2 = new StockPrice("AAPL", "2006-12-4", 91.88, 92.05, 90.05, 91.12,
                25340600);
        StockPrice sp3 = new StockPrice("AAPL", "2006-12-5", 91.655, 92.33, 90.87, 91.27,
                23672800);
        double sp1Spr = sp1.getSpread();
        System.out.println("Spread is " + sp1Spr);

        StockPrice[] prices = new StockPrice[3];
        prices[0] = sp1;
        prices[1] = sp1;
        prices[2] = sp1;

        calcLowestOpeningPrice(prices);
    }

    public static void calcLowestOpeningPrice(StockPrice[] prices)
    {
        double lowest = prices[0].getOpen();
        for (int i = 0; i < prices.length; i++)
        {
            if (prices[i].getOpen()<lowest)
            {
                lowest=prices[i].getOpen();
            }
        }
        System.out.println("Lowest opening price is:"+ lowest);

        for (int i=0;i<prices.length;i++)
        {
            System.out.println(prices[i]);
        }
    }
}
