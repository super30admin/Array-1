"""
Approach is to use spiral recursively for inner squares

Timecomplexity - O(MN)
Space Complexity O(1)

"""

class Solution(object):
    def spiral(self,M,N, offset_x, offset_y,matrix) :
        if M == 1 :
            return [matrix[offset_x][offset_y +i] for i in range(N)]
        if N == 1 :
            return [matrix[offset_x+i][offset_y] for i in range(M)]
        
        return [matrix[0 + offset_x][i + offset_y] for i in range(N-1)] + \
        [matrix[i + offset_x][N-1 + offset_y] for i in range(M-1)] + \
        [matrix[M-1 + offset_x][i + offset_y] for i in range(N-1,0,-1)] +\
        [matrix[i+ offset_x][0 + offset_y] for i in range(M-1,0,-1)]

    
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        result = []
        if not matrix :
            return []
        MAX_M = len(matrix)
        MAX_N = len(matrix[0])
        for i, j in zip(range((MAX_M+1)/2),range((MAX_N+1)/2)) :
            offset_x = i
            offset_y = j
            result += self.spiral(MAX_M - 2*i , MAX_N -2*i ,i ,j,matrix )

        return result        
