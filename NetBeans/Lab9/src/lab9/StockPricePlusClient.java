/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

/**
 *
 * @author dalu
 */
public class StockPricePlusClient {
    public static void main(String[] args) {
        StockPrice sp1 = new StockPrice("AAPL", "2006-12-1", 91.8, 92.33, 90.1, 91.32, 28395700);
        StockPrice sp2 = new StockPricePlus("AAPL", "2006-12-4", 91.88, 92.05, 90.5, 91.12, 25340600);
        StockPricePlus sp3 = new StockPricePlus("AAPL", "2006-12-5", 91.655, 92.33, 90.87, 91.27, 23672800);
        
        System.out.println(sp1);
        System.out.println(sp2);
        System.out.println(sp3);
        System.out.println(sp3);
        System.out.println(sp3);
        
        System.out.println(StockPricePlus.getTotalPrinted());
    }
}
