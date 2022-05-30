#Time Complexity : O(M*N)
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : YES
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        row, col = len(mat), len(mat[0])
        dirr = True
        li = []
        i= 0 
        j = 0
        for k in range(0,(row*col)):
            li.append(mat[i][j])
            if dirr:
                if i == 0 and j!= col - 1:
                    j += 1
                    dirr = False
                
                elif j == col - 1:
                    dirr = False
                    i +=1
                    
                else:
                    i -= 1
                    j +=1
                    
            else:

                if i == row - 1:
                    j +=1
                    dirr = True

                elif j == 0:
                    i +=1
                    dirr = True

                else:
                    i +=1
                    j-=1
        
        return li
            