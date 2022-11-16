class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        ## TC = O(n)
        ## SC = O(1)
        
        prefix = 1
        postfix = 1
        
        output = [prefix]
        
        for i in range(1, len(nums)):
            prefix *= nums[i-1]
            output.append(prefix)
        
        for i in range(len(nums)-2, -1, -1):
            postfix *= nums[i+1]
            output[i] *= postfix
        

        return output
        