# Time Complexity : O(m * n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Three line explanation of solution in plain english
    #Traveresed through each diagonal, and if index is going out of bounds then 
    # changed direction accordingly and updated rows and columns and appended it to result.

#Your code here along with comments explaining your approach

class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix or not matrix[0]:
            return []
        
        N = len(matrix)
        M = len(matrix[0])
        size = N*M
        result = []
        
        i,j = 0, 0
        direction = 1
        index = 0
        
        while i<N and j<M:
            result.append(matrix[i][j])
            if direction ==1:
                if(j == M-1):
                    direction = -1
                    i += 1
                elif(i == 0):
                    direction = -1
                    j += 1
                else:
                    i -= 1; j += 1
            
            elif direction == -1:
                if i == N-1:
                    direction = 1
                    j += 1
                elif j == 0:
                    direction = 1
                    i += 1
                else:
                    i += 1
                    j -= 1
            
            index += 1
        
        return result
            
        
        
        