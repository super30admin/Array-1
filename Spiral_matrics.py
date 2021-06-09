from typing import List


class Solution:
    def spiralOrder(self, matrix: List[List[int]], result=None) -> List[int]:
        if len(matrix)==0:
            return result
        m=len(matrix)
        n=len(matrix[0])
        top=0
        bottom=m-1
        left=0
        right=n-1
        result=[]*(m*n)

        while (left<=right and top<=bottom):
            #top row
            for j in range(left,right+1):
                print("T", matrix[top][j])
                result.append(matrix[top][j]) #column changes
            top+=1 #1 2 3
            #right column
            for i in range(top,bottom+1):
                print("R", matrix[i][right])
                result.append(matrix[i][right]) #row changes
            right-=1 #6,9
            #bottom row
            #for j in range(right, left+1):
            j=right
            while (j>=left and bottom>=top):
                print("B", matrix[bottom][j])
                result.append(matrix[bottom][j])#column changes
                j-=1
            bottom-=1 #8,7
            #left column
            i=bottom
            #for i in range(bottom,top+1):
            while(i>=top and right>=left):
                print("L", matrix[i][left])
                result.append(matrix[i][left])#row changes
                i-=1
            left+=1
        return result
            
                
        