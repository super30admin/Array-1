#Diagonal Traverse
#Time Complexity: O(m*n)
#Space Complexity: O(1)
#Problem sucessfully accepted in leetcode: yes
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        direction = 1
        ans = []
        n = len(mat)
        m = len(mat[0])
        row = 0
        col = 0
        while len(ans)<m*n:
            ans.append(mat[row][col])
            if direction == 1:
                if col == m-1:
                    row += 1
                    direction = 0
                elif row == 0:
                    col += 1
                    direction = 0
                else:
                    col += 1
                    row -= 1
            else:
                if row == n-1:
                    col += 1
                    direction = 1 
                elif col == 0:
                    row += 1
                    direction = 1               
                else:
                    col -= 1
                    row +=1
                    
        return ans