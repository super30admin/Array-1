"""
Create a pair of lists for top and bottom diagonal boundaries (This could be an iterator and not necessarily an actual list)
Delepnding on whether the sum of the diagonal elements are odd or even traverse from top to 
bottom or bottom to top

Time Complexity - O(MN)
Space Complexity O(1)
"""
class Solution(object):
    def findDiagonalOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        
        M = len(matrix)
        if M == 0 :
            return []
        N = len(matrix[0])
        if N == 0 :
            return []

        result = []
        for r,l in zip([(i,0)  for i in range(M) ] + [(M-1,i) for i in range(1,N) ], \
            [(0,i) for i in range(N) ] + [(i,N-1)  for i in range(1,M) ]) :
            start,stop = l,r
            dir = -1
            if (l[0] + l[1]) %2 == 0 : # even hence going down 
                start,stop = r,l
                dir = 1
            while (start[0] != stop[0]) and (start[1] != stop[1]) :
                result.append(matrix[start[0]][start[1]])
                start = (start[0] - dir , start[1] + dir)
            result.append(matrix[start[0]][start[1]])
        return result
