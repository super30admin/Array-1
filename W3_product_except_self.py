class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:

        result = [0] * len(nums)

        if nums is None:
            return result
        
        # Running product
        rp = 1 
        result[0] = 1

        # left/forward pass
        for i in range(1, len(nums)):
            rp = rp * nums[i-1]
            result[i] = rp
        
        rp = 1

        # Right pass / backward pass
        for i in range(len(nums) - 2, -1, -1):
            rp = rp * nums[i+1]
            result[i] = result[i] * rp

        return result

# Time complexity: O(2n) = O(N)
# Space complexity: O(1)