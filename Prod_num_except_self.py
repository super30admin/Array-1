// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach
#In this problem when calculating the product at a particular index we take the left and right side of the array at that index and multiply #to get the value at that index.so we calculate the running product at  every index in the given array and store it a new array.Now we #traverse from the back of the array and calculate the product from the end to start.This gives us our required output.


class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        out=[]
        out.append(1)
        rsum=1
        for i in range(len(nums)-1):
            rsum=rsum*nums[i]
            out.append(rsum)
        rp=1
        temp=1
        for i in range(len(nums)-2,-1,-1):
            rp=rp*nums[i+1]
            temp=rp*out[i]
            out[i]=temp
        return(out)
        