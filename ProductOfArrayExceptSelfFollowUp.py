# Time complexity: O(n) m is the rowLength and n is the colLength
# Space complexity: O(1)
# Did this run successfully on Leetcode: Yes
# Did you face any problem in solving this: No, I had seen this problem before

class Solution:
    def productExceptSelf(self, nums):
        if not nums:
            return []
        n = len(nums)
        result = [1]*n
        p = 1
        for i in range(n):
            result[i] = p
            p = p*nums[i]

        p = 1
        for i in range(n-1, -1, -1):
            result[i] = result[i]*p
            p = p*nums[i]

        return result


solution = Solution()
print(solution.productExceptSelf([1, 2, 3, 4]))
print(solution.productExceptSelf([-1, 1, 0, -3, 3]))