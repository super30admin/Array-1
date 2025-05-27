"""
Approach: simulate just as the problem asks. Have a top, bottom , left and right pointers to indicate the size of the current 
matrix we're looking into.
T.c. => O(m * n)
s.c => O(1)
Did this code successfully run on Leetcode :
"""
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        l, r = 0, len(matrix[0]) - 1
        t, b = 0, len(matrix) - 1
        
        res = []
        while l <= r and t <= b:
            for i in range(l, r + 1):
                res.append(matrix[t][i])
            t += 1

            for i in range(t, b + 1):
                res.append(matrix[i][r])
            r -= 1

            if t > b or r < l:
                break

            for i in range(r, l - 1, -1):
                res.append(matrix[b][i])
            b -= 1
        
            for i in range(b, t - 1, -1):
                res.append(matrix[i][l])
            l += 1
        return res
