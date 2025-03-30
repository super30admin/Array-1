// Time Complexity :O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english
//Approach2: 
//1. Left Product Calculation: Create an answer[] array where answer[i] stores product of all elements to the left of i. Start 
//with answer[0]=1, and compute left product using single loop.
//2. Right Product Calculation: Use a variable R to store the product of all elements to the right of each index. Start with R=1, and update 
// it while adjusting answer[] to reflect both left and right products in a single loop.
//3. Final Answer: The answer[] array at each index will now hold the product of all elements except nums[i] without using extra space for right products, achieving 0(n)
//time and O(1) extra space.


// Your code here along with comments explaining your approach


public class problem1approach2 {
    public int[] productExceptSelf(int[] nums){
        int length=nums.length;
        int[] answer=new int[length];

        answer[0] = 1;
        for(int i = 1; i < length; i++){
            answer[i] = answer[i-1]*nums[i-1];
        }

        int right = 1;
        for(int i=length-1; i>=0; i--){
            answer[i] = answer[i] * right;
            right*=nums[i];
        }
        return answer;
    }
}
