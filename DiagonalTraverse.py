# // Time Complexity : o(m*n)
# // Space Complexity : o(1) space reserved for output
# // Did this code successfully run on Leetcode : yes
# // Three line explanation of solution in plain english
# 1) idea is to find the direction where we are going and the breaches 
# 2) once they are identified find cases when going updard can breach top and right so handle them edge case wehn both are matching choose right breach 
# 3) when going downwards can breach left and bottom so hanlde them and in cases where both are true consider bottom or row breach first

# // Your code here along with comments explaining your approach

from typing import List
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m,n = len(mat) , len(mat[0])
        arr = [None] * (m*n)
        i,j,flag = 0,0,True
        for idx in range(len(arr)):
            arr[idx] = mat[i][j]
            if flag:
                if j == n-1:
                    flag = False
                    i+=1
                elif i == 0:
                    flag = False
                    j+=1
                else:
                    i-=1
                    j+=1
            else:
                if i == m-1:
                    flag = True
                    j+=1
                elif j == 0:
                    flag = True
                    i+=1 
                else:
                    i+=1
                    j-=1
        return arr