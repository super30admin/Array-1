# Time Complexity :
# O (N)

# Space Complexity :
# O(1)

# Did this code successfully run on Leetcode :
#Yes

#We store the running product from the left and the right 
# We then multiply, at each position, the left product and right product to get the multiplication of everuything but the number at the current position

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        result = [0] * len(nums)
        rp = 1
        result[0] =1

        #Left running product
        for i in range(1,len(nums)):
            rp *= nums[i-1]
            result[i] = rp
        rp = 1
        
        #Right running product and final computation by multiplying right running product and left running product
        for i in reversed(range(0,len(nums)-1)):
            rp *= nums[i+1]
            result[i] *= rp
        return result
