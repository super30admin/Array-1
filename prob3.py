# Spiral matrix
# Time complexity: O(m*n)
# Space complexity: O(1)

class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        left,right= 0 ,len(matrix[0])
        top,bottom= 0 ,len(matrix)
        res = []
        while left<right and top<bottom:
            # Traverse the top row from left to right
            for i in range(left,right):
                res.append(matrix[top][i])
            top+=1
            # Traverse the right column from top to bottom
            for i in range(top,bottom):
                res.append(matrix[i][right-1])
            right-=1
            # Check if we still have a valid pointer to traverse
            if not (left<right and top<bottom):
                break
            # Traverse the bottom row from right to left
            for i in range(right-1,left-1,-1):
                res.append(matrix[bottom-1][i])
            bottom-=1
            # Traverse the left column from bottom to top
            for i in range(bottom-1,top-1,-1):
                res.append(matrix[i][left])
            left+=1

        return res

            