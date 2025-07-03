# Time Complexity: O(m*n)
# Space Complexity: O(1)
# Were you able to run the code on Leetcode: Yes
# Any problem you faced while coding this: No

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:

        if not mat:
            return []
        
        m = len(mat)
        n = len(mat[0])

        res = []
        row=0
        col=0
        direction = 1 # direction = 1 (bottom to top), -1 (top to bottom)

        # traversse all m*n elements
        for i in range(m*n):

            res.append(mat[row][col])

            if direction == 1:
                # if last column, flip direction and go below row
                if col == n-1:
                    row+=1
                    direction = -1
                # if first row, flip direction and go to next col
                elif row==0:
                    col+=1
                    direction = -1
                # general case of going 1 row above and 1 col right (diagonal up right)
                else:
                    row-=1
                    col+=1
                
            elif direction == -1:

                # if last row, flip direction and go to next col right
                if row == m-1:
                    col+=1
                    direction = 1
                # if first col, flip direction and go one row below
                elif col==0:
                    row+=1
                    direction = 1
                # general case of going 1 row below and 1 col left
                else:
                    col-=1
                    row+=1

        return res