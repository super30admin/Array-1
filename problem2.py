# Time Complexity : O(n)
# Space Complexity : O(m) * O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
#
#
# Your code here along with comments explaining your approach


class Solution:
    def findDiagonalOrder(self, mat: list[list[int]]) -> list[int]:
        result = [0] * len(mat) * len(mat[-1])
        dir = 1
        i, j = 0, 0
        ptr = 0
        while ptr <= len(result)-1:
            if dir == 1:
                result[ptr] = mat[i][j]
                if j == len(mat[-1]) - 1:
                    i += 1
                    dir = -1
                elif i == 0:
                    j += 1
                    dir = -1
                else:
                    i -= 1
                    j += 1
                    dir = 1
                ptr += 1
            else:
                result[ptr] = mat[i][j]
                if i == len(mat) - 1:
                    j += 1
                    dir = 1
                elif j == 0:
                    i += 1
                    dir = 1
                else:
                    j -= 1
                    i += 1
                    dir = -1
                ptr += 1
        return result


check = Solution()
print(check.findDiagonalOrder([[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12], [13, 14, 15, 16]]))