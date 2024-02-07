# Time complexity is O(m * n) as we are traversing whole matrix
# Space complexity is O(1) as I do not use any extra space for computation
class Solution:
    def spiralOrder(self, matrix: list[list[int]]) -> list[int]:

        # I took three pointers and updating them as I am traversing the matrix's rows and columns
        l = 0
        r = len(matrix[0]) - 1
        up = 0
        down = len(matrix) - 1
        result = []

        while (l <= r and up <= down):

            for i in range(l, r+1):
                result.append(matrix[up][i])
            up += 1

            for i in range(up, down + 1):
                result.append(matrix[i][r])
            r -= 1

            # This condition I put because up is changed above but I did not check it after while loop check
            if up <= down:
                for i in range(r, l - 1, -1):
                    result.append(matrix[down][i])
                down -= 1

            # This condition I put because r is changed above but I did not check it after while loop check
            if l <= r:
                for i in range(down, up - 1, -1):
                    result.append(matrix[i][l])
                l += 1
        return result
