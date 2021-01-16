#TimeComplexity=O(n)
#Space Complexity=O(1)
class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        if len(matrix)==0:                      #If matrix is empty return an empty matrix
            return matrix
        r=len(matrix)-1                         #retrieving the number of rows
        c=len(matrix[0])-1                      #retrieving the number of columns
        result=[]                               #output array
        i=0                                     #row pointer intitialized
        j=0                                     #column pointer initialized
        d=1                                     #Direction pointer initialization
        while(len(result)<(r+1)*(c+1)):         #while loop runs until all elements are appended in the output array
            relem=matrix[i]                     #retrieving the i'th row
            elem=relem[j]                       #retrieving the j'th column of i'th row
            result.append(elem)                 #appending the element to the output array
            if d==1:                            #if moving upwards
                if j==c:                        #if currently in last column change direction and move to next row
                    d=-1
                    i+=1
                elif i==0:                      #if currently in first row change direction and move to next column
                    d=-1
                    j+=1
                else:                           #increment the column and decrement the row
                    i-=1
                    j+=1
            elif d==-1:                         #if moving downwards
                if i==r:                        #if currently in last row change direction and move to next column
                    d=1
                    j+=1
                elif j==0 :                     #if currently in first column change direction and move to next row
                    d=1
                    i+=1
                else:                           #increment the row and decrement the column
                    i+=1
                    j-=1
        return result                           #return the output array