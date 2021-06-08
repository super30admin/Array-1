'''
====== Submission Details =======
Student Name: Pavan Kumar K. N.
S30 SlackID : RN32MAY2021
=================================
'''

# 498. Diagonal Traverse
# https://leetcode.com/problems/diagonal-traverse/

# Given an m x n matrix mat, 
# return an array of all the elements of the array in a diagonal order.

# Example 1:
# Input: mat = [[1,2,3],[4,5,6],[7,8,9]]
# Output: [1,2,4,7,5,3,6,8,9]

# Example 2:
# Input: mat = [[1,2],[3,4]]
# Output: [1,2,3,4]

#-----------------
# Time Complexity: 
#-----------------
# O(M*N): Need to iterate over each element of the input array once.


#------------------
# Space Complexity: 
#------------------
# O(1): No auxiliary data structure. Only variables to store some numbers.
#       So constant space.

#-----------------------
# Leet Code Performance: 
#-----------------------
# Ran Successfully?: Yes
# Time             : 184 ms  (91.97 %ile)
# Space            : 16.8 MB (61.06 %ile)

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        c = 0 #column index
        r = 0 # row index
        dir_flag = 1 #direction flag
        m = len(mat) # No. of rows
        if m == 0:
            return []

        n = len(mat[0]) #No. of Columns

        result = [None] * (m*n) #resultant array


        n = len(mat[0])

        i = 0

        while i < m*n:
            result[i] = mat[r][c]
            # Going up
            if dir_flag == 1:
                # Should check this first instead of r==0 because if row 
                # hits 0, we are incrementing col.
                if c == n-1:
                    r +=1 
                    dir_flag = -1
                elif r == 0:
                    c += 1
                    dir_flag = -1
                else:
                    r -= 1
                    c += 1
            else:
                if r == m-1:
                    c += 1
                    dir_flag = 1
                elif c == 0:
                    r += 1
                    dir_flag = 1
                else:
                    r += 1
                    c -= 1
            i+=1

        return result




        


