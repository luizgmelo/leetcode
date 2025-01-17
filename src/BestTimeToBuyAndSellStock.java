public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        System.out.println(new BestTimeToBuyAndSellStock().maxProfit(new int []{10,1,5,6,7,1}));
    }

    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        int right = 0;

        while (right < prices.length) {

            int currentPrice = prices[right];

            if (currentPrice < minPrice) {
                minPrice = currentPrice;
            }

            if (currentPrice - minPrice > maxProfit) {
                maxProfit = currentPrice - minPrice;
            }

            right++;
        }

        return maxProfit;
    }
}
