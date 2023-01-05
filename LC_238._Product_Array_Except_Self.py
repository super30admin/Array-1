
#SC -> O(n)
#TC -> o(n)
''' 
We will be doing a left pass and right pass to accomadate all the product. We maintain prev variables to help us to keep track of the number apart from itself. In the end we multiply both left pass and right pass values.

'''
class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        # [1,2,3,4]
        # [1,1,2,6]
        # [24,12,4,1]

        if nums == [] or len(nums) == 0:
            return nums
        
        rProd = 1
        result = [1 for i in range(len(nums))]
        print(result)
        #left pass
        for i in range(1,len(nums)):
            rProd = rProd * nums[i-1]
            result[i] = rProd 
        print(result)
        
        rProd = 1
        prev = 1
        #right pass
        for i in range(len(nums)-1,-1,-1):
            rProd = rProd * prev 
            result[i] = result[i]*rProd
            prev = nums[i]
        print(result)

        return result