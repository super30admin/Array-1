# Time: O(MN) | Space: O(MN)

class Solution:
    def spiralOrder(self, matrix):
        rows = len(matrix) - 1
        cols = len(matrix[0]) - 1

        top, bottom = 0, rows
        left, right = 0, cols

        direction = "right"
        i, j = 0, 0
        result = []

        while (left <= right and top <= bottom):
            # print("-"*40)
            # print(left, right, top, bottom, direction)
            # print(result)

            if direction == "right":
                row = matrix[top][left:right+1]
                # print(row)
                result.extend(row)
                top += 1
                direction = "down"


            elif direction == "down":
                col = [matrix[i][right] for i in range(top, bottom+1)]
                result.extend(col)
                right -= 1
                direction = "left"

            elif direction == "left":
                row = reversed(matrix[bottom][left:right+1])
                result.extend(row)
                bottom -= 1
                direction = "up"

            else: # direction == "up":
                col = reversed([matrix[i][left] for i in range(top, bottom+1)])
                result.extend(col)
                left += 1
                direction = "right"






            #rint(left, right, top, bottom, direction)

        # print(result)
        return result



if __name__ == "__main__":
    print(Solution().spiralOrder([[1,2,3], [4,5,6], [7,8,9]]))
    print(Solution().spiralOrder([[1,2,3,4], [5,6,7,8], [9,10,11,12]]))
    print(Solution().spiralOrder([[1,2,3,4],[5,6,7,8],[9,10,11,12],[13,14,15,16]]))