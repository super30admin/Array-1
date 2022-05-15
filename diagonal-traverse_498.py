#Time Complexity O(MN) Traversing Matrix elements
#Space Complexity O(1) We are just using an array of output
#It successfully runs on leetcode
def findDiagonalOrder(mat):
        r = len(mat)
        c = len(mat[0])
        res= []
        dir, i, j= 1, 0, 0
      
        for _ in range(r*c):
            res.append(mat[i][j])             
            if dir == 1: # Upward Direction
                if i==0 and j!=c-1:
                    j +=1
                    dir = -1
                elif j==c-1:
                    i +=1
                    dir = -1
                else:
                    i-=1
                    j+=1
            else:  # Downward direction
                if j==0 and i!=r-1:
                    i+=1
                    dir = 1
                elif i==r-1:
                    j+=1
                    dir = 1
                else: 
                    i+=1
                    j-=1
            
        return res

print(findDiagonalOrder([[2,5,8],[4,0,-1]]))