# Time Complexity :O(n) 
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english

'''
Multiplying the each element in the list with the running product from the left
Once we hae traversed the entire list then resetinng the running product to 1 and multiplying
the list with the running product again and saving it in the result list
'''

# Your code here along with comments explaining your approach


class Solution:
    def productExceptSelf(self, nums):
        if(len(nums)==0):
            return(nums)
        result = []
        rp = 1
        temp = 1
    
        for i in range(len(nums)):
            rp = rp*temp 
            result.append(rp)
            temp = nums[i]
        
        
        rp=1
        temp = 1
    
        for i in range(len(nums)-1,-1,-1):
            rp = rp*temp
            result[i] = result[i]*rp
            temp = nums[i]
        
        return(result)

#**********************************************************************************************
# Problem 2:

# Time Complexity :O(rows*cols) 
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english

'''
Considering 2 directions: One goting upwards and the other going downwards. The upward direction is
assigned 1 and downward is assingned -1.Edge cases: While going upwards if we are on any element of the first
row  except the last element then we go to the next column of the first row and if we are at the last column  the row the we 
traverse to the next row and vice versa for the downward direction.

Logic: while upwards: decreasing row and increasing columns, while going downwards: Increasing row
and decreasing columns
'''
class Solution:
    def findDiagonalOrder(self, matrix):
        rows = len(matrix)
        cols = len(matrix[0])
        result=[]
        
        r = 0
        c = 0
        dir = 1
        
        for i in range((rows*cols)):
            result.append(matrix[r][c]) # adding elemets to the result list
            if(dir ==1):
                if(c == cols-1): # incase of last column, change the row
                    r+=1
                    dir = -1
                    
                elif(r==0): # in case of 1st row change the column
                    c+=1
                    dir=-1 # changing the direction
                else:
                    r-=1 # decreasing row
                    c+=1 # increasing column
            else:
                if(r== rows-1):
                    c+=1 # if at last row move to the next column
                    dir=1
                if(c==0):
                    r+=1 #if at first column move to the next row
                    dir=1
                else:
                    r+=1 # increasing row
                    c-=1 # decreasing column
            
        return(result)

#****************************************************************************************

# Problem 3:

# Time Complexity :O(n^2) 
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english

'''
Taking forur pointers: top: pointing to 1strow, left: pinting to 1st column, right: pointing to last column
and bottom pointing to last row.
Traversing on the first row by moving from left to right once done increase the row by 1
then last column by moving from top to bottom. Once done decrease the right by 1
 then last row by moving from right to left. Once done decrease the bottom by 1 
 then first column by moing from bottom to top. Once done, Increase the left by 1

The above steps will be performed till the left< right or top< bottom
'''

class Solution:
    def spiralOrder(self, matrix):
        result = []
        if(len(matrix)==0 or matrix== []):
            return(result)
        rows = len(matrix)
        col =  len(matrix[0])
        # print(col)
        # print(rows)
       
        
        top = 0
        left = 0
        right = col-1
        bottom = rows-1
        while(top<=bottom and left<=right): # traversing the first row by moving from right to left
            for i in range(left, right+1):
                result.append(matrix[top][i])
            top+=1
            
            for i in range(top, bottom+1): # traversing the last column by moving from top to bottom
                result.append(matrix[i][right])
            right = right-1
                
            if(top<=bottom):
                for i in range(right, left-1,-1): # traversing the last row by moving from left to right
                    result.append(matrix[bottom][i])
                bottom-=1
            if(right>=left):
                for i in range(bottom, top-1,-1): # traversing the 1st column by moving from bottom to top
                    result.append(matrix[i][left])
                left+=1
        return(result)


            

  