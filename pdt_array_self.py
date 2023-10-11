# Time Complexity : O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : No

# first compute the left pdt in one array and then in another for loop multiply the elements by the right pdts.
class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        n=len(nums)
        left_arr=[0]*n
        left_arr[0]=1
        rp=1
        
        for i in range(1,len(nums)):
            rp = rp * nums[i-1]
            left_arr[i]=rp
        rp=1
        # print(rp)
        for i in range(n-2, -1, -1):
            # print(i)
            rp = rp*nums[i+1]
            left_arr[i]= left_arr[i]*rp
        return left_arr