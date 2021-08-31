# // Time Complexity :O(n) where n is the length of array
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :no


# // Your code here along with comments explaining your approach





class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        # print(nums)
        rp=1
        result=[]
        result.append(1)
        for i in range(1,len(nums)):
            rp=rp*nums[i-1]
            result.append(rp)
        # print(result)
        rp=1
        for i in range(len(nums)-2,-1,-1):
            rp=rp * nums[i+1]
            result[i]=result[i]*rp
        return result
            
            
        