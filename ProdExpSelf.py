# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes

class Solution(object):
    def productExceptSelf(self, nums):
        if len(nums) == 0:
            return []
        prod_arr = [0] * len(nums)
        rp = 1
        prod_arr[0] = rp
        #creating the array with the product of the elemets present to the left of the currect integer.
        for i in range(1, len(nums)):
            rp = rp * nums[i-1]
            prod_arr[i] = rp
        rp = 1
        #Updating prod_arr with the product of all elements to the right of the current index.
        for i in range(len(nums)-2,-1,-1):
            rp = rp * nums[i+1]
            prod_arr[i] = rp * prod_arr[i]
        return prod_arr
    
obj = Solution()
sol1 = obj.productExceptSelf([1,2,3,4])
print(sol1)
sol2 = obj.productExceptSelf([-1,1,0,-3,3])
print(sol2)
        