class Solution:
    def productExceptSelf(self, nums):
        n = len(nums)
        result = [0] * n

        rp = 1
        result[0] = 1

        for i in range(1, n):  # left pass
            rp = rp * nums[i - 1]
            result[i] = rp

        #print(result)
        rp = 1

        for i in range(n - 2, -1, -1):  # right pass
            rp = rp * nums[i + 1]
            # print(rp)
            result[i] = result[i] * rp

        return result

nums = [1,2,3,4]
s = Solution()
print(s.productExceptSelf(nums))

# TC  - O(n)
# SC - O(1) auxiliary space