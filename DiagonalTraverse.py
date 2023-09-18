#Time Complexity : O(m*n) since we are iterating through each element
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this :No

#Approach: We use a dir variable as 1 for up direction and -1 for down direction.

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m = len(mat)
        n = len(mat[0])
        result = [0] * (m*n)
        i = 0
        j = 0
        dir = 1
        idx = 0 #index for result array
        while ( idx < len(result)):
            result[idx] = mat[i][j]
            idx += 1
            if(dir == 1):
                #up
                if j == n-1:
                    i += 1
                    dir = -1
                elif i == 0:
                    j += 1
                    dir = -1
                else:
                    i -= 1
                    j += 1
            else:
                #down
                if i == m-1:
                    j += 1
                    dir = 1
                elif j == 0:
                    i += 1
                    dir = 1
                else:
                    i += 1
                    j -= 1
        return result
                    