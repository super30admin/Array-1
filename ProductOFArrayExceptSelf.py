class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        # The brute force solution would be to iterate through the array and take the product of all the other elements except that index
        # Brute force Time Complexity: O(n^2)
        # Space Complexity: O(1)
        
        
        result = [0] * len(nums)
        
        for i in range(len(nums)):
            if i == 0:
                result[i] = 1
                rp = 1
            else:
                rp *= nums[i-1]
                result[i] = rp
                
        for i in range(len(nums) - 1, -1, -1):
            if i == len(nums) - 1:
                rp = 1
                result[i] *=  rp
                
            else:
                rp *= nums[i + 1]
                result[i] *= rp
                
            
        return result
    
    # Time Complexity: O(n). It is actually n+n but that will be O(n)
    # Space Complexity: O(1) If we do the computation in the result array without using extra array and return the reuslt array then the space complexity will be O(1)