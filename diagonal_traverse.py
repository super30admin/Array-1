# Time Complexity :
# O(N*M)  - Size of the Matrix

# Space Complexity :
# O(1) - There is no auxillary space being allocated

# Did this code successfully run on Leetcode :
#Yes

#Start moving in a certain direction until we reach the bounds of the array. Then we change and move in the other direction until the bounds are reached.
# This process is repeated until all elements have been covered

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        i = 0
        j = 0
        m = len(mat)
        n = len(mat[0])
        return_arr = []
        direction = "right"

        for k in range(0,m*n):
            return_arr.append(mat[i][j])
            if direction == 'right':
                if i == 0 and j != n- 1:
                    j += 1
                    direction = self.flip_direction(direction)
                elif j == n-1 :
                    i += 1
                    direction = self.flip_direction(direction)
                else :
                    i -= 1
                    j += 1
            else :
                if j == 0 and i != m- 1:
                    i += 1
                    direction = self.flip_direction(direction)
                elif i == m-1 :
                    j += 1
                    direction = self.flip_direction(direction)
                else :
                    i += 1
                    j -= 1
            
        return return_arr


    def flip_direction(self,direction):
        if direction == 'right':
            return "left"
        else :
            return "right"

