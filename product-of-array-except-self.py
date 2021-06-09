# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english

# Your code here along with comments explaining your approach
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        #approach: Create two arrays
        #left array for calculating the product of all the elements to the left
        # left=[]
        # left.append(1)
        # for i in range(1, len(nums)+1):
        #     left.append(left[i-1]*nums[i-1])
        # right array for calculating the product of all the elements to the right
        # right=[1 for i in range(len(nums))]
        # #for i in reversed(range(len(nums)))
        # for i in range(len(nums)-2,-1,-1):
        #     right[i]=right[i+1]*nums[i+1]
        # output=[1 for i in range(len(nums))]
        # for i in range(len(nums)):
        #     output[i]=left[i]*right[i]
        # return output
        
        #approach: Use an output array to maintain left product and use a variable instead of right array
        output=[1 for i in range(len(nums))]
        for i in range(1, len(nums)):
            output[i]=nums[i-1]*output[i-1]
        R=1
        for i in range(len(output)-1,-1,-1):
            output[i]=output[i]*R
            R=R*nums[i]
        return output
        