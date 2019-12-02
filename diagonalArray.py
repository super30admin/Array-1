# Time Complexity : Brute Force: O(m*n)
# Space Complexity : Brute Force: O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Logic

class Solution(object):
    def findDiagonalOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        if matrix == [] or len(matrix) == 0:
            return []
        retList = []
        
        row, col = len(matrix), len(matrix[0])
        lookup = {}
        for i in range(row):
            for j in range(col):
                if i+j not in lookup:
                    lookup[i+j] = [matrix[i][j]]
                else:
                    lookup[i+j].append(matrix[i][j])
        
        for key in lookup:
            if key % 2 != 0:
                for val in lookup[key]:
                    retList.append(val)
            else:
                for val in reversed(lookup[key]):
                    retList.append(val)
        return retList