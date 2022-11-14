# // Time Complexity : O(n)
# // Space Complexity : O(1)/O(n)
# // Did this code successfully run on Leetcode :
# // Three line explanation of solution in plain english
# Input: [1,2,3,4]
# Output: [24,12,8,6]
# // Your code here along with comments explaining your approach
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        p = 1
        nums1 = [0]*len(nums)
        nums1[0] = 1
        for i in range(1, len(nums)):
            nums1[i] = nums1[i-1] * nums[i-1]
        # print(nums1)
        for j in range(len(nums) - 1, -1, -1):
            nums1[j] = nums1[j] * p
            p = p * nums[j]
        # print(nums1)
        return nums1