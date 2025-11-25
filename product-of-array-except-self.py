class Solution:
    '''
    TC: O(3n) = O(n)
    SC: O(2n) = O(n)
    Leetcode: solved this problem
    Issue: here we are using more space then required we can optimize this.
    '''
    def productExceptSelf(self, nums):
        res = []
        rp = 1
        n = len(nums)
        left = [1] * n
        right = [1] * n
        for i in range(1, n):
            rp *= nums[i - 1]
            left[i] = rp
        rp = 1
        for i in range(n - 2, -1, -1):
            rp *= nums[i + 1]
            right[i] = rp
        for i in range(n):
            res.append(left[i] * right[i])
        return res

    '''
    TC: O(2n) = O(n)
    SC: O(1)
    Leetcode: Solve this problem
    Issue: Optimized with no issue.
    '''
    def productExceptSelf(self, nums):
        n = len(nums)
        res = [1] * n
        rp = 1
        for i in range(1, n):
            rp *= nums[i - 1]
            res[i] = rp
        rp = 1
        for i in range(n - 2, -1, -1):
            rp *= nums[i + 1]
            res[i] *= rp
        
        return res



s = Solution()
nums = [1,2,3,4]
print(s.productExceptSelf(nums))
nums = [-1,1,0,-3,3]
print(s.productExceptSelf(nums))