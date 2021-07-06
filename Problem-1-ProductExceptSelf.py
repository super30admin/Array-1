class Solution:
    def productExceptSelf(self, nums) :

        length = len(nums)

        left = [0] * length

        left[0] = 1
        for i in range(1, length):
            left[i] = nums[i - 1] * left[i - 1]

        right = 1
        for i in reversed(range(length)):
            left[i] = right * left[i]
            right = right * nums[i]

        return left


sol=Solution()
arr=[1,2,3,4]
print(sol.productExceptSelf(arr))
