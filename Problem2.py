## Problem 2

# <!-- Given a matrix of M x N elements (M rows, N columns), return all elements of the matrix in diagonal order as shown in the below image.

# Example:

# Input:

# [

# [ 1, 2, 3 ],

# [ 4, 5, 6 ],

# [ 7, 8, 9 ]

# ]

# Output: [1,2,4,7,5,3,6,8,9] -->

class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        # print(len(matrix))
        # print(len(matrix[0]))
        if len(matrix)==0 or matrix ==[]:
            return []
        m = len(matrix)
        n = len(matrix[0])
        i = 0
        dir = 1
        j = 0
        prod = m*n
        index = 0
        result = [0 for k in range(m*n)]
        while index < prod:
            result[index] = matrix[i][j]
            if dir == 1:
                if j==n-1:
                    dir = -1
                    i=i+1
                elif i ==0:
                    dir = -1
                    j = j+1
                else:
                    i=i-1
                    j=j+1
            
            else:
                if i == m-1: 
                    dir = 1
                    j = j+1
                elif j ==0:
                    i=i+1
                    dir = 1
                else:
                    i = i+1
                    j = j-1
            index = index+1
        return result
                
    #  <!-- #Time Complexity: O(m*n) m - rows and n - cols
    # #Space Complexity: O(1)
    # #Approach: Traversal using i,j and analysing required edge conditions.  -->
                
                
        