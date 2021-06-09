# Time Complexity: O(n) , n - number of elements in matrix
# Space Complexity: O(1)
class Solution(object):
    def findDiagonalOrder(self, mat):

        m = len(mat)
        n = len(mat[0])
        #         Initializing the indexes of row and column to start from
        i = 0
        j = 0
        # print(m * n)
        #          Initializing the output array with size as number of elements in an matrix
        out_array = [0] * (m * n)
        #       Maintaining  the direction in to get all the elements
        direction = 1
        #       index for output array
        k = 0

        #         iterate over matrix until we visit every element
        while k < (m * n):
            #            It will update the values in output array
            out_array[k] = mat[i][j]
            #     checking if current direction is upward
            if direction == 1:
                #         if current column is last column , increment the row and change the direction
                if j == n - 1:
                    i += 1
                    direction = -1
                #                 if current row is first row then increment the column and change the direction
                elif i == 0:
                    j += 1
                    direction = -1
                #               or else just increment the column and decrement the row for upward case
                else:
                    j += 1
                    i -= 1
            #           If the direction is downwards
            else:
                #         if current row is last row , update the column and change the direction
                if i == m - 1:
                    j += 1
                    direction = 1
                #                 similarly, if column is first one , update the row and change the direction
                elif j == 0:
                    i += 1
                    direction = 1
                #                 or else decrement the column and increment the row
                else:
                    j -= 1
                    i += 1
            #             increment the index of an output array to update values in next turn
            k += 1
        #   return the output array after ending the while loop
        return out_array

        """
        :type mat: List[List[int]]
        :rtype: List[int]
        """
