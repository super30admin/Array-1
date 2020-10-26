#Time Complexity : O(n) where n is the number of elements in the matrix
#Space Complexity : o(1) (Since output array is counted as auxilary space)

#Did this code successfully run on Leetcode : Yes
#Three line explanation of solution in plain english: Iterate through the matrix keeping in check the directions and moving the row and column pointer accordingly to possible cases. Change the direction if pointer reaches either 4 ends of the matrix.

#Your code here along with comments explaining your approach

class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix:
            return []
        rows, cols, r, c = len(matrix), len(matrix[0]), 0, 0
        # 1 = up and 0 = down
        direction = 1
        result = []

        while r < rows and c < cols:
            result.append(matrix[r][c])
            #if current direction is up
            if direction == 1:
                #if pointer reaches the last column, then increment row and change direction to down
                if c == cols-1:
                    r += 1
                    direction = 0
                #if pointer reaches the first column, then increment column and change direction to down
                elif r == 0:
                    c += 1
                    direction = 0
                #if pointer is somewhere within the matrix
                else:
                    r -= 1
                    c += 1
            #if current direction is down
            else:
                #if pointer reaches last row, then increment the column and change direction to up
                if r == rows-1:
                    c += 1
                    direction = 1
                #if pointer reaches first column, then increment the row and change the direction to up
                elif c == 0:
                    r += 1
                    direction = 1
                #if pointer is somewhere within the matrix
                else:
                    r += 1
                    c -= 1

        return result
