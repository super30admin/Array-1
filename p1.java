// TC: O(n)
// SC: O(1)

// Approach: Prefix array and suffic array.



class Solution {
  public int[] productExceptSelf(int[] nums) {
    int[ ] suf = new int[nums.length];
    suf[nums.length - 1] = nums[nums.length - 1];
    int n = nums.length ;
    for(int i = n-2; i>=0; i--) {
      suf[i] = suf[i+1] * nums[i];
    }
    int[] pre = new int[nums.length];
    pre[0] = nums[0];
    for(int i=1; i<n; i++) {
      pre[i] = pre[i-1] * nums[i];
    }

    int idx = 0;
    int [] ans = new int[nums.length];
    ans[0] = suf[1];
    for(int i=1; i<n; i++) {
      if(i==n-1) {
        ans[i] = pre[i-1];
      }
      else {
        ans[i] = suf[i+1] * pre[i-1];
      }
    }

    return ans;
  }
}