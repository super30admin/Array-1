#498. Diagonal Traverse

"""
Time Complexity = O(n)
Space Complexity = O(1)
Did this code successfully run on Leetcode : YES

Finding a pattern which is followed if we wand all diagonals values.
Using direction variable to get diagonals in upward or in downward direction.

"""


class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        direction = "up"
        i = 0
        j = 0
        m = len(mat)
        n = len(mat[0])

        result = []

        # result will be the array itself for m=1 and n=1
        if m == 1:
            return mat[0]

        if n == 1:
            for i in range(0, m):
                result.append(mat[i][0])
            return result

        for x in range(0, m * n):
            # print(result, direction, i, j)
            # if we got required values then break. Not going further
            if len(result) == m * n:
                break

            if direction == "up":
                # handling right most side in matrix
                if j == n - 1:
                    result.append(mat[i][j])
                    i = i + 1

                    direction = "down"
                # handling top side of martix
                elif i == 0:
                    result.append(mat[i][j])
                    j = j + 1

                    direction = "down"

                else:
                    result.append(mat[i][j])
                    i = i - 1
                    j = j + 1



            elif direction == "down":

                # handling bottom side of  matrix
                if i == m - 1:
                    result.append(mat[i][j])
                    j = j + 1

                    direction = "up"

                # handling left side of matrix
                elif j == 0:
                    result.append(mat[i][j])
                    i = i + 1
                    # print(i)
                    direction = "up"

                else:
                    result.append(mat[i][j])
                    i = i + 1
                    j = j - 1

        return result