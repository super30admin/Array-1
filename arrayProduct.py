# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Three line explanation of solution in plain english
    #Result array has length as nums, did the left product (running sum and number at 
    # previous index) and stored in result and did right sum and multiplied with left sum

#Your code here along with comments explaining your approach

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        length = len(nums)
        runningSum = 1
        result = [0] * length
        result[0] = 1
        
        for i in range(1,length):
            runningSum = runningSum * nums[i-1]
            result[i] = runningSum
        #print(result)
        
        runningSum = 1
        for i in reversed(range(length-1)):
            runningSum = runningSum * nums[i+1]
           # print(runningSum, i)
            result[i] = result[i] * runningSum
        
        return result