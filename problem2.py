# // Time Complexity : O(m*n)
# // Space Complexity : O(nm)
# // Did this code successfully run on Leetcode : Yes
# // Three line explanation of solution in plain english
#Kept track of the direction. Kept changing the direction when a certain conditon was met.
# // Your code here along with comments explaining your approach

class Solution(object):
    def findDiagonalOrder(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: List[int]
        """
        ans = []
        rows = len(mat)
        cols = len(mat[0])
        i = 0
        j = 0
        direction = 1
        count = 0

        while (count < (rows*cols)):
            ans.append(mat[i][j])
            if (direction == 1):
                if (j == cols-1):
                    i = i + 1
                    direction = -1
                elif (i == 0):
                    j = j + 1
                    direction = -1
                else:
                    i = i - 1
                    j = j + 1
            else:
                if (i == rows-1):
                    j = j + 1
                    direction = 1
                elif (j == 0):
                    i = i + 1
                    direction = 1
                else:
                    i = i + 1
                    j = j - 1
            count = count + 1

        return ans

