# Time Complexity : 
# Space Complexity:
# Works on leetcode: yes
# Approach: For a diagonal, row+col = constant which varies from 0 to m+n-2. Diagonal either goes from top to bottom or
# bottom to top and directions id determined by even(top to bottom) or odd constant. We keep the dictionary with 
# the constant as key and list of elements for given key. We then iterate through the dictionary, check the key for 
# odd and even and add to result accordingly
import collections
class Solution(object):
    def findDiagonalOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        res = []
        dic  = collections.defaultdict(list)
        for i in range(len(matrix)):
            for j in range(len(matrix[0])):
                dic[i+j+1].append(matrix[i][j])
                
        for k in sorted(dic.keys()):
            if k%2==1:
                dic[k].reverse()
            res += dic[k]
        return res