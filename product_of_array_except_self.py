class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        '''
        Time Complexity: O(N)
        Space Complexity: O(N)
        '''
        l = [1] * len(nums)
        r = [1] * len(nums)
        res = []
        
        # get everything to the left
        for i in range(1, len(nums)):
            l[i] = nums[i-1] * l[i-1]
        
        # get everything to the right
        for i in range(len(nums)-2, -1, -1):
            r[i] = nums[i+1] * r[i+1]
        
        # multiply together
        for i in range(0, len(l)):
            res.append(l[i] * r[i])    
            
        return res