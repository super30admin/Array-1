class Solution(object):
    def findDiagonalOrder(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: List[int]
        """
        # Leetcode submission successful.
        # Time Complexity = O(mn).
        # Space Complexity = O(1). We use an out array but as they want an array to be returned, it doesn't contribute to the space complexity.

        m = len(mat)  # rows
        n = len(mat[0])  # columns
        out = []

        # row and column pointers.
        r_p = 0
        c_p = 0
        dir = 1  # Going upward.

        # making sure the pointers don't go out of bound.
        while (r_p <= m - 1 and c_p <= n - 1):
            if (dir == 1):
                # Order of conditional statements matter. Try different order and see how output changes to understand.
                if (c_p == n - 1):
                    dir = -1
                    out.append(mat[r_p][c_p])
                    r_p += 1
                elif (r_p == 0):
                    dir = -1
                    out.append(mat[r_p][c_p])
                    c_p += 1
                else:
                    out.append(mat[r_p][c_p])
                    r_p -= 1
                    c_p += 1

            # dir=-1 here which means going downward.
            # Order of conditional statements matter.
            else:
                if (r_p == m - 1):
                    out.append(mat[r_p][c_p])
                    c_p += 1
                    dir = 1
                elif (c_p == 0):
                    dir = 1
                    out.append(mat[r_p][c_p])
                    r_p += 1
                else:
                    out.append(mat[r_p][c_p])
                    r_p += 1
                    c_p -= 1
        return out