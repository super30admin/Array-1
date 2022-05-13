# Time Complexity : O(N) when N is number of elements
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def productExceptSelf(self, nums):
        n = len(nums)
        result, rproduct = [1 for _ in range(n)], [1 for _ in range(n)]
        rproduct[0] = 1
        
        for i in range(1, n):
            rproduct[i] = rproduct[i-1] * nums[i-1]

        for i in range(n - 1, -1, -1):
            if i == len(nums) - 1:
                result[i] = rproduct[i - 1]
            elif i == 0:
                result[i] = rproduct[i + 1]
            else:
                result[i] = rproduct[i - 1] * rproduct[i + 1]
        return result



solution = Solution()
print(f'OUTPUT >> {solution.productExceptSelf([1,2,3,4])}')