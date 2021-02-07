# // Time Complexity :O(m*n)
# // Space Complexity :)(1)
# // Did this code successfully run on Leetcode : Yes
# // Three line explanation of solution in plain englishclass Solution:

# use TOP, BOTTOM, LEFT, RIGHT pointers 
# while top<=bottom and left<= right:
# use 4 foll loops to go from 
# 1. left to right -> update top++
# 2. top to bot -> right -- 
# 3. right to left -> bot --
# 4. bot to top -> left ++

# in while loop if there are multiple conditions 
# and if we are chanigng variables of that conditions
# always check using if -> if those variable are again used further

    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        
        top = 0 
        bot = len(matrix)-1
        left = 0
        right = len(matrix[0])-1
        res = []
        
        while top <= bot and left <= right:
            
            for i in range(left, right+1):
                res.append(matrix[top][i])
            top += 1

            for i in range(top, bot+1):
                res.append(matrix[i][right])
            right -= 1
            
            if top <= bot:
                for i in range(right, left-1, -1):
                    res.append(matrix[bot][i])
                bot -= 1
            if left <= right:
                for i in range(bot, top-1, -1):
                    res.append(matrix[i][left])
                left += 1
                
        return res
                
        