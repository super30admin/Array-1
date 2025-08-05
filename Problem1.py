#Time Complexity : O(n)
#Space Complexity : O(1)
#Any problem you faced while coding this : none

#Your code here along with comments explaining your approach
class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        prefix_sum=[0]*len(nums)
        prefix_sum[0]=1 # since the first element prefix is 1
        for i in range(1,len(nums)):
            prefix_sum[i]=prefix_sum[i-1]*nums[i-1] # prefix product of ith element
        
        rp=1  # running product for the suffix sum
        for i in range(len(nums)-2,-1,-1): # backward traversal
            rp=rp*nums[i+1]                # update the variable as we traverse
            prefix_sum[i]=prefix_sum[i]*rp # multiply the value with the prefix product already saved in the array
        
        return prefix_sum