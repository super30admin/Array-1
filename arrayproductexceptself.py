class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        #initializing result array
        result=[0 for i in range(len(nums))]
        rp=1
        temp=1
        #product of left elements to element
        for i in range(0,len(nums)):
            rp=rp*temp
            result[i]=rp
            temp=nums[i]
        temp=1
        rp=1
        #product of left elements and right elements to element
        for i in range(len(nums)-1,-1,-1):
            rp=rp*temp
            result[i]*=rp
            temp=nums[i]
        return result
#Time Complexity: O(n)
#Space Complexity: O(1) excluding result 