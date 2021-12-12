# Time Complexity : O(length+height), 
# Space Complexity : o(1)

# Did this code successfully run on Leetcode : 
# YEs

# Any problem you faced while coding this : 

# Your code here along with comments explaining your approach


class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if mat == None or len(mat)== 0 :
            return [0]
        m = len(mat)
        n = len(mat[0])
        direction = 1
        result = []
        index=i=j=0
        while index < m*n:
            result.append( mat[i][j])
            index +=1
            if direction == 1:
                if j==n-1:
                    direction = -1
                    i+=1
                elif i==0:
                    direction = -1
                    j+=1
                else:
                    i-=1
                    j+=1
            else:
                if i == m-1 :
                    direction = 1
                    j+=1
                
                elif j == 0:
                    direction = 1
                    i+=1
                else:
                    i+=1
                    j-=1
        return result