"""
Given a matrix of M x N elements (M rows, N columns), 
return all elements of the matrix in diagonal order as shown in the below image.

Example:

Input:

[

[ 1, 2, 3 ],

[ 4, 5, 6 ],

[ 7, 8, 9 ]

]

Output: [1,2,4,7,5,3,6,8,9]

"""

# Time Complexity : O()
# Space Complexity : O()
# Did this code successfully run on VScode : Yes
# Any problem you faced while coding this : No

from typing import List

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        
        # null case
        if mat is None:
            return []
        
        m = len(mat)
        n = len(mat[0])
        
        result = [0]*(m*n)
        
        # direction of iterating
        dirs = 1
        
        index = 0
        i = j = 0
        
        while index < m*n:
            
            result[index] = mat[i][j]
            index += 1
            
            # if direction is upward
            if dirs == 1:
                # base
                # at the end of the row, go to next row 
                if j == n-1:
                    i += 1
                    dirs -= 1
                # base
                # if at the start of row, go to next coluumn
                elif(i == 0):
                    j += 1
                    dirs = -1
                # go diagonally
                else:
                    i -= 1
                    j += 1

             # if direction is downward
            else:
                # base
                # at the end of the column, go to next column
                if i == m-1:
                    j += 1
                    dirs = 1
                # base
                # at the start of the column, go to next row
                elif(j == 0):
                    i += 1
                    dirs = 1
                # go diagonally
                else:
                    i += 1
                    j -= 1
        
        return result # result is storing all elements we are traversing diagonally
            
        
        