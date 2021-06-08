'''
====== Submission Details =======
Student Name: Pavan Kumar K. N.
S30 SlackID : RN32MAY2021
=================================
'''

# 238. Product of Array Except Self
# Given an integer array nums, return an array answer such that answer[i] 
# is equal to the product of all the elements of nums except nums[i].
# 
# The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit 
# integer.

# You must write an algorithm that runs in O(n) time and without using the 
# division operation.

# Follow-up: Optimize space to O(1)

#-----------------
# Time Complexity: 
#-----------------
# O(N): Need to iterate over each element of the input array once


#------------------
# Space Complexity: 
#------------------
# O(1): rhs is the only variable needed to store the product of the array
#       to the right of the current element

#-----------------------
# Leet Code Performance: 
#-----------------------
# Ran Successfully?: Yes
# Time             :   220 ms  ( 97.75 %ile)
# Space            :   21.1 MB ( 62.46 %ile)

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        output = [0] * n
        output[0] = 1
        for i in range(1,n):
            output[i] = output[i-1] * nums[i-1]

        rhs = 1

        for i in range(n-1,-1,-1):
            output[i] = output[i] * rhs
            rhs *= nums[i]

        return output