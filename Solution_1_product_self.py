// Time Complexity : O(n) 
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
'''
1. Get right product value for each element until element.
   element not included
2. Do the same for left
3. Multiply the  arrays for the result.

'''



class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        r=[1  for i in range(0,len(nums))]
        l=[1  for i in range(0,len(nums))]

        for i in range(1,len(nums)):
            r[i]=r[i-1]*nums[i-1]
        for j in range(len(nums)-2,-1,-1):
            l[j]=l[j+1]*nums[j+1]

        for i in range(0,len(nums)):
            r[i]=r[i]*l[i]
        return r
		
		
// Time Complexity : O(n) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
'''
1. Get right product value for each element until element.
   element not included
2. Do the same for left
3. Multiply the  arrays for the result.

'''



class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        r=[1  for i in range(0,len(nums))]
        l=[1  for i in range(0,len(nums))]

        for i in range(1,len(nums)):
            r[i]=r[i-1]*nums[i-1]
        for j in range(len(nums)-2,-1,-1):
            l[j]=l[j+1]*nums[j+1]

        for i in range(0,len(nums)):
            r[i]=r[i]*l[i]
        return r		
		