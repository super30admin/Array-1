#Time complexity - O(N)
#Space complexity - O(1)
#Did this run in leetcode - yes

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        result = [1]*n
        run = 1
        result[0] = 1
        
        for i in range(1, n):
            run = run * nums[i-1]
            result[i] = run
            
        run = 1
            
        for j in range(n-2, -1, -1):
            run = run * nums[j+1]
            result[j] = run * result[j]
            
        return result
            