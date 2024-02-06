#
# @lc app=leetcode id=498 lang=python3
#
# [498] Diagonal Traverse
#

# @lc code=start
'''
Time Complexity - O(m*n). We are traversing the entire matrix. Traversing means visiting every element
Space Complexity - O(m*n), We are storing all elements of a matrix in a 1D array

This code works on Leetcode
'''
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        result = []
        i,j,k,m,n, dir = 0, 0, 0, len(mat), len(mat[0]), True #set row and column pointer. Direct is set to True that indicates we are traversing upwards
        for k in range(m*n):
            result.append(mat[i][j])
            if dir:
                if i == 0 and j != n-1: #change direction when i reaches 0 j!=n-1 to handle case when we are on the top right corner
                    j+=1
                    dir = False
                elif j==n-1: #change direction if j reaches the last column
                    i+=1
                    dir = False
                else:
                    i-=1  #move diagonally upwards 
                    j+=1
            else:
                if j==0 and i!=m-1: #change the direction when j reaches 0. i!=m-1 to handle case when we reach the bottom corner
                    i+=1
                    dir = True
                elif i==m-1:
                    j+=1
                    dir = True
                else:
                    i+=1 #move diagonally downwards
                    j-=1
        return result

        
# @lc code=end

