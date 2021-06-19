class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        
        #If matrix is empty return an empty array
        if not mat:
            return []
        
        #Store length of rows and columns in m and n
        m = len(mat)
        n = len(mat[0])
        
        r,c = 0,0
        
        #Store length of matrix values in product
        #Also initialize the values to be 0
        product = m*n
        diagonal = [0]*product
        
        #Loop over till the length of m*n values
        for i in range(product):
            
            #Store the value in diagonal array
            diagonal[i] = mat[r][c]
            
            #Going upside
            if (r+c) % 2 == 0:
                
                if (c == n-1):
                    r +=1
                elif (r == 0):
                    c +=1
                else:
                    r -=1
                    c +=1
                    
            #Going downside
            else:
                if (r == m-1):
                    c +=1
                elif (c == 0):
                    r +=1
                else:
                    r +=1
                    c -=1
            
        return diagonal

#This problem outputs the diagonal traversal of elements 
#Time complexity - O(m*n)
#Space complexity - O(1)