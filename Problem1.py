# // Time Complexity :O(N)
# // Space Complexity :O(N)
# // Did this code successfully run on Leetcode :yes
# // Three line explanation of solution in plain english
# https://leetcode.com/problems/product-of-array-except-self/description/
# // Your code here along with comments explaining your approach
# Here one way is to find product of all elements and then divide that with current number (we should be carefull about 0's) but in problem they mentioned  not to use 
# /
# --
# Other method is to mantain left product sum and right produt sum and multiply them(this requires 3 passes)
# We can optimize more after 1st pass by direclty adding to answer
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        N = len(nums)
        res = [1] * N

        prev = 1
        for i in range(N):
            res[i] *= prev
            prev *= nums[i]

        prev = 1
        for i in range(N-1, -1, -1):
            res[i] *= prev
            prev *= nums[i]

        return res
