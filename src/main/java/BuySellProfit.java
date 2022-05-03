public class BuySellProfit {
    public static void main(String[] args) {
      int arr[]={3,5,6,2,4,7,9};
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] prices) {
        int maxProfit=0;
        int buyMin=prices[0];

        for(int i=0;i<prices.length;i++){
            if (buyMin>prices[i]){
                buyMin=prices[i];
            }
            int profit=prices[i]-buyMin;
            if(profit>0 && maxProfit<profit)
                maxProfit=profit;
        }
        return maxProfit;
    }
}
