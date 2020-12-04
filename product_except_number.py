'''
Time complexity :O(N)
Space complexity :O(1)
'''

class Solution:
    def productExceptSelf(self, nums):

        array = [None]*len(nums)
        rp = 1
        temp = 1
        for i in range(0,len(nums)):
            rp = rp *temp
            array[i] = rp
            temp = nums[i]

        rp = 1
        temp = 1
        for i in range(len(nums)-1,-1,-1):
            rp = rp *temp
            array[i] = array[i] *rp
            temp = nums[i]

        return array
        

s = Solution()
print(s.productExceptSelf([1,2,3,4]))


        