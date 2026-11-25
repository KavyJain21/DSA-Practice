

public class BestTimeForStocks {
    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        int minPrice = Integer.MAX_VALUE;
int maxProfit = 0;
for(int i=0;i<prices.length;i++){
if (prices[i]<minPrice) {
    minPrice=prices[i];
}
int profit=prices[i]-minPrice;
if (profit>maxProfit) {
    maxProfit=profit;
}
}System.out.println(maxProfit);
    }
}


// We use two variables:
// int minPrice = Integer.MAX_VALUE;
// int maxProfit = 0;


// 1. Traverse the array using a for loop.
// 2. Find the minimum price encountered so far.
// 3. Calculate profit: current price - minPrice.
// 4. Update maxProfit if the calculated profit is greater.
// 5. Continue until the array ends.