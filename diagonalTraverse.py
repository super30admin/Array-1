#Time: O(mn)
#Space: O(1), since output array is not auxilary space
# any issues faced: none
# did the code run successfully on leetcode: yes
# Approach:
# traverse up till one of the edge case hits and then change the direction downwards
# fill the output array of size mn

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m, n = len(mat), len(mat[0])
        out = [0 for _ in range(m*n)]
        i, j, idx, up = 0, 0, 0, True
        while idx < m*n:
            if up:
                while up and -1 < i < m and -1 < j < n:
                    out[idx] = mat[i][j]
                    idx+=1
                    if i == 0 and j != n-1:
                        j += 1
                        up = False
                    elif j == n-1:
                        i += 1
                        up = False
                    else:
                        i-=1;j+=1
            else:
                while not up and -1 < j < n and -1 < i < m:
                    out[idx] = mat[i][j]
                    idx+=1
                    if j == 0 and i != m-1:
                        i+=1
                        up = True
                    elif i == m-1:
                        j+=1
                        up = True
                    else:
                        i+=1;j-=1
        return out