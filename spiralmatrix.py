#time complexity:o(m+n) where m and 
#space complexity:
#passed all cases on LeetCode:
#difficulty faced:
# comments:in the code
#https://leetcode.com/problems/spiral-matrix
class Solution:
    def spiralOrder(self, matrix: 'List[List[int]]') -> 'List[int]':
        
        m = len(matrix)
        n = len(matrix[0])
        top = 0
        bot = m-1
        left = 0
        right = n-1
        res = []
        
        while(top <= bot and left <= right):
            
            #move from left to right
            for i in range(left,right+1):
                res.append(matrix[top][i])
            top += 1
            
            #move from top tp bottom
            for i in range(top,bot+1):
                res.append(matrix[i][right])
            right -= 1
            
            #these if conditions are needed so that we 
            if top <= bot:
            #move from right to left
                for i in range(right,left-1,-1):
                    res.append(matrix[bot][i])
                bot -= 1
            if left <= right:
            #move from bot to top
                for i in range(bot,top-1,-1):
                    res.append(matrix[i][left])
                left += 1
            
        return res
            