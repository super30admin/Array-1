#Time complexity : O(n)
#Space complexity : O(1)


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        output = [1]*len(nums)
        left = nums[ 0]
        right = nums[-1]
        
        for i in range(1, len(nums)):
            output[i] = left
            left *= nums[i]
        print(output)
        
        
        for i in range(len(nums)-2,-1,-1):
            output[i] *= right
            right *= nums[i]
            
        return output
