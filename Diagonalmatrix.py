#time complexity : O(m*n) i.e as the loop travels to all m*n elements
#space complexity : O(1)
#Did this code successfully run on Leetcode : Yes
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m = len(mat)
        n = len(mat[0])
        if mat == None:
            return []
        row = 0
        column = 0
        direction = 1
        #defining result matrix
        result = []
        index = 0
        while (row in range(0,m)) and (column in range(0,n)):
            result.append(mat[row][column])
            
            if direction == 1:
                
                if row==0 and column!=n-1:
                    column +=1
                    direction = -1

                elif column ==n-1:
                    row +=1
                    direction = -1

                else:
                    
                    row -=1
                    column +=1
                    
            else:
                if column == 0 and row != m-1:
                    row +=1
                    direction = 1
                    
                elif row == m-1:
                    column +=1
                    direction = 1
                    
                else:
                    column -=1
                    row +=1
        return result