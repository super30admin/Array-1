class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if nums == [] or len(nums) == 0:
            return [0]
        left = [len(nums)]
        right = [len(nums)]
        
        #left product
        left[0] = 1;
        
        for i in range(1,len(nums)):
            left[i] = left[i-1]*nums[i-1]
            
        #right product
        right[len(nums)-1] = 1;
        
        for i in range(len(nums)-2,0):
            right[i] = right[i-1]*right[i-1]
        
        #right*left
        
        for i in range(len(nums)):
            right[i] = right[i]*left[i]
        
        return right
