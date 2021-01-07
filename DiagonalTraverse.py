# // Time Complexity :O(n*m) where n and m are no of columns of the matrix
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :yes

class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        if(matrix==[]):
            return []
        result=[]
        i=0
        j=0
        dr=1
        
        while(len(result)<len(matrix)*len(matrix[0])):
            result.append(matrix[i][j])
            if(dr==1):
                if(j==len(matrix[0])-1):
                    i=i+1
                    dr=-1
                elif(i==0):
                    dr=-1
                    j=j+1
                else:
                    i-=1
                    j+=1
            else:
                if(i==len(matrix)-1):
                    j=j+1
                    dr=1
                elif(j==0):
                    dr=1
                    i=i+1
                else:
                    i+=1
                    j-=1
                    
        return result
                