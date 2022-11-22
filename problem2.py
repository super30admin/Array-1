#time complexity: O(m*n)
#sapce complexity: O(m*n)
#ran on leetcode: Yes
#On any occasssion we are traveeling in two directions. dir=1 suggests that we are going
#in upward direction: column index increases and row index decresase. There are 2 
#kinds of border situation which turen the direction to -1 ie downward direction. One
#comdition is we have run out of columns . In such a siutation we would have run out
#of rows as well. In this situtation we should move tho the next row below and column should #be at the right end. 
#  The other condition is where we have gone beyond the 
#top most row. In this case, column stays the same and the row is incremented.In both cases, change the dir to 1.
#for dir=1 , rows are increased and column is decreased. Here too we have to take care
#of 2 boundary condition.
class Solution:
    def findDiagonalOrder(self, mat):
        DIR=1
        i=0
        j=0
        L=[]
        while(True):
            L.append(mat[i][j])
            #print(L)
            if(i>=len(mat)-1 and j>=len(mat[0])-1):
                break
            if(DIR==1):
                i-=1
                j+=1
                if(j>=len(mat[0])):
                    j-=1
                    i+=2
                    DIR*=-1

                elif(i<0):
                    i+=1
                    DIR*=-1
            else:
                i+=1
                j-=1
                if(i>=len(mat)):
                    i-=1
                    j+=2
                    DIR*=-1
                elif(j<0):
                    j+=1
                    DIR*=-1
        return L
s=Solution()
mat = [[1,2,3],[4,5,6],[7,8,9]]
print(s.findDiagonalOrder(mat))
