// Time Complexity : O(m*n), m= number of items, n = capacity
// Space Complexity :O(m*n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english - 

/*
 * https://www.geeksforgeeks.org/0-1-knapsack-problem-dp-10/
 * Given weights and values of n items, put these items in a knapsack of capacity W to get the maximum total value in the knapsack.
 *  In other words, given two integer arrays val[0..n-1] and wt[0..n-1] which represent values and weights associated with n
 *   items respectively. Also given an integer W which represents knapsack capacity, find out the maximum value subset of val[] 
 *   such that sum of the weights of this subset is 
 * smaller than or equal to W. You cannot break an item, either pick the complete item or don’t pick it (0-1 property).
 */
public class Knapsack01 {
	
	static int knapSack(int capacity, int wt[], int val[], int n) {
		int[][] dp = new int[wt.length+1][capacity+1];
		
		//i for items
		for(int i = 1; i< dp.length;i++) {
			//j for capacity
			for (int j = 1; j < dp[0].length; j++) {
				//if current item weight more than current capacity, do not choose item
				if(wt[i-1] > j) {
					dp[i][j] = dp[i-1][j];
				} else {
					// else max between do not choose item and choose item
					dp[i][j] = Math.max(
							//if item choose, val of item added to prev items and capacity reduced by items weight
							val[i-1] + dp[i-1][j - wt[i-1]], 
							
							//if not chosen, no change in capacity, only check in previous items for same capacity
							dp[i-1][j]
							);
				}
			}
		}
		//last element showing max value for all items and given capacity
		return dp[wt.length][capacity];
	}
	
    public static void main(String args[]) 
    { 
        int val[] = new int[] { 60, 100, 120 }; 
        int wt[] = new int[] { 10, 20, 30 }; 
        int capacity = 50; 
        int n = val.length; 
        System.out.println(knapSack(capacity, wt, val, n)); 
    } 
}
