class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        # Leetcode submission successful.
        # Time Complexity = O(mn) as we are visiting each element.
        # Space Complexity = O(1) as it is expected we return an array.

        m = len(matrix)  # rows
        n = len(matrix[0])  # columns

        # 4 pointers.
        t = 0  # top
        l = 0  # left
        r = n - 1  # right
        b = m - 1  # bottom

        out = []

        # Optimized if statements. 'If' statements required as the while condition will be checked after the for loops and after the change in pointer values.
        while (t <= b and l <= r):
            for col in range(l, r + 1):
                out.append(matrix[t][col])
            t += 1
            # t<=b checked by the for loop and no change in l and r.
            for row in range(t, b + 1):
                out.append(matrix[row][r])
            r -= 1
            if (t <= b):  # l<=r checked by the for loop.
                for col2 in range(r, l - 1, -1):
                    out.append(matrix[b][col2])
                b -= 1
            if (l <= r):  # t<=b checked by the for loop.
                for row2 in range(b, t - 1, -1):
                    out.append(matrix[row2][l])
                l += 1
        return out