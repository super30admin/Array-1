#Time COmplexity=O(n)
#Space Complexity=O(1)
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        top=0                                                           #Creating 4 pointers at first row, first column, last row and last column
        bottom=len(matrix)-1
        m=bottom
        left=0
        right=len(matrix[0])-1
        n=right
        result=[]                                                       #Creating an output array
        i=0
        j=0
        d=1                                                             #creating a direction pointer
        while((top<=bottom or left<right) and len(result)<(m+1)*(n+1)): #while the pointers dont intersect and output array does not over grow
            row=matrix[i]                                               #Obtain the ith row from the matrix
            elem=row[j]                                                 #obtain the jth element of the row
            result.append(elem)                                         #append the element to the output array
            if d==1:                                                    #if moving left to right
                if j<right:                                             #increment the columns
                    j+=1
                else:                                                   #on last column change direction to down and decrement right pointer
                    d=2
                    right-=1
            if d==2 :                                                   #if moving downwards
                if i<bottom:                                            #increment rows
                    i+=1
                else:                                                   #on last row change direction to left and decrement the bottom pointer
                    d=-1
                    bottom-=1
            if d==-1 :                                                  #if moving left
                if j>left:                                              #decrement column
                    j-=1
                else:                                                   #On first column change direction to top and increment the left pointer
                    d=-2
                    left+=1
            if d==-2 :                                                  #if moving upwards
                if i>top+1:                                             #decrement the rows
                    i-=1
                else:                                                   #change direction to right and increment the top pointer
                    d=1                                                 #also intitialize the start point of next spiral
                    top+=1
                    i=top
                    j=left
        return result                                                   #returning the output array