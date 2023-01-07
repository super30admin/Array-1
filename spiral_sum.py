# Time Complexity :
# O(N*M)  - Size of the Matrix

# Space Complexity :
# O(1) - There is no auxillary space being allocated

# Did this code successfully run on Leetcode :
#Yes

#Go through the outermost elements of the array in all directions. Change directions when we hit the bounds for that direction 
#If we reach an end - we change the direction and reduce the bounds of the arrary to ensure we don't go back to the already coverered elements. 

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m = len(matrix)
        n = len(matrix[0])

        l_row_bound = 0
        u_row_bound = m
        l_col_bound = 0
        u_col_bound = n
        i = 0
        j = 0
        return_arr = []
        direction = 'right'

        for k in range(0,m*n):
            #print ("point a", i,j)
            return_arr.append(matrix[i][j])

            if direction == 'right':
                if j != u_col_bound - 1:
                    j += 1
                else :
                    direction = 'down'
                    l_row_bound += 1
                    i += 1
            elif direction == 'down':
                if i != u_row_bound -1:
                    i += 1
                else :
                    direction = 'left'
                    u_col_bound -= 1
                    j -= 1
            elif direction == 'left':
                if j != l_col_bound :
                    j -= 1
                else :
                    direction = 'up'
                    u_row_bound -= 1
                    i -= 1
            elif direction == 'up':
                if i != l_row_bound :
                    i -= 1
                else :
                    direction = 'right'
                    l_col_bound += 1
                    j += 1

        return return_arr
