// Time Complexity :O(N) 2 pass
// Space Complexity :O(1) no extra space
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// First calculating the product of all the elements on the left of every element
//Then in second pass calculating the product of all the elements on the right of every element
// For that using running product

// Your code here along with comments explaining your approach

public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {

        if(nums.length == 0 || nums == null){
            return new int[]{};
        }

        int[] answer = new int[nums.length];
        int rproduct = 1;

        answer[0] = 1;

        for(int i = 1; i < nums.length; i++){ // For calculating the left product
            rproduct = rproduct * nums[i-1];
            answer[i] = rproduct;
        }

        rproduct = 1;
        for(int i = nums.length - 2; i >= 0; i-- ){ // For calculating the right product
            rproduct = rproduct * nums[i+1];
            answer[i] = answer[i] * rproduct;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] answer = productExceptSelf(new int[]{1,2,3,4});

        for(int n : answer){
            System.out.println(n);
        }
    }
}
