"""
https://leetcode.com/problems/diagonal-traverse/#

Time Complexity: O(n)
Space Complexity: O(1)
I tried it on Leetcode.
I did not get any errors.

"""


class Solution:
    def findDiagonalOrder(self, mat):
        output = [mat[0][0]]
        m = len(mat)  # row
        n = len(mat[0])  # column
        last_element = (m-1) + (n-1)
        i = 0
        j = 0
        while i + j != last_element:
            if (i + j) % 2 == 0:
                # upward direction
                if j == n - 1:  # element 3 --> i=0, j=n-1
                    i += 1
                elif i == 0:  # element 1 --> i=0
                    j += 1
                else:
                    i -= 1
                    j += 1
                output.append(mat[i][j])
            elif (i + j) % 2 != 0:
                # downward direction
                if i == m - 1:  # element 8 --> i=m-1
                    j += 1
                elif j == 0:  # element 4 --> j=0
                    i += 1
                else:
                    i += 1
                    j -= 1
                output.append(mat[i][j])
        return output


# obj = Solution()
# print(obj.findDiagonalOrder([[1, 2, 3], [4, 5, 6], [7, 8, 9]]))

