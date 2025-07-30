#time complexity - o(n)
#space complexity - 0(1)

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if nums == None or len(nums) == None:
            return []

        rsum = 1
        left_product = [1] * len(nums)

        for i in range(1, len(nums)):
            left_product[i] = nums[i - 1] * left_product[i - 1]

        for i in range(len(nums) - 2, -1, -1):
            rsum = rsum * nums[i + 1]
            left_product[i] = left_product[i] * rsum

        return left_product