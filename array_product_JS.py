#Running Time Complexity: O(n)
#Space Complexity: Constant or O(1)
#Successfully Run and Compiled on leetcode
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if nums==None or len(nums)==0:
            return None
        rp = 1
        n = len(nums)
        result = [None for _ in range(len(nums))]
        result[0]=1
        for i in range(1,n):
            rp = rp * nums[i-1]
            result[i] = rp 
        rp = 1
        for i in range(n-2,-1,-1):
            rp = rp * nums[i+1]
            result[i]= result[i]*rp
        return result
        
        