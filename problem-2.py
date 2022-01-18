# Leetcode: YES 
# Time Complexity: O(mxn)
# Space Complexity: O(1)
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        result=[]
        # if we have only ine colum then we handle it and return the result
        if len(mat[0])<=1:
            for x in mat:
                result.append(x[0])
            return result
        # else case we add the first 0 row and 0 col to the array and then we mov pur pointer to row 0 and col 1 and we move down 
        # move ==0 is move down and ==1 is move up diagnally. 
        result=[mat[0][0]]
        i=0
        j=1
        move=0
        # loop  until we record all the elements in the array
        while(i<len(mat) and j<len(mat[0])):
            result.append(mat[i][j])
            # record every element in the curr pos
            # check what movement we are in 
            if move==0:
                # moving down decement col and increment row
                j-=1
                i+=1
                
                # three condition to stop and move up 
                if j<0 or i >=len(mat):
                    move=1
                    if j<0 and i>=len(mat):
                        i-=1
                        j+=2
                    elif j<0:
                        j+=1
                    elif i>=len(mat):
                        i-=1
                        j+=2
                    
            else:
                # movig up we increment col and decement row
                
                j+=1
                i-=1
                # three conditon to stop and move down hand all 
                if j>=len(mat[0]) or i <0:
                    move=0
                    if j>=len(mat[0]) and i <0:
                        j-=1
                        i+=2
                    elif i<0:
                        i+=1
                    elif j>=len(mat[0]):
                        j-=1
                        i+=2
                    
            # print(i,j)
        return result
                
            
        