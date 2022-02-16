#TC:O(n) 
#SC:O(1)
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        ans = [ ]
        temp = nums[-1]
        ans.append(1)
        for i in range(1,len(nums)):
            ans.append(ans[i-1]*nums[i-1])
        for i in range(len(nums)-2,-1,-1):
            ans[i] *= temp
            temp *= nums[i]
        return ans
        