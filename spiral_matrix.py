# time complexity: O(mn)
# space complexity: O(1)
# Approach: have 4 pointers top, left , bottom , right
# run loop until top<=bottom, left<= right
# have conditions for 4 directions



class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m = len(matrix)
        n = len(matrix[0])
        top, left,right, bottom = 0,0, n-1, m-1
        result = []
        while(top <= bottom and left <= right):
            # left to right
            for i in range(left,right+1):
                result.append(matrix[top][i])
            top = top + 1
            #top to bottom
            for i in range(top, bottom+1):
                result.append(matrix[i][right])
            right = right - 1
            #right to left
            if top <= bottom:
                for i in range(right, left-1, -1):
                    result.append(matrix[bottom][i])
                bottom = bottom - 1
            #bottom to top
            if left <= right:
                for i in range(bottom, top-1, -1):
                    result.append(matrix[i][left])
                left = left + 1
        return result
            
                

        