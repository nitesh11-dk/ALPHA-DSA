public class buySellStock{
    public static void buySellStock(int prices[]){
    int bp  =Integer.MAX_VALUE ;
    int maxProfit = 0 ;
    for(int i = 0 ; i < prices.length ; i++){
        if(bp < prices[i]){
            int todayProfit = prices[i] - bp ;
            maxProfit = Math.max(maxProfit, todayProfit);            
        } else {
            bp = prices[i];
        }
    }
    System.out.println("Max Profit : " + maxProfit);

}

    public static void main(String args[]) {
        

        // ? 18  Buy & Sell Stocks
// You are given an array prices where prices[il is the price of a given stock
// on the ith day. You want to maximize your profit by choosing a single day to
// buy one stock and choosing a different day in the future to sell that stock.
// Return the maximum profit you can achieve from this transaction. If you
// cannot achieve any profit, return 0.

buySellStock(new int[]{7,1,5,3,6,4,10});

    }
}