# time complexity: O(m*n)
# space complexity: O(1)


class Solution:
    def findDiagonalOrder(self, mat):
        row = len(mat)
        col = len(mat[0])

        # take result which has size = no of element in matrix
        result = [0 for i in range(row*col)]

        # null case
        if mat == None or len(mat) == 0:
            return result

        # take variable to store a direction: Up = 1, Down = -1
        dir = 1

        # i  and j are running row and running column respectively
        i = 0
        j = 0

        # maintain index at result array to store particular value
        idx = 0 
        while idx < row*col:

            # store element in resulting array
            result[idx] = mat[i][j]
            idx = idx + 1

            # up
            if dir == 1:
               
                #  if element in matrix at 0th row and direction is up
                if i == 0 and j != col-1:
                    # than move pointer to the next column and change direction 
                    # in given example mat[0][0] == 1 
                    j = j+1
                    dir = -1

                # if element in matrix at last column and direction is up
                elif j == col-1:
                     # than move pointer to the next row and change direction 
                     # in given example mat[0][3] == 4 
                    i = i + 1
                    dir = -1
                else:
                    # for normal cases
                    i = i - 1
                    j = j + 1

            # down
            else:
                # if element in matrix at 0th column and direction is down
                if j == 0 and i != row - 1:
                    # than move pointer to the next row and change direction 
                    i = i + 1
                    dir = 1

                # if element in matrix at last row and direction is down
                elif i == row - 1:
                     # than move pointer to the next column and change direction 
                    j = j + 1
                    dir = 1

                else:
                     # for normal cases
                    i = i + 1
                    j = j - 1


        return result


obj = Solution()
print(obj.findDiagonalOrder([[1,2,3,4],[5,6,7,8],[9,10,11,12],[13,14,15,16]]))


