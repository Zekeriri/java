package exercise;

public class StockPrice
{
    private String ticker;
    private String date;
    private double open;
    private double high;
    private double low;
    private double close;
    private long volume;
    public String getTicker() {
        return ticker;
    }
    public String getDate() {
        return date;
    }
    public double getOpen() {
        return open;
    }
    public double getHigh() {
        return high;
    }
    public double getLow() {
        return low;
    }
    public double getClose() {
        return close;
    }
    public long getVolume() {
        return volume;
    }
    public double getSpread()
    {
        double spr=high-low;
        return spr;
    }

    public StockPrice (String ticker,String date,double open,double high,double low
            ,double close, long volume)
    {
        this.ticker=ticker;
        this.date=date;
        this.open=open;
        this.high=high;
        this.low=low;
        this.close=close;
        this.volume=volume;

        System.out.println("Stock"+ticker+" "+date+"created.");

    }

    public String toString()
    {
        return "Stock: "+ticker+" date= "+date+" high="+high+" low="+low+" open="+open +
                " close= "+close+" volume="+volume;
    }
}
