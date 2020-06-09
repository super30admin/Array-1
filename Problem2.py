# Time Complexity : O(m x n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Your code here along with comments explaining your approach
class Solution:
    def findDiagonalOrder(self,matrix):
        if not matrix:
            return []
        row, col = len(matrix), len(matrix[0])
        r, c = 0, 0
        result = []
        count = 0
        dir = "up" 
        while count < (row * col):
            result.append(matrix[r][c])
            count += 1 
            if dir == "up":
                if c == col-1:
                    dir = "down"
                    r += 1 
                
                elif r == 0:
                    dir = "down"
                    c += 1 
                
                else:
                    r -= 1 
                    c += 1
            
            else:
                if r == row - 1 :
                    dir = "up"
                    c += 1 
                
                elif c == 0:
                    dir = "up"
                    r += 1 
                
                else:
                    r += 1 
                    c -= 1 
        return result
                 
            
    
if __name__ == "__main__":
    s = Solution()
    matrix = [[1,2,3],[4,5,6],[7,8,9]]
    # matrix = []
    res = s.findDiagonalOrder(matrix)
    print(res)