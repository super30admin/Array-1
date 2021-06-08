'''
====== Submission Details =======
Student Name: Pavan Kumar K. N.
S30 SlackID : RN32MAY2021
=================================
'''

# 54. Spiral Matrix
# Given an m x n matrix, return all elements of the matrix in spiral order.

# Example 1:
# Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
# Output: [1,2,3,6,9,8,7,4,5]

# Example 2:
# Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
# Output: [1,2,3,4,8,12,11,10,9,5,6,7]

#-----------------
# Time Complexity: 
#-----------------
# O(M*N): Where M and N are no. of rows and columns in matrix, respectively.
#         Because we need to iterate over all elements at least once.

#------------------
# Space Complexity: 
#------------------
# O(1): Not using any auxiliary data structure. Only variables. So constant.

#-----------------------
# Leet Code Performance: 
#-----------------------
# Ran Successfully?: Yes
# Time             :   (32 ms 57.53 %ile)
# Space            :  ( 14.3 MB 57.99 %ile)

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m = len(matrix)
        if m == 0:
            return []
        if m == 1:
            return matrix[0]
        
        n = len(matrix[0])

        result = []

        top = 0
        bot = m-1
        left = 0
        right = n-1

        while left <= right and top <= bot:
            # Top row
            for j in range(left, right+1):
                result.append(matrix[top][j])

            top += 1

            # Right column
            for i in range(top, bot+1):
                result.append(matrix[i][right])

            right -= 1

            # We are going to use bot variable, so check base condition
            if top <= bot: 
                # Bot row
                for j in range(right, left-1,-1):
                    result.append(matrix[bot][j])
                bot -= 1

            # We are going to use left variable, so check base condition
            if left <= right:
                #Left Column
                for i in range(bot, top-1, -1):
                    result.append(matrix[i][left])

                left += 1

        return result



