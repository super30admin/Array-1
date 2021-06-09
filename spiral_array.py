# Time Complexity : O(m * n)
# Space Complexity: O(1)
class Solution(object):
    def spiralOrder(self, matrix):
        #         Define 4 pointers as left, right , top and bottom
        left = 0
        right = len(matrix[0]) - 1

        top = 0
        bottom = len(matrix) - 1
        #         Define output list
        output_array = []
        #       Check if left is less than rihgt and top is less than bottom
        while (left <= right and top <= bottom):
            #           top
            #           add top row elemets to output list
            for i in range(left, right + 1):
                output_array.append(matrix[top][i])
            #             update top pointer
            top += 1

            #           add right noundary elements to output list
            #           right
            if (left <= right):
                for i in range(top, bottom + 1):
                    output_array.append(matrix[i][right])
            #             update the right pointer
            right -= 1

            #           add bottom row elements to the o/p list
            #             bottom
            if top <= bottom:
                for i in range(right, left - 1, -1):
                    output_array.append(matrix[bottom][i])
            #             update the bottom pointer
            bottom -= 1

            #           add left column elements to the o/p list
            #             left
            if (left <= right):
                for i in range(bottom, top - 1, -1):
                    output_array.append(matrix[i][left])
            #             update left pointer
            left += 1
        #         return o/p list
        return output_array

        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
