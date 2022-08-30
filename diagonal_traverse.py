# // Time Complexity : O(m*n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Three line explanation of solution in plain english

# // Your code here along with comments explaining your approach

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if len(mat)==0 or mat == None:
            return []
        
        #Keeping Direction 1 to go up and -1 to go down
        dir=1
        rows=len(mat)
        cols=len(mat[0])
        result=[0]*(rows*cols)
        r,c=0,0
        ind=0
        
        #looping till the end of the matrix list
        while ind<len(result):
            result[ind]=mat[r][c]
            ind+=1

            #If up then check 3 conditions
            if dir==1:
                if c==cols-1:
                    #increase the row and go down
                    r+=1
                    dir=-1

                elif r==0:
                    #Increase the col and go down
                    c+=1
                    dir=-1
                else:
                    #increase the col and row and go side
                    r-=1
                    c+=1
            
            #If down then mirror of the above code
            else:
                if r==rows-1:
                    #increase the col and go up
                    c+=1
                    dir=1
                elif c==0:
                    #increase the row and go up
                    r+=1
                    dir=1
                else:
                    #increase both and go sideways
                    c-=1
                    r+=1
        
        return result
        