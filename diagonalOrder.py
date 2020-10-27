#Timecomplexity O(m*n)
#Spacecomplexity O(1) 

class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        if matrix==[]: return []
        m = len(matrix)
        n = len(matrix[0])
        result=[_ for _ in range(len(matrix)*len(matrix[0]))]
        
        d = 1
        idx = 0
        i,j = 0,0
        while(idx < (m*n)):
            print(idx)
            print(result[idx],len(result))
            result[idx] = matrix[i][j]
            if d == 1:
                if j == (n-1):
                    i+=1
                    d = -1
                elif i == 0:
                    j+=1
                    d = - 1
                else:
                    i-=1
                    j+=1
                
            else:
                if i == (m-1):
                    j+=1
                    d = 1
                elif j == 0:
                    i+=1
                    d = 1
                else:
                    i+=1
                    j-=1
            idx +=1
        return result
            
        