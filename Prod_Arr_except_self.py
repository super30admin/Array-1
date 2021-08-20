# Time complexity is O(n), space complexity is O(1)

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if not nums or len(nums) == 1: return nums
        lrp , rrp = 1,1
        ans = [1]
        for i in range(1,len(nums)):
            lrp = lrp * nums[i-1]
            ans.append(lrp)
        for i in range(len(nums)-2,-1,-1):
            rrp = rrp * nums[i+1]
            ans[i] = ans[i] *rrp
        return ans
