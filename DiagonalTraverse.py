#TC: O(m*n)
#SC: O(1)
class Solution(object):
    def findDiagonalOrder(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: List[int]
        """
        n=len(mat[0])
        m=len(mat)
        i=0
        j=0
        li=[]
        dire=1
        idx=0
        while(idx< m*n):
            li.append(mat[i][j])
            if(dire==1):
                if i==0 and j!=n-1:
                    j=j+1
                    dire=-1
                elif j==n-1:
                    i=i+1
                    dire=-1
                else:
                    i=i-1
                    j=j+1
                idx+=1
                
            elif(dire==-1):
                if i==m-1:
                    j=j+1
                    dire=1
                elif j==0 and i!=m-1:
                    i=i+1
                    dire=1
                else:
                    i=i+1
                    j=j-1
                idx+=1
        return li
