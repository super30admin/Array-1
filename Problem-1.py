class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:

        if nums is None or len(nums)==0:
            return 0

        res=[0]*len(nums)
        temp=1
        rp=1
        #forward pass
        for i in range(len(nums)):
            rp = rp*temp
            res[i] = rp
            temp=nums[i]

        temp=1; rp=1
        for i in reversed(range(len(nums))):
            rp=rp*temp
            res[i] = res[i]*rp
            temp=nums[i]

        return res

#time compplexity: O(N)
#space: O(1)
