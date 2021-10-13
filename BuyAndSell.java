package october08;

import java.util.Scanner;

public class BuyAndSell {
	int maxprofit = 0;
	 public int maxProfit(int[] prices) {
	        int maxprofit = 0;
	        int minbuy = Integer.MAX_VALUE;
	        
	        for(int i=0 ; i<prices.length; i++){
	            int current_price = prices[i];
	            if(current_price <minbuy){
	                minbuy = current_price;
	            }
	            int profit = Math.abs(current_price - minbuy);
	                if(profit>maxprofit){
	                    maxprofit= profit;
	                }
	        }
	        return maxprofit;
	    }
	 public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			int[] arr = new int[7];
			System.out.println("Enter the element of the array");
			for(int i=0; i<arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			BuyAndSell obj = new BuyAndSell();
			System.out.println(obj.maxProfit(arr));
	 }
	 

}
