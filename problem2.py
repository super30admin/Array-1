"""
Time Complexity :O(n*m)
Space Complexity : O(1)
Did this code successfully run on Leetcode :yes


Approach
we are maintain a direction pointer that will decide if we go up or down 
while we are traversing the matrix and changing direction there
are two edge case we need to be know first is when row is 0 and col and len
and when row is len and col is zero

"""



class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m = len(mat)
        n = len(mat[0])
        direction = True
        result = [0 for _ in range(0,m*n)]
        print(result)
        i = 0
        j = 0
        for index in range(m*n):
            result[index] = mat[i][j]
            if direction:
                if i == 0 and j !=n - 1:
                    direction = False
                    j += 1
                elif j == n -1:
                    direction = False
                    i += 1
                else:
                    i -= 1
                    j += 1
            else:
                if j == 0 and i != m - 1:
                    direction = True
                    i += 1
                elif i == m -1:
                    direction = True
                    j += 1
                else:
                    i += 1
                    j -= 1
        return result