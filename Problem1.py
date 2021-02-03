# Time Complexity :O(n^m
# Space Complexity :O(n^m)
#  Did this code successfully run on Leetcode :yes
# Any problem you faced while coding this :no
#Leetcode : 54


def spiralOrder(matrix):
    """
    :type matrix: List[List[int]]
    :rtype: List[int]
    """

    # Here top and left will be at the leftmost node that is 0,0
    # Bottom will be at last row and oth column
    # Right will be at last column first rowm

    top = 0
    left = 0

    right = len(matrix[0]) - 1
    bottom = len(matrix) - 1
    ans = []

    # We will loop until both the conditions meet.
    while (top <= bottom and left <= right):

        # Moving left to right on top row and then incrementing top to the next row.
        # So L -> R with top+=1
        for index in range(left, right + 1):
            ans.append(matrix[top][index])

        top += 1

        # Moving top to bottom on right most column and then decrementing to to the previous column.
        # So TOP -> BOTTOM, with right coming inside with -1.
        for index in range(top, bottom + 1):
            ans.append(matrix[index][right])

        right -= 1

        # Moving right to left on bottom most row and then decrementing to to the previous row. Also we will check if top and left rights are in rain.
        # So TOP -> BOTTOM, with right coming inside with -1.
        if (top <= bottom and left <= right):
            for index in range(right, left - 1, -1):
                ans.append(matrix[bottom][index])
            bottom -= 1
        # Moving bottomw to top on left most row and then incrementing to to the  previous row. Also we will check if top and left rights are in rain.
            for index in range(bottom, top - 1, -1):
                ans.append(matrix[index][left])

            left += 1


    return ans

def main():
    matrix = [[1,2,3],[4,5,6],[7,8,9]]
    ans = spiralOrder(matrix)
    print(ans)

if __name__ == '__main__':
    main()