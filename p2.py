# Time Complexity : O(mn)
# Space Complexity : O(mn) extra space
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this :

#  Your code here along with comments explaining your approach

class Solution:
    def findDiagonalOrder(self, A):

        if not A:
            return []

        res = []

        start = [0, 0]
        up = True
        n = len(A)
        m = len(A[0])

        while True:
            c = start

            while True:
                res.append(A[c[0]][c[1]])

                if up:
                    if c[0] - 1 >= 0 and c[1] + 1 < m:
                        c[0] -= 1
                        c[1] += 1
                    else:
                        if c[1] < m - 1:
                            start = [c[0], c[1] + 1]
                        else:
                            if c[0] < n - 1:
                                start = [c[0] + 1, c[1]]
                            else:
                                return res
                        up = False
                        break

                else:
                    if c[0] + 1 < n and c[1] - 1 >= 0:
                        c[0] += 1
                        c[1] -= 1
                    else:
                        if c[0] < n - 1:
                            start = [c[0] + 1, c[1]]
                        else:
                            if c[1] < m - 1:
                                start = [c[0], c[1] + 1]
                            else:
                                return res
                        up = True
                        break

            if start == [n - 1, m - 1]:
                res.append(A[n - 1][m - 1])
                break

        return res









