# Time Complexity : O(n)
#Space Complexity : O(n)
#// Did this code successfully run on Leetcode :Yes
#First  I will be initialising three arrays of length n and i will be iterating through the array except the first element.For the second array I will be making last element as 1.
#For the resulting array I will be multiplying the first two arrays 
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        length=len(nums)
        L,R,result=[0]*length,[0]*length,[0]*length
        L[0]=1
        for i in range(1,length):
            L[i]=nums[i-1]*L[i-1]
        R[len(nums)-1]=1
        for i in reversed(range(length-1)):
            R[i]=nums[i+1]*R[i+1]
        for i in range(len(nums)):
            result[i]=L[i]*R[i]
        return result