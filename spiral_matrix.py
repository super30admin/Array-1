'''

Did it run on leet code: Yes
Time Complexity: 0(N*N)

Challenges: How to exchange row and columns after printing

Algorithm:

- Take two pointers for each row and col.
- After printing the respected row,col you exchange them again.
- For my solution `i` and `k` are my row pointers initially and `j` and `l` are my col pointers

'''

class Solution:
    
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        """
        i- start index of row
        j- start index of col
        k- last index of row
        l- last index of col

        """
        if(len(matrix)==0 ):
            return matrix
        i,j,k,l = 0,0,len(matrix),len(matrix[0])
        result = []
        
        while(i<k and j<l):
            # print i th row
            print(i,j,k,l)
            for num in matrix[i][j:l]:
                result.append(num)    
            i=i+1
            print(i,j,k,l)
            # print l th col
            for num in range(i,k):
                result.append(matrix[num][l-1])
            l=l-1
            
            # print k th row in reverse order
            if i<k:
                for num in matrix[k-1][j:l][::-1]:
                    result.append(num)
                k=k-1
            
            # print j th col in reverse order
            if j<l:
                for num in range(k-1,i-1,-1):
                    result.append(matrix[num][j])
                j=j+1
            
        #print(result)
        return result