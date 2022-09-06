'''
498. Diagonal Traverse
TIME COMPLEXITY: O(m*n)
SPACE COMPLEXITY: O(m*n)
LEETCODE: Yes
DIFFICULTIES: Yes, but I could resolve it.
'''


class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m = len(mat)
        n = len(mat[0])
        
        res = [0 for i in range(0, m*n)]
        d = 0 # 0 for upward and 1 for downward
        i = 0 # for row
        j = 0 # for column
        
        for idx in range(0,  m*n):
            # upward direction
            if d == 0:
                res[idx] = mat[i][j]

                if i-1 >=0 and j+1 < n:
                    i -= 1
                    j += 1
                else:
                    if j == n-1:
                        i += 1
                    elif i == 0:
                        j +=1
                    d = 1
                    
            else:
            # Downward direction
                res[idx] = mat[i][j]

                if j-1 >=0 and i+1 < m:
                    i += 1
                    j -= 1
                else:
                    if i == m-1:
                        j +=1
                    elif j == 0:
                        i += 1
                    
                    d = 0
        
        return res
