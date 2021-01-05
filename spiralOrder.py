# Time Complexity : O(rows * col) .. O(N) number of elements in matrix
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach


class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        """ 
        Initial thoughts:
            - going to need some pointers for boundaries..

        """
        if not matrix:
            return []
        
        res = []
        top = 0
        bot = len(matrix)-1
        left = 0 
        right = len(matrix[0])-1
        current = 0
        while top <= bot and left <= right: 
            #go right
            for col in range(left, right+1):
                res.append(matrix[top][col])
            top += 1 
            #go down
            for row in range(top, bot+1):
                res.append(matrix[row][right])
            right -= 1
            #go left
            if top <= bot:
                for col in range(right, left-1, -1):
                    res.append(matrix[bot][col])
                bot -= 1
            #go up
            if left <= right:
                for row in range(bot, top -1, -1):
                    res.append(matrix[row][left])
            
                left += 1
        return res