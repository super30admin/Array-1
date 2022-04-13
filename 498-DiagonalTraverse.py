#Time Complexity : O(N ) where N is number of elements
# Space Complexity : O(1) as same result list is being used for computation. No additional list used
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this :
 def findDiagonalOrder(mat):
        
        m = len(mat)
        n = len(mat[0])
        output = [0] * (m * n)
        print('output',output)
        r = 0
        c = 0
        index = 0 # output array
        dir = 1
        
        while (index < m * n):
            print('index',index)
            output[index] = mat[r][c]
            index = index + 1
            
            if dir == 1:
                if c == n - 1:
                    dir = -1
                    r+=1
                elif r == 0:
                    dir = -1
                    c+=1 
                else:
                    r-=1
                    c+=1
            else:
                if r == m - 1:
                    dir = 1
                    c+=1
                elif c == 0:
                    dir = 1
                    r+=1
                else:
                    r+=1
                    c-=1
        return output
                


findDiagonalOrder([[1,2,3],[4,5,6],[7,8,9]])                