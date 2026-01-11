class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        result = [0]*len(nums)
        #take the running sum of products. For an integer nums[i] take left running sum and then find its right running sum and multiply them both together.

        #taking the left side running sum
        rp = 1

        for i,num in enumerate(nums):
            result[i] = rp
            rp = num*rp

        #taking the right side running sum
        rp = 1

        for i in range (len(nums)-1, -1, -1):
            result[i] *= rp
            rp *= nums[i]

        return result
    
# Time Complexity: O(N)
# Space Complexity: O(1) if you don't consider the output array, else O(N)