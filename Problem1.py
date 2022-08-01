# Time complexity : O(n) --> n is the number of elements in the array
# Space complexity : O(1) no extra space other than output array
# Leetcode : Solved and submitted

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        
        if n == 0:
            return 0
        # creating an output array of size n which is the number of elements in the given List
        res = [0 for _ in range(n)]
        
        # we add the first value as 1, coz we start the products with 1 and then multiply the number ahead, and rp is the running sum till that index
        res[0] = 1
        rp = 1
        # left running sum
        # finding the runnng sum till that index, but it doesn't include the value at that index, then fill the value in the res array
        for i in range(1,n):
            rp *= nums[i-1]
            res[i] = rp
            
        # right running sum
        # Finding the right running sum, we then multiply it with the left running sum we got which is store in the res array and update it with the
        # last product value and then return the whole list
        rp = 1
        for j in range(n-2,-1,-1):
            rp *= nums[j+1]
            res[j] *= rp
        
        return res
