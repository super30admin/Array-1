#https://leetcode.com/problems/diagonal-traverse/description/

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m = len(mat)
        n = len(mat[0])
        dir = True #up
        result = [0]*(m*n)
        i=j=0
        for index in range(m*n):
            result[index] = mat[i][j]
            if dir:
                if i == 0 and j != n-1:
                    j += 1
                    dir = False #down
                elif j == n-1:
                    i += 1
                    dir = False
                else:
                    i -= 1
                    j += 1
            else:
                if j == 0 and i != m-1:
                    i += 1
                    dir = True
                elif i == m-1:
                    j +=1
                    dir = True
                else:
                    j -= 1
                    i += 1
        return result

#time complexity O(n)
#space complexity O(1)