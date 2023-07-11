#Time: O(n)
#Space: O(1)
#any issues faced: nope
#did the code run successfully in leetcode: yes
#Approach:
#product of array except self is product of prefix and suffix products.
#compute the prefix product using the output array 
#compute rolling suffix product by traversing in reverse direction and multiply with the output array which already has prefix products.

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        out = [1 for _ in range(len(nums))]
        prefix, suffix = 1, 1
        for i in range(1, len(nums)):
            prefix *= nums[i-1]
            out[i] = prefix
        for i in range(len(nums)-2, -1, -1):
            suffix *= nums[i+1]
            out[i] *= suffix
        return out