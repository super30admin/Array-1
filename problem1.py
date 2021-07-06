class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        output=[1]*len(nums)
        
        for i in range(1,len(nums)):
            output[i]=output[i-1]*nums[i-1]
        cur=1
        for i in range(len(nums)-1,-1,-1):
            output[i]=cur*output[i]
            cur*=nums[i]
        return output
        #https://leetcode.com/problems/product-of-array-except-self/
        #Time: O(n)
        #Space O(1), no extra space
