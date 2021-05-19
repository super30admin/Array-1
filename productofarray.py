class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        # 1 2 3 4 
        # 1 1 2 6  //left array
        # 24 12 4 1 // right array
        # 24 12 8 6 // left * right array
        
        '''
        TC : O(n)
        SC : O(n)
        keep track of the left and right product and at each index multiply left and right at that point
        
        '''
        
        n = len(nums)
        left_product = [1] * n
        left = 1
        right = 1
        for i in range(n):
            left_product[i] *= left 
            left_product[n-i-1] *= right 
            left = left * nums[i]
            right = right * nums[n-i-1]
        return left_product