# // Time Complexity :O(n*m) where n and m are no of columns of the matrix
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :yes

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if(matrix==[]):
            return []
        t=0
        b=len(matrix)-1
        l=0
        r=len(matrix[0])-1
        result=[]
        while(t<=b and l<=r):
            for i in range(l,r+1):
                result.append(matrix[t][i])
            t=t+1
            
            for i in range(t,b+1):
                result.append(matrix[i][r])
            r=r-1
            if(t<=b):
                i=r
                while(i>=l):
                    result.append(matrix[b][i])
                    i-=1
                b=b-1
            if(l<=r):
                i=b
                while(i>=t):
                    result.append(matrix[i][l])
                    i-=1
                l=l+1
        return result
    