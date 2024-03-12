# Time Complexity : O(m*n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
from typing import List
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m = len(mat)
        n = len(mat[0])
        direction = True
        i, j = 0, 0
        result = []

        for _ in range(m*n):
            result.append(mat[i][j])

            if direction:
                if(i == 0 and j != n-1):
                    j+=1
                    direction = False
                elif(j == n-1):
                    i+=1
                    direction = False
                else:
                    i-=1
                    j+=1
            else:
                if(j == 0 and i != m-1):
                    i+=1
                    direction = True
                elif(i == m-1):
                    j+=1
                    direction = True
                else:
                    i+=1
                    j-=1

        return result

sc = Solution()
mat = [[1,2,3],[4,5,6],[7,8,9]]
print(sc.findDiagonalOrder(mat))