class Solution(object):
    #         Define output list
    output_array = []

    def recursiveCall(self, matrix, left, right, top, bottom):

        if left > right or top > bottom:
            return
        for i in range(left, right + 1):
            self.output_array.append(matrix[top][i])
            #             update top pointer
        top += 1

        #           add right noundary elements to output list
        #           right
        # if (left <= right):
        for i in range(top, bottom + 1):
            self.output_array.append(matrix[i][right])
        #             update the right pointer
        right -= 1

        #           add bottom row elements to the o/p list
        #             bottom
        if top <= bottom:
            for i in range(right, left - 1, -1):
                self.output_array.append(matrix[bottom][i])
            #             update the bottom pointer
        bottom -= 1

        #           add left column elements to the o/p list
        #             left
        if (left <= right):
            for i in range(bottom, top - 1, -1):
                self.output_array.append(matrix[i][left])
            #             update left pointer
        left += 1

        self.recursiveCall(matrix, left, right, top, bottom)

        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """

    def spiralOrder(self, matrix):
        #       Define 4 pointers as left, right , top and bottom
        left = 0
        right = len(matrix[0]) - 1

        top = 0
        bottom = len(matrix) - 1

        self.output_array = []
        self.recursiveCall(matrix, left, right, top, bottom)
        return self.output_array
