#Product of Array Except Self
#Time Complexity: O(n)
#Space Complexity: O(1)
#Problem sucessfully accepted in leetcode: yes


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n=len(nums)
        ans = [1]*n
        for i in range (1,n):
            ans[i]=ans[i-1]*nums[i-1]
        suff = 1
        for i in range(n-1,-1,-1):
            ans[i]*=suff
            suff*=nums[i]
        return ans