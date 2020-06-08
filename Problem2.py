"""

    Student : Shahreen Shahjahan Psyche
    Time Complexity : O(MN) [It is traversing through all the elements of the matrix]
    Space Complexity : O(1) [No use of Auxiliary memory space]

    This code passed all the test cases in Leetcode.


"""


from typing import List

class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        
        # edge case
        if not matrix:
            return []
        
        #length of row
        m = len(matrix)
        #length of col
        n = len(matrix[0])
        # total number of elements
        num_elements = m*n
        # output array
        diagonal = []
        # row/col tracking variables
        i, j = 0, 0
        # direction tracking variable (up/dowm)
        flag = True
    
        for _ in range(num_elements):
            diagonal.append(matrix[i][j])
            # going upward and will change direction if hits boundary. 
            # in case of upward direction, it will either end up in 0th row
            # or the last column or both
            if flag == True and (i == 0 or j == n-1):
                flag = False
                if i == 0 and j!=n-1:
                    j = j+1
                else:
                    i = i+1
            # going upward but don't need to change the direction
            elif flag == True and  (i!=0 or j !=n-1):
                i = i - 1
                j = j + 1
            # going down ward and will change direction if hits boundary. 
            # in case of down ward direction, it will either end up in 0th col
            # or the last row or both
            elif flag == False and (i == m-1 or j == 0):
                flag  = True
                if j == 0 and i!=m-1:
                    i = i + 1
                else:
                    j = j + 1
             # going down ward but don't need to change the direction
            else:
                i = i + 1
                j = j - 1
        
        return diagonal


                    
            