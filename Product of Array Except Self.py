class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        #Time Complexity: O(nums)
        #Space Complexity: O(1) // O(nums) for the r_product solution (commented out)
        
        l_product = [None for i in range(len(nums))]
        #r_product = [None for i in range(len(nums))]
        
        l_product[0] = 1
        for i in range(1, len(l_product)):
            l_product[i] = l_product[i - 1] * nums[i - 1]
            
        #r_product[-1] = 1
        #for i in range(len(l_product) - 2, -1, -1):
        #    r_product[i] = r_product[i + 1] * nums[i + 1]
        
        r = 1
        for i in range(len(l_product) - 1, -1, -1):
            l_product[i] *= r
            r *= nums[i]
            
        #return [l_product[i] * r_product[i] for i in range(len(l_product))]
        return l_product