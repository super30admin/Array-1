## Passed in leet code
# O(2N) -- asymtotically - O(N)
# O(1)


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if len(nums)==0:
            return 0
        rsum = 1
        n = len(nums)
        lprod=[]
        lprod.insert(0,1)
        lprod[0]=1
        for i in range(1, len(nums)):
            rsum = rsum*nums[i-1]
            lprod.append(rsum)
        rp = 1
        print(lprod)
        for i in reversed(range(len(nums)-1)):
            rp = rp*nums[i+1]
            lprod[i]=rp*lprod[i]
        return lprod