# Time Complexity : O(mn)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode :yes
# Three line explanation of solution in plain english

# Your code here along with comments explaining your approach
# Traverse the matrix diagonally, switching direction on each diagonal.
# Move upward-right when the flag is true, and downward-left when the flag is false.
# When you hit matrix boundaries, adjust the row or column and flip the direction to continue correctly.

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m = len(mat)
        n = len(mat[0])
        output =[]
        flag = True #up
        r = 0
        c = 0
        for i in range(m*n):
            output.append(mat[r][c])
            if flag:
                if c == n-1:
                    r += 1
                    flag = False
                elif r == 0:
                    c+= 1
                    flag = False
                else:
                    r-= 1
                    c += 1
            else:
                if r == m-1:
                    c += 1
                    flag = True
                elif c == 0:
                    r += 1
                    flag = True
                else:
                    r += 1
                    c -= 1
        return output
                




                

        