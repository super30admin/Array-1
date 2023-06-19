# Submitted by : Aryan Singh_RN12MAY2023
# Time Complexity : O(1)
# Space Complexity : O(m * n), where m is total rows and n total columns
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Didn't put the second condition of downward direction with 'else', which created a bug at first run.

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        result = []
        total_row = len(mat) -1
        total_col = len(mat[0]) - 1
        total_nums = (total_row + 1) * (total_col + 1)
        # up direction
        direction = True
        # i is row and j is col
        i, j = 0, 0
        result.append(mat[i][j])
        for val in range(total_nums - 1):
            if direction == True:
                if i == 0 and j != total_col:
                    j += 1
                    direction = False
                elif j == total_col:
                    i += 1
                    direction = False
                else:
                    i -= 1
                    j += 1
            # downward direction
            elif direction == False:
                if j == 0 and i != total_row:
                    i += 1
                    direction = True
                elif i == total_row:
                    j += 1
                    direction = True
                else:
                    j -= 1
                    i += 1
            result.append(mat[i][j])

        return result