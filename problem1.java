// Time Complexity: O(n) 
// Space Complexity: O(1) 

// find product of nums to the left first and compute in output array. apply the same for right side. multiplying both gives us the result

class Solution {
    public int[] productExceptSelf(int[] nums) {

        int answer[] = new int[nums.length];
        Arrays.fill(answer, 1);
        int currProd = 1;

        for(int i=0; i<nums.length; i++) {
            answer[i] = answer[i] * currProd;
            currProd = nums[i] * currProd;
        }

        currProd=1;

        for(int i=nums.length-1; i>=0; i--) {
            answer[i] = currProd * answer[i];
            currProd = nums[i] * currProd;
        }

        return answer;
    }
}




