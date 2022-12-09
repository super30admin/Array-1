# // Time Complexity : O(mn)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Three line explanation of solution in plain english

## 
class Solution:
    def spiral(self, matrix):

        ## we have print the matrix in a spiral way such that after every round spiral moves in. 
        ##we have 4 markers top, bottom, left, right. while the top bottom dont cross and left right dont cross 
        ## we will be adding elements from left to right, top to botom, right to left and bottom to top. and after each side , 
        ## we either increase/decrease the column or increase or decrease the rows, reducing the matrix size and then continue the adding of element. 
        ## now in the edge cases , we would have done top +=1 and bottom-=1 altering the condition of while loop. if change the condition of while loop while it 
        ## is going on we need to check it in the subsequent code. 
        top = 0
        bot = len(matrix)-1
        left = 0
        right = len(matrix[0])-1
        res = []

        while(top<= bot and left<= right):

            for i in range(left, right+1):
                res.append(matrix[top][i])
            
            top+=1

            for i in range(top,bot+1):
                res.append(matrix[i][right])
            right-=1

            if (top <= bot):
                for i in range(right, left-1,-1):
                    res.append(matrix[bot][i])
            
            bot-=1

            if left<= right:
                for i in range(bot, top-1,-1):
                    res.append(matrix[i][left])
            left+=1
        return res
    def sp(self, matrix):
        top = 0
        bot = len(matrix)-1
        left = 0
        right = len(matrix[0])-1
        res = []

        return self.spiral_recursive(matrix, res, top, bot, left, right)

    def spiral_recursive(self, matrix, res, top, bot, left, right):
        ## here the breaking condition is or  because even if one of the condition breaks we return the result.
        if top> bot or left >right:
            return res
        for i in range(left, right+1):
            res.append(matrix[top][i])
        top+=1

        for i in range(top, bot+1):
            res.append(matrix[i][right])
        
        right-=1

        if top<= bot:
            for i in range(right, left-1,-1):
                res.append(matrix[bot][i])
        bot-=1

        if left<= right:
            for i in range(bot, top-1,-1):
                res.append(matrix[i][left])
        
        left+=1

        return self.spiral_recursive(matrix, res, top, bot, left, right)







