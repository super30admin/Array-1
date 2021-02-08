"""
54. Spiral Matrix
Time Complexity - O(n*m)
Space Complexity - O(1)
Here we are considering 4 pointers corresponding to 4 borders
top = 0,bottom = No of Rows -1,left = 0,right = no of columns -1
While loop condition top <= bottom and left <= right
    i)Moving from left to right store elements and then change top += 1
    ii) Top to bottom and store elements and then change right -= 1
    
    if(left <= right and top <= bottom)
        iii) right to left and store elements and then change bottom -= 1
        iv) bottom to top and store elements and change left += 1
"""
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if matrix == None or len(matrix) == 0 or len(matrix[0]) == 0 :
            return 0
        output =[]
        m = len(matrix)
        n = len(matrix[0])     
        top = 0 
        bottom = m-1
        left = 0 
        right = n-1    
        while(top <= bottom and left <= right):
            for i in range(left,right+1):
                output.append(matrix[top][i])
            top += 1
            
            for i in range(top,bottom+1):
                output.append(matrix[i][right])
            right -= 1
            if(top <= bottom and left <= right):
                for i in range(right,left-1,-1):
                    output.append(matrix[bottom][i])
                bottom -= 1

                for i in range(bottom,top-1,-1):
                    output.append(matrix[i][left])
                left += 1
        
        return output
                
        