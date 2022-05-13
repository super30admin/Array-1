# Time Complexity : O(M*N) when M is number rows of the matrix and N is number of columns in the matrix
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
class Solution:
    def findDiagonalOrder(self, mat):
        ROWS, COLS = len(mat), len(mat[0])
        result = []
        up_dir = True
        r,c,i = 0,0,0
        if len(mat) == 0:
            return []
        while len(result) < ROWS * COLS:
            result.append(mat[r][c])

            #Going in upward direction
            if up_dir:
                if(r == 0 and c != COLS - 1):
                    up_dir = False
                    c += 1
                elif c == COLS - 1:
                    up_dir = False
                    r += 1
                else:
                    r -= 1
                    c += 1
            #Going in downward direction
            else:
                if(c == 0 and r != ROWS - 1):
                    up_dir = True
                    r += 1
                elif r == ROWS - 1:
                    up_dir = True
                    c += 1
                else:
                    r += 1
                    c -= 1
            
        return result

solution = Solution()
print(f"OUTPUT >> {solution.findDiagonalOrder([[1,2,3],[4,5,6],[7,8,9]])}")