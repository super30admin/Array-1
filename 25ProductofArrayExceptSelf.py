"""
// Time Complexity :O(n2) Iterating over array twice
// Space Complexity :O(1) Extra space for the list
// Did this code successfully run on Leetcode :NA
// Any problem you faced while coding this :NA

//Explanation:
//BF approach:
Iterate through array twice and store the multiplication
in a auxiliary array. By the end, replace the original array by auxiliary
array

//Optimized solution
Use temp and rproduct-> leftpass and rightpass
rp*=rp*temp
temp=nums[l/r]
"""
from typing import List
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
      rproduct, temp = 1,1
      result = []

      #left pass
      for l in range(len(nums)):
        rproduct *= temp
        result.append(rproduct)
        temp = nums[l]

      #right pass
      rproduct, temp = 1,1
      for r in range(len(nums)-1,-1,-1):
        rproduct *= temp
        result[r] *= rproduct
        temp = nums[r]
      return result

# Brute force
array=[1,2,3,4]
m=1
res=[]

for i in range(len(array)):
  m = 1
  for j in range(len(array)):
   if array[i]==array[j]:
     pass
   else:
     m*=array[j]
  print(m)
  res.append(m)

array=res
print(array)
