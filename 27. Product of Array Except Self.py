# Time Complexity: O(n)
# Space Complexity: O(1)

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        result = []
        result.append(1)
        rp = 1
        for i in range(1,len(nums)):
            result.append(rp*nums[i-1])
            rp = result[i]
            
        rp = 1
        for i in range(len(nums)-2, -1, -1):
            rp *= nums[i+1]
            result[i] = result[i] * rp     
        return(result)  