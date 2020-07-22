# Time Complexity : O(n) where n is row*columns
# Space Complexity : O(n) where n is row*columns
# Did this code successfully run on LeetCode : yes
# Any problem you faced while coding this : No


# We will traverse through elements in two ways up and down, with some conditions
# If up we will increase the column and decrease the row until we reach the first row  or last column
# If down we will decrease the column and increase the row until we reach the first column or last row
# We will start with up direction and decide the direction when we reach the end we will decide based on the above
# condition

class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:

        if len(matrix) == 0: return []
        up = True
        rows = len(matrix)
        cols = len(matrix[0])
        row = 0
        col = 0
        i = 0


        output = []
        while i < rows * cols:
            print(row, col)
            output.append(matrix[row][col])

            if up:

                if col == cols - 1:
                    row += 1
                    up = False

                elif row == 0:
                    col += 1
                    up = False

                else:
                    row -= 1
                    col += 1

            else:

                if row == rows - 1:
                    col += 1
                    up = True

                elif col == 0:
                    row += 1
                    up = True


                else:
                    row += 1
                    col -= 1

            i += 1

        return output
