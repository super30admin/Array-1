class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        L, R = [0] * len(nums), [0] * len(nums)
        L[0] = 1
        R[len(nums)-1] = 1
        for i in range(len(nums)):
            if i+1 < len(nums):
                L[i+1] = L[i]*nums[i]
        
                
        for i in range(len(nums)-2,-1,-1):
            R[i] = R[i+1]*nums[i+1]
        
            
        for i in range(len(nums)):
            nums[i] = L[i]*R[i]
            
        return nums

obj = Solution()
print(obj.productExceptSelf([1,2,3,4,5]))