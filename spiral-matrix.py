"""
Runtime Complexity:
O(m*n) -  because we iterate 'm' rows and 'n' columns to compute our result array.
Space Complexity: O(1) - because we just return the array. No extra data structure was used to construct the result.
Yes, the code worked on leetcode.
The idea behind the algorithm is to define the bounderies using top, bottom, left, right pointers and iterate respectively in spiral manner.
"""

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if len(matrix) ==0:
            return []
        m = len(matrix)
        n = len(matrix[0])
        result = []
        top, left = 0,0
        bottom, right = m-1,n-1
        while(top<=bottom and left<=right):
            for i in range(left,right+1):
                result.append(matrix[top][i])
            top+=1
            
            if left<=right:
                for i in range(top,bottom+1):

                    result.append(matrix[i][right])
                right-=1
            
            
            if (top<=bottom) and (left<=right):
                for i in range(right,left-1,-1):

                    result.append(matrix[bottom][i])
                bottom-=1
            
            if (top<=bottom) and (left<=right):
                for i in range(bottom,top-1,-1):
                    result.append(matrix[i][left])
                left+=1
        return result