'''
Time Complexity --> O(m*n)

Space Complexity -->
O(1)
'''

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        n = len(matrix[0])# end index of column
        m = len(matrix) # end index of row
        k = 0 #start index of row
        l = 0 #start index of column
        ls=[]
        #print(n)
        while l<m and k<n:
            for i in range(l,n):
                ls.append(matrix[k][i])
            k=k+1
            #print(ls)
            
            for i in range(k,m):
                ls.append(matrix[i][n-1])
            
            n=n-1
            
            if k<m:
                for i in range(n-1,l-1,-1):
                    ls.append(matrix[m-1][i])
                m=m-1
            if l<n:
                for i in range(m-1,k-1,-1):
                    ls.append(matrix[i][l])
                l=l+1
            #print(ls)
        return ls
                
        
        