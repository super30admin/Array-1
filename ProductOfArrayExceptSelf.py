# Time complexity: O(n) where n is the length of the array
# Space complexity: O(n) where n is the length of the array
# Did this run successfully on Leetcode: Yes
# Did you face any problem in solving this: No, I knew this problem

class Solution:
    def productExceptSelf(self, nums):
        if not nums:
            return []
        n = len(nums)
        left, right = [1]*n, [1]*n

        for i in range(1, n):
            left[i] = left[i-1]*nums[i-1]

        for i in range(n-2, -1, -1):
            right[i] = right[i+1]*nums[i+1]

        for i in range(n):
            left[i] = left[i]*right[i]

        return left

solution = Solution()
print(solution.productExceptSelf([1,2,3,4]))
print(solution.productExceptSelf([-1,1,0,-3,3]))