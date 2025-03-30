// Time Complexity :O(N)
// Space Complexity :O(N)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english
// In this approach, we apply: Approach#1: Create a left[] array where left[i] stores the product of all elements to left of i.
//Create a right[] array where a right[i] stores the product of all elements to right of i.
//Final Answer: Multiply left[i] and right[i] to get the product of all elements except nums[i]. 

// Your code here along with comments explaining your approach

public class problem1Approach1 {
    public int[] productExceptSelf(int[] nums){
        int length=nums.length;
        int[] answer = new int[length];

        int[] left= new int[length];
        int[] right= new int[length];

        left[0] = 1;
        for(int i=1; i<length; i++){
            left[i] = left[i-1]*nums[i-1];
        }

        right[length-1] = 1;

        for(int i=length-2; i>=0;i--){
            right[i] = right[i+1]*nums[i+1];
        }

        for(int i=0; i<length;i++){
            answer[i] = left[i] * right[i];
        }

        return answer;

    }


    
}
