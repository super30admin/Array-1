# Created by Aashish Adhikari at 8:03 PM 1/6/2021

'''
Time Complexity:
O(m . n) where and n represent the dimensions of the matrix.

Space Complexity:
O(1)

'''

class Solution(object):
    def findDiagonalOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """

        #trick --> keep track of the variables that break the pattern of normal precedence

        if len(matrix) == 0:
            return []

        dir = 1

        row = 0
        col = 0

        arr = []

        while True:

            # append the current element
            arr.append(matrix[row][col])

            if row == len(matrix)-1 and col == len(matrix[0])-1:

                return arr



            if dir == 1:

                if col == len(matrix[0]) -1:   # <-- this check shoulbe be before the row == 0 check
                    dir = -1
                    row += 1

                elif row == 0:
                    dir = -1
                    col += 1
                else:
                    row -= 1
                    col +=1




            else:

                if row == len(matrix)-1:    # <-- this check should be before the col == 0 check
                    dir = 1
                    col += 1

                elif col == 0:
                    dir = 1
                    row += 1

                else:
                    row += 1
                    col -= 1






