from typing import List
# Time Complexity : O(m*n), Where m,n are number of rows,columns in input matrix 
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
'''Three line explanation of solution in plain english: Here we repeatedly add elements from top row, right column, bottom row, left column until 
right crosses the left or top crosses the bottom
'''
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if(matrix==None or len(matrix)==0):
            return []
        #Here let us consider four variables
        output=list()
        top,bottom,left,right=0,len(matrix)-1,0,len(matrix[0])-1
        #print(top,bottom,left,right)
        while(bottom>=top and left<=right):
            #First add the elements on top
            for i in range(left,right+1):
                output.append(matrix[top][i])
            #increment the top
            top+=1
            
            #print(top,bottom,left,right)
            if(bottom>=top and left<=right):
                #Second add the elements on right
                for i in range(top,bottom+1):
                    output.append(matrix[i][right])
                #decrement the right
            right-=1
            
            #print(top,bottom,left,right)
            if(bottom>=top and left<=right):

                #Third add the elements on the bottom
                for i in range(right,left-1,-1):
                    output.append(matrix[bottom][i])
            #decrement the bottom
            bottom-=1
            #print(top,bottom,left,right)
            if(bottom>=top and left<=right):
                #Forth add the elements on the left
                for i in range(bottom,top-1,-1):
                    output.append(matrix[i][left])
            #increment the left
            left+=1
            #print(top,bottom,left,right)
        #print(output)
        return output