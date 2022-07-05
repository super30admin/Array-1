from pip import List
#Time Complexity = O(n)
#Space Complexity = O(1), Because we had to return an array as an output

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        rprod = 1
        length = len(nums)
        left = [0]*length
        for i in range(len(nums)):
            left[i] = rprod
            rprod = rprod * nums[i]
        rsum = 1
        for i in range(len(nums)-2,-1,-1):
            rsum = rsum * nums[i+1]
            left[i] = rsum * left[i]
        return left
            
        