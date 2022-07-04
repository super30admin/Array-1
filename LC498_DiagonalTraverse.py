"""
Given an m x n matrix mat, return an array of all the elements of the array in a diagonal order.

Input: mat = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,4,7,5,3,6,8,9]

We maintain two variables for two directions - upwards and downwards and check if we reach boundaries, change the 
change the direction and pointers accordingly


Leetcode - https://leetcode.com/problems/diagonal-traverse/

TC- O(m*n) # all the elements
SC- O(1)


"""

class Solution : 
    def findDiagonalOrder(self, matrix:list[list[int]]) -> list[int] :
        m = len(matrix)
        n = len(matrix[0])
        i = 0
        j = 0
        dir = 1
        idx = 0 #for tracking the index of the result
        result = []
        if matrix == None: 
            return result
        while 0 <= i < m and 0 <= j < n:
            result.append(matrix[i][j])
           
            if dir ==1 :
                if(i==0 and j!=n-1):
                    j+=1
                    dir = -1
                elif (j==n-1):
                    i+=1
                    dir = -1
                else:
                    i-=1
                    j+=1
            else :
                if j==0 and i!=m-1:
                    i+=1
                    dir = 1
                elif i==m-1:
                    j+=1
                    dir = 1
                else:
                    i+=1
                    j-=1
                    
        return result

matrix = [[1, 2, 3, 4],
       [5, 6, 7, 8],
       [9, 10, 11, 12]]
diagonalTraversal = Solution().findDiagonalOrder(matrix)
print(diagonalTraversal)

                


