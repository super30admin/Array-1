#TC: O(mn)
#SC:O(mn)
#m-rows,n-columns

class Solution:
    def spiralOrder(self, matrix):
       

        # approach:
        #     move each direction until meet bolder,
        #     then update bolder to be more tight.
        #     finish function once there is no space to move

        m = len(matrix)
        n = len(matrix[0]) if m > 0 else 0

        if n == 0:
            return []

        result = [0] * (m*n)
        count = 0
        x = y = 0
        top = left = 0
        right = n - 1
        bottom = m - 1

        while True:
            # go right and move top bolder lower
            for i in range(left, right + 1):
                result[count] = matrix[top][i]
                count += 1
            top += 1
            if top > bottom:
                break

            # go down and move right bolder lefter
            for i in range(top, bottom + 1):
                result[count] = matrix[i][right]
                count += 1
            right -= 1
            if right < left:
                break

            # go left and move bottom bolder upper
            for i in range(right, left - 1, -1):
                result[count] = matrix[bottom][i]
                count += 1
            bottom -= 1
            if bottom < top:
                break;

            # go up and move left bolder righter
            for i in range(bottom, top - 1, -1):
                result[count] = matrix[i][left]
                count += 1
            left += 1
            if left > right:
                break;

        return result
