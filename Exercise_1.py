    
    # 238. Product of Array Except Self
    #Time complexity : O(n)
    #Space complexity : O(1)


class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        rp=1
        result = [1]
        for i in range(1, len(nums)):
            rp *= nums[i-1]
            result.append(rp)
        
        rp=1
        for i in range(len(nums)-2, -1, -1):
            # print(i)
            
            rp *= nums[i+1]
            result[i] *= rp
            
        return result