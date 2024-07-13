public class BestTimeToBuySellStock {
    public static int maxProfit(int[] prices) {
        int result = 0;
        int left = 0;
        int right = 1;
        while(left < prices.length-1 && right < prices.length){
            int l = prices[left];
            int r = prices[right];
            if(l > r){
                left = right;
                right++;
            }else if (result < r - l) {
                result = r - l;
                right++;
            }else{
                right++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{7,1,5,3,6,4};
        BestTimeToBuySellStock.maxProfit(nums);
    }
}
