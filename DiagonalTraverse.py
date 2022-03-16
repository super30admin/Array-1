# Time Complexity : O(rows*cols)
# Space Complexity : O(rows*cols)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# The pattern here is that all the elements with same index sum(i+j) will belong in the same diagonal
# So we will store this information in a hashmap
# If their addition sums up to an even number then the diagonal is heading in a downwards manner and is appended to the
# result in a sequential manner and reversed if otherwise.

from typing import List
from collections import defaultdict
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        diagonalSums=defaultdict(list)
        for i in range(len(mat)):
            for j in range(len(mat[0])):
                diagonalSums[i+j].append(mat[i][j])
        
        res=[]
        for i in diagonalSums.items():
            if i[0]%2==1:
                [res.append(x) for x in i[1]]
            else:
                [res.append(x) for x in i[1][::-1]]
        
        return res