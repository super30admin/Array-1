#Time Complexity: O(n)
#Space Complexity: O(n)

class Solution:
    def productExceptSelf(self, nums: list[int]) -> list[int]:
        if nums is None or len(nums) == 0:
            return []

        n = len(nums)
        result = [0] * n
        rp = 1
        result[0] = 1

        for i in range(1, n):
            rp = rp * nums[i - 1]
            result[i] = rp

        rp = 1
        for i in range(n - 2, -1, -1):  
            rp = rp * nums[i + 1]
            result[i] = rp * result[i]

        return result

       
        
      
