// Time Complexity :O(m*n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

//Declare 4 pointers. loop through the matrix and compress the pointers each time pointers cross the elements

class Solution(object):
    def spiralOrder(self, matrix):
            if(len(matrix)==0):
                return []
            top = 0
            bottom = len(matrix)-1
            left = 0
            right = len(matrix[0])-1
            result = []
        
            while(left <= right and top <= bottom):
                for i in range(left,right+1):
                    result.append(matrix[top][i])
                    
                top+=1
                
                for j in range(top,bottom+1):
                    result.append(matrix[j][right])
                    
                right-=1
                if top <= bottom:
                    for k in range(right,left-1,-1):
                            result.append(matrix[bottom][k])
                     
                bottom -=1
                if left<= right:
                
                    for l in range(bottom,top-1,-1):
                        result.append(matrix[l][left])
                        
                left +=1    
            return result          
                    

            
