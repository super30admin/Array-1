# Time Complexity : O(N) , we do 2 linear passes of the array
# Space Complexity : O(1) (the return array is not accounted as extra space)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english

# Here we use the approach of pre and post running sum
# for our first pass we calculate the running product of all the elements on the left of the element
# and on our second(reverse) pass, we calculate the product of all elements on the right of the element
# so we would be left with an array with the answer on the respective indices of the elements
# We can do this using 2 arrays for better understanding but we optimized this using a single array
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res = list()
        running_product = 1
        res.append(running_product)
        n = len(nums)
        for i in range(1,n):
            running_product *= nums[i-1]
            res.append(running_product)
        running_product = 1
        for i in reversed(range(0,n-1)):
            running_product *= nums[i+1]
            res[i] *= running_product
        return res