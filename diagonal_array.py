# Time Complexity : O(mn)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : No

# have a dir bool variable to decide whether to go up or down the matrix
# according to the dir move up/down - update values of i and j - coded for corner cases which are the four boundaries of a matrix

class Solution(object):
    def findDiagonalOrder(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: List[int]
        """
        dir1=True
        m=len(mat)
        n=len(mat[0])
        dlen=(m*n)
        ans=[0]*dlen
        
        i, j = 0, 0
        print(ans)
        if(len(mat)==0):
            return ans
        for d in range(dlen):
            print(d)
            if(i<m and j<n):
                ans[d]=mat[i][j]
                print(ans[d])
                if(dir1==True):
                    if(j==n-1):
                        i+=1
                        dir1=False
                    elif(i==0):
                        j+=1
                        dir1=False
                    else:
                        i-=1
                        j+=1  
                else:
                    if(i==m-1):
                        j+=1
                        dir1=True
                    elif(j==0):
                        i+=1
                        dir1=True
                    else:
                        i+=1
                        j-=1
        return ans    
