public class ShareMarket {
    // https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
        int maxProfit = findMaxProfit(prices);
        System.out.println(maxProfit);
    }

    public static int findMaxProfit(int[] costs){
        int n = costs.length;
        if(n == 0) return 0;

        int maxProfit = 0;
        int min = costs[0];

        for(int i = 1; i < n; i++){
            min = Math.min(min, costs[i]);
            maxProfit = Math.max(maxProfit, costs[i] - min);
        }

        return maxProfit;
    }
}