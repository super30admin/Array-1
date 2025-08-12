public class Problem1 {
    //Time Complexity:-O(n)
    //Space Complexity:-O(1)
    //Approach:-We can't use division, so we build the answer in two steps:
    //First pass: Store the product of all elements to the left of each index.
    //Second pass (reverse): Multiply with the product of all elements to the right.
    //This gives the product of all elements except the current one, in O(n) time and O(1) extra space (output array not counted).
    public int[] productExceptSelf(int[] nums){
        int n = nums.length;
        int[] answer = new int[n];
        int L = 1;
        for(int i = 0; i < n; i++){
            if(i== 0) answer[i] = nums[i]* L;
            else answer[i] = nums[i]* answer[i -1];
        }
        int R = 1;
        for (int i = n - 1; i > 0; i--) {
            answer[i] = answer[i-1] * R;
            R *= nums[i];
        }
        answer[0] = R;
        return answer;
    }
}
