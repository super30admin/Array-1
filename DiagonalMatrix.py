# Time complexity: O(n)
# Space complexity: O(1) since we are not considering the output as an extra space as it is auxiliary space.
# Did it run on leetcode: Yes

# Basically checking for out of bounds condition and updating the direction based on it and storing the result in result array

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m, n = len(mat), len(mat[0])
        result = [0 for _ in range(m*n)]
        dir = True
        r,c = 0, 0
        c = 0
        for i in range(m*n):
            result[i] = mat[r][c]
            if dir:
                if(r ==0 and c != n - 1):
                    c += 1
                    dir = False
                elif( c == n - 1):
                    r += 1
                    dir = False
                else:
                    r -= 1
                    c += 1
            else:
                if(c==0 and r != m-1):
                    r += 1
                    dir = True
                elif(r == m - 1):
                    c += 1
                    dir = True
                else:
                    c -= 1
                    r += 1
        return result