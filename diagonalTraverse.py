# // Time Complexity : O(n*m)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Three line explanation of solution in plain english:
# Traverse array diagonally using the directions: up and down
# Maintain track of the end of columns such that when you reach last column you know that row is increased while moving down and vice versa

# // Your code here along with comments explaining your approach
class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        
        if matrix is None or len(matrix)==0:
            return []
        
        m=len(matrix)
        n=len(matrix[0])
        result=[None]*(m*n)
        r, c = 0, 0

        #denotes up direction
        dirn=1
        
        i=0
        # traverse till end of the array
        while i< m*n:
            
            result[i]=matrix[r][c]
            
            #moving in up direction
            if dirn==1:
                if c==n-1:
                    r+=1
                    dirn=-1
                elif r==0:
                    c+=1
                    dirn=-1
                else:
                    r-=1
                    c+=1
            # down direction
            else:
                if r==m-1:
                    c+=1
                    dirn=1
                elif c==0:
                    r+=1
                    dirn=1
                else:
                    r+=1
                    c-=1
            i+=1
        return result