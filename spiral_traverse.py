# Time complexity is O(m*n) and Space complexity O(1)
# Important notice on taking care of how a Python for loops runs especially when going from bottom to top and right to left. i.e decremental loops.


class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix: return []
        top,left,right,bottom = 0,0,len(matrix[0])-1,len(matrix)-1
        result = []
        while top <= bottom and left <= right:
            if top <= bottom and left <= right:
                for i in range(left,right+1):
                    result.append(matrix[top][i])
                top += 1
            if top <= bottom and left <= right:
                for i in range(top,bottom+1):
                    result.append(matrix[i][right])
                right += -1
            if top <= bottom and left <= right:
                for i in range(right, left-1,-1):
                    result.append(matrix[bottom][i])
                bottom += -1
            if top <= bottom and left <= right:
                for i in range(bottom, top -1,-1):
                    result.append(matrix[i][left])
                left += 1
        return result
