class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
      
        result = [1 for i in range(n)]
        

        for i in range(1, n):
            result[i] = nums[i-1] * result[i-1]

        cp = 1
        

        for i in range(n-2, -1, -1):
            cp = nums[i+1] * cp
            result[i] = cp * result[i]
        
        return result


#TC : O(n)
#SC : O(1)
