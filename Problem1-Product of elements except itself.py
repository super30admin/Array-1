class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        #start with 1
        temp=1
        #running_product
        rp=1
        res=[0]*len(nums)
        #make left array
        #[1 1 2 6]
        for i in range(len(nums)):
            rp=rp*temp
            res[i]=rp
            temp=nums[i]
        
        #make final array in 2 steps:
        #A) make right array similarly and do product of left and right array as result array
        # but it leads to space complexity as O(n)
        #B) O(1) space solution as eventually result array has to be returned
        #directly build products while traversing in reverse direction with left array already built
        temp=1
        rp=1
        for i in range(len(nums)-1,-1,-1):
            rp=rp*temp
            res[i]=res[i]*rp
            temp=nums[i]
        return res
        
        #O(n)
        #O(1)