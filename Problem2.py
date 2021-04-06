## Problem 2
# Given a matrix of M x N elements (M rows, N columns), return all elements of the matrix in diagonal order as shown in the below image.
# // Time Complexity : O(mn), where m is number of rows and n is number of columns in the matrix
# // Space Complexity : O(1) - if output list is not considered additional space.
# // Did this code successfully run on Leetcode :Yes

class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix:
            return []
        m = len(matrix)
        n = len(matrix[0])
        index = 0
        dirr = 1
        i,j = 0,0
        result = [None] * (m*n)
        while(index < m*n):
            result[index] = matrix[i][j]
            if(dirr == 1):
                if(j==n-1):
                    i+=1
                    dirr=-1
                elif(i==0):
                    j+=1
                    dirr=-1
                else:
                    i-=1
                    j+=1
                pass
            else:
                if(i==m-1):
                    j+=1
                    dirr=1
                elif(j==0):
                    i+=1
                    dirr=1
                else:
                    i+=1
                    j-=1
            index+=1
        return result
        