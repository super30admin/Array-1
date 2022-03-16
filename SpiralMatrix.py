# Time Complexity : O(rows*cols)
# Space Complexity : O(rows*cols)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# The pattern here is that the spiral goes in the manner of index sums (i+j) which go in the order
#  0...5 and then in a reverse way again.
# So we will store this information in a hashmap by storing values according to (i+j) sum as keys
# We first traverse in straight manner and then in a reversed manner.
from typing import List
from collections import defaultdict
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        diagonalSums=defaultdict(list)
        for i in range(len(matrix)):
            for j in range(len(matrix[0])):
                diagonalSums[i+j].append(matrix[i][j])
        
        res=[]
        while len(res)<len(matrix)*len(matrix[0]):
            for i in list(diagonalSums.items()):
                if i[1]:
                    res.append(i[1].pop(0))

            for i in reversed(list(diagonalSums.items())):
                if i[1]:
                    res.append(i[1].pop(-1))

        
        return res
        
        
        