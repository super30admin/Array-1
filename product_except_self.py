class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        output = [1 for _ in range(len(nums))]
        n = len(nums)
        # computing left sum
        running_product = 1
        for i in range(n-1):
            if(i==0):
                output[i] = 1
                running_product *= nums[i]
            else:
                running_product *= nums[i]
            output[i+1] = running_product
            
        #  computing right sum
        running_product = 1
        for i in range(n-1,0,-1):
            running_product *= nums[i]
            output[i-1] *= running_product
            
        return output