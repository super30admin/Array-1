# https://leetcode.com/problems/product-of-array-except-self/description/

class Solution:
    def productExceptSelf(self, nums):
        n = len(nums)
        result = [1]
        for i in range(n - 1):
            result.append(nums[i] * result[i])
        right = 1
        for i in range(n - 1, -1, -1):
            result[i] = result[i] * right
            right = nums[i] * right
        return result


nums = [-1,1,0,-3,3]
sl = Solution()
print(sl.productExceptSelf(nums))