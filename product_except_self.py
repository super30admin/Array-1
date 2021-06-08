class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        :time complexity: O(n)
        :space complexity: O(n)
        """
        right_product=[0]*len(nums)
        left_product=[0]*len(nums)
        result=[0]*len(nums)
        right_product[-1]=1
        left_product[0]=1
        for i in range(1, len(left_product)):
            left_product[i]=left_product[i-1]*nums[i-1]
        for j in range(len(right_product)-2, -1, -1):
            right_product[j]=right_product[j+1]*nums[j+1]
        for k in range(len(result)):
            result[k]=right_product[k]*left_product[k]
        return result
            
        