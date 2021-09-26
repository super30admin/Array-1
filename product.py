class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        # TC O(n)
        # SC O(1)
        if nums is None or len(nums) == 0:
            return nums
        res = [0] * len(nums)
        res[0] = 1
        rp = 1
        for i in range(1,len(nums) ):
            print(i)
            rp = rp * nums[i - 1]
            res[i] = rp
        rp = 1
        for i in range(len(nums) -2, -1, -1):
            rp = rp * nums[i + 1]
            res[i] = res[i] * rp
            
        return res
