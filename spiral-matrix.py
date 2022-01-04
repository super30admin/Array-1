'''

TC: O(n*m)
SC: O(1)

Intuition: have four pointers - top, left, right, bottom

'''
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        rlen = len(matrix)
        if not rlen:
            return []
        clen = len(matrix[0])
        
        top, left, right, bottom = 0, 0, clen - 1, rlen - 1
        res = []
        
        while top <= bottom and left <= right:
            
            if top <= bottom:
                for j in range(left, right + 1):
                    res.append(matrix[top][j])
                top += 1
            
            if left <= right:
                for i in range(top, bottom+1):
                    res.append(matrix[i][right])
                right -= 1
            
            if top <= bottom:
                for j in range(right, left -1 , -1):
                    res.append(matrix[bottom][j])
                bottom -= 1
            
            if left <= right:
                for i in range(bottom, top - 1, -1):
                    res.append(matrix[i][left])
                left += 1
            
        return res
        