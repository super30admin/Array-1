// Link: https://leetcode.com/problems/merge-sorted-array/submissions/

// Time Complexity: O(M + N)
// Space Complexity: O(1)

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1.length == 0 || nums2.length == 0)
            return;
        
        int p1 = m - 1;
        int p2 = n - 1;
        
        int curr = m + n - 1;
        while(p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[curr] = nums1[p1];
                p1--;
            } else {
                nums1[curr] = nums2[p2];
                p2--;
            }
            
            curr--;
        }
        
        while (p1 >= 0) {
            nums1[curr] = nums1[p1];
            p1--;
            curr--;
        }
        
        while (p2 >= 0) {
            nums1[curr] = nums2[p2];
            p2--;
            curr--;
        }
    }
}