class Solution:
    def productExceptSelf(self, nums):
        if len(nums) == 0 or nums is None:
            return result

        result = [x for x in range(len(nums))]
        # Calculating product from left side
        rp = 1
        result[0] = 1

        for i in range(1, len(nums)):
            rp = rp * nums[i - 1]
            result[i] = rp
        # Calculating product from right side
        rp = 1
        for i in range(len(nums) - 2, -1, -1):
            print(i)
            rp = rp * nums[i + 1]
            result[i] = result[i] * rp

        return result


L = [1, 2, 3, 4]
obj = Solution()
print(obj.productExceptSelf(L))
