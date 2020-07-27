#Time Complexity O(N)
#Space Complexity O(1) -> not considering res else O(N)
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if not nums or len(nums) == 0:
            return []
        result = [0] * (len(nums))
        rp = 1
        temp = 1
        for i in range(len(nums)):
            rp = rp * temp
            result[i] = rp
            temp = nums[i]

        rp = 1
        temp = 1
        j = len(nums) -1
        while j >= 0:
            rp = rp * temp
            result[j] = result[j] * rp
            temp = nums[j]
            j -=1


        return result
