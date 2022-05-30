#Time Complexity : O(N)
#Space Complexity : O(N)
#Did this code successfully run on Leetcode : YES

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        ele = 1
        li = [1]
        #left array
        for i in range(1,len(nums)):
            ele = nums[i-1] * ele
            li.append(ele)
        #right array
        ele = 1
        for i in range(len(nums) - 2,-1,-1):
            ele = nums[i+1] * ele
            li[i] = ele * li[i]
            
        return li