"""
https://leetcode.com/problems/product-of-array-except-self/
 
Time Complexity : O(n) where n is the number of elements in the nums
Space Complexity : O(1) no auxillary data structure is used

Did this code successfully run on Leetcode : Yes

Three line explanation of solution in plain english
1. Th product of any element without including itself means product of numbers to the left of it * product of numbers to the right of tha number
2. Hence we will iterate through the array and calucate the product of numbers to the left of every array elements.
3. Similary we will calculate the product of elements which are right of each number
4. At last we will take product of left and right elements to get the final result

"""
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if len(nums) == 0:
            return
        result = [1] * len(nums)
        runningRightProduct = 1

        #Left Product
        for i in range(1, len(nums)):
            result[i] = result[i-1] * nums[i-1]
        
        #Final Result
        for i in range(len(nums)-2, -1, -1):
            runningRightProduct = nums[i + 1] * runningRightProduct
            result[i] = runningRightProduct * result[i]
             
        
        return result