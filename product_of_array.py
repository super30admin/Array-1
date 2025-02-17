class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        result = [1] * n

        l = 1
        for i in range(n):
            result[i] = l
            l *= nums[i]
        r = 1
        for i in range(n -1, -1, -1):
            result[i] *= r
            r *= nums[i]

        return result

#time - o(n)
#space - o(n)
