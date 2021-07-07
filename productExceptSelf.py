class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        result = [0]*len(nums)
        
        # left
        result[0] = 1
        for i in range(1, len(result)):
            result[i] = result[i-1]*nums[i-1]
            
        # right
        right = 1
        for i in range(len(nums)-1, -1, -1):
            result[i] = result[i]*right
            right = right*nums[i]
        
        return result
        
# TC: O(N) SC: O(1)
# iterating through nums and creating result array. 1st element is 1
# and every other element is the corresponding product with nums' element
# similarly, iterating through right in the result array doing the same thing
# by maintaing a 'right' variable