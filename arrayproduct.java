// Time Complexity : o(n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english



// Your code here along with comments explaining your approach

class Solution {
    //
    public int[] productExceptSelf(int[] nums) {

        int length = nums.length;
        int[] answer = new int[length];



        answer[0] = 1;
        for(int i = 1; i<length; i++){
            answer[i] = answer[i-1]* nums[i-1];
        }

        int right = 1;
        for(int i = length-1; i>=0; i--){
            answer[i] = answer[i]*right;
            right*=nums[i];
        }

        return answer;


    }
}

public class arrayproduct{
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 34, 12};
        Solution solu = new Solution();
        int[] res = solu.productExceptSelf(new int[]{1, 2, 3, 4});

        for(int value : res){
            System.out.print(value +",");
        }
    }
}