#Time Complexity :  O(mn)
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : yes
#Any problem you faced while coding this : no




class Solution(object):
    def findDiagonalOrder(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: List[int]
        """
        
        if len(mat)==0:
            return 0
        
        direction = 1
        rows = len(mat)
        cols = len(mat[0])
        row=0 
        col=0
        result = []
        
        while(len(result)<rows*cols):
            result.append(mat[row][col])
            
            if direction == 1:
                if col == cols-1:
                    row=row+1
                    direction =-1
                    
                elif row ==0:
                    col = col+1
                    direction = -1
                    
                else:
                    row = row-1
                    col =col + 1
                    
            else:
                if row == rows-1:
                    col = col+1
                    direction =1
                    
                elif col ==0:
                    row =row +1
                    direction =1
                
                
                else:
                    row = row+1
                    col = col-1
        return result