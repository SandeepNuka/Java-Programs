package StriversSdeSheet;
/*
 input[7,1,5,3,6,4]
 output=5
 explanation buy on day 2 price=1 and sell on day 5 price is 6
 profit=61=5;
 */
public class bestTimeToBuyAndSellStacks5 {
	public static void main(String[] args) {
	int[] input= {7,6,4,3,1};
	int maxProfit=bestTime(input);
	System.out.print("the maximum profit is : "+maxProfit);
	
	}
public static int bestTime(int[] input) {
	int maxProfit=0;
	int minPrice=Integer.MAX_VALUE;
	int profit=0;
	for(int i=0;i<input.length;i++) {
		if(input[i]<minPrice)
			minPrice=input[i];
		if(input[i]>minPrice) 
		profit=input[i]-minPrice;
		if(profit>maxProfit)
			maxProfit=profit;
		
	}

	
	return maxProfit;
}
}



/*input
7,6,4,3,1
output
the maximum profit is : 0

input
7,1,5,3,6,4
output
the maximum profit is: 5

*/