package lab9;
/**
 *
 * @author Erick.Purwanto
 */
public class StockPricePlus extends StockPrice {
    
    private int numPrinted;
    
    private static int totalPrinted = 0;
    
    public StockPricePlus(String ticker, String date, double open,
            double high, double low, double close, long volume) {
        super(ticker, date, open, high, low, close, volume);
        numPrinted = 0;
    }

    public static int getTotalPrinted() {
        return totalPrinted;
    }
    
    @Override
    public String toString() {
        numPrinted++;
        totalPrinted++;
//        System.out.println(totalPrinted);
        return super.toString() + "\nPrinted " + numPrinted + " times";
    }    
    
    public static void main(String[] args) {
        StockPricePlus spp1 = new StockPricePlus("AAPL", "2006-12-1", 91.8, 92.33, 90.1, 91.32, 28395700);
        System.out.println(spp1);
        System.out.println(spp1);
        System.out.println(spp1);
    }
}
