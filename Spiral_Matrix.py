# Created by Aashish Adhikari at 10:23 PM 1/6/2021

'''
Time Complexity:
O(m .n)

Space Complexity:
O(1)


'''


class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """

        t = 0
        b = len(matrix) - 1
        l = 0
        r = len(matrix[0]) - 1



        arr = []

        while t <= b and l <= r:


            # from left to right
            for idx in range(l, r+1):
                arr.append(matrix[t][idx])
            t += 1


            # from top to bottom
            if t <= b and l <= r:
                for idx in range(t, b+1):
                    arr.append(matrix[idx][r])
                r -= 1



            # from right to left
            if t <= b and l <= r:
                for idx in range(r, l-1, -1):
                    arr.append(matrix[b][idx])
                b -=1

            # from bottom to top
            if t <= b and l <= r:
                for idx in range(b, t-1, -1):
                    arr.append(matrix[idx][l])
                l += 1



        return arr











        