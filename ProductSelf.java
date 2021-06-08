// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Traversing the matrix sprially in recursion with four pointer top, bottom, left, right

// Your code here along with comments explaining your approach
class ProductSelf {
    public int[] productExceptSelf(int[] nums) {
        int [] left =new int[nums.length];
        int [] right =new int[nums.length];
        int[] answer = new int[nums.length];
        left[0]=1;
        right[right.length-1]=1;
        for(int i=1;i<left.length;i++){
            left[i]=nums[i-1]*left[i-1];
        }
        
        for(int i=right.length-2;i>=0;i--){
            right[i]=nums[i+1]*right[i+1];
        }
        
        for(int i=0;i<answer.length;i++){
            answer[i]=left[i]*right[i];
        }
        
        return answer;
    }
}