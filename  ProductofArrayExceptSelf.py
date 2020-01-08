# Time compelxity: O(N)
# Space complexity: O(1) 
# Compiled on leetcode: Yes
# Difficulties faced: No
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        numsLength = len(nums)
        if numsLength == 0 or nums is None:
            return 0
        result = [1]
        rightRunningProduct = 1
        for i in range(numsLength -1):
            result.append(nums[i] * result[-1])
        for i in range(numsLength -1 , -1, -1):
            result[i] *=  rightRunningProduct
            rightRunningProduct *= nums[i]
        return result   