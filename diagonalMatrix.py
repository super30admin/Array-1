# Time Complexity : O(m*n) m, n are dimensions of matrix
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        direction = "up"
        m = len(mat)-1
        n = len(mat[0])-1
        i=0
        j=0
        result = []
        while(len(result) < (m+1)*(n+1)):
            result.append(mat[i][j])
            if direction == "up":
                if j == n:
                    i += 1
                    direction = "down"
                elif i == 0:
                    j += 1
                    direction = "down"
                else:
                    i -= 1
                    j += 1
            else:
                if i == m:
                    j += 1
                    direction = "up"
                elif j == 0:
                    i += 1
                    direction = "up"
                else:
                    i += 1
                    j -= 1
        return result