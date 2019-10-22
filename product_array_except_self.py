'''

Did it run on leet code: Yes
Time complexity: 0(N)
 
Challenge: Inspiration from 'pivot index' question

Algorithm:

- Left and right are two arrays which will keep product of left and right elements, till
that `ith` position. 
- For result just multiple left[i]*right[i]

'''



class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        left,right = [0]*len(nums),[0]*len(nums)
        left[0],right[-1] = 1,1
        
        for i in range(1,len(nums)):
            left[i] = left[i-1]*nums[i-1]
            right[-1-i]=right[0-i]*nums[0-i]

        
        
        products = [0]*len(nums)
        for i in range(len(nums)):
            products[i] = left[i]*right[i]
        return products