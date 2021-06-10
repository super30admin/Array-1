# Time Complexity: O(n)
# Space Complexity: O(1)
# ran on leetcode : yes

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        row = len(mat)
        columns = len(mat[0])
        i = 0
        j = 0
        # Output array
        op_array = [0] * (row *columns)
        # Maintain the direction
        direction = 1
        k = 0

        # iterate over matrix
        while k < (row * columns):
            # update values in output array
            op_array[k] = mat[i][j]
            # check for curr direction
            if direction == 1:
                # if current column is the last -> row++ and change the direction
                if j == columns - 1:
                    i += 1
                    direction = -1
                # if current row is first -> column++ and change the direction
                elif i == 0:
                    j += 1
                    direction = -1
                # else just increment the column and decrement the row for upward case
                else:
                    j += 1
                    i -= 1
            #  If the direction is downwards
            else:
                # if current row is last row , update the column and change the direction
                if i == row - 1:
                    j += 1
                    direction = 1
                # if column is first one , update the row and change the direction
                elif j == 0:
                    i += 1
                    direction = 1
                # else decrement the column and increment the row
                else:
                    j -= 1
                    i += 1
            # increment the index of an output array to update values in next turn
            k += 1
        # return the output array after ending the while loop
        return op_array