class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        '''
        Time: O(n^2) since we are visiting every element once
        Space: O(1) if not considering output array
        '''
        x = []
        k=0
        while(len(x)<len(matrix)*len(matrix[0])):
            i = k
            j = k
            while (j<len(matrix[0])-k) and len(x)<len(matrix)*len(matrix[0]):
                x.append(matrix[i][j])
                j+=1
            
            j-=1
            i+=1
            while (i<len(matrix)-k) and (len(x)<len(matrix)*len(matrix[0])):
                x.append(matrix[i][j])
                i+=1
            i-=1
            j-=1
            
            while(j>=k) and (len(x)<len(matrix)*len(matrix[0])):
                x.append(matrix[i][j])
                j-=1
            j+=1
            i-=1
            while(i>k) and (len(x)<len(matrix)*len(matrix[0])):
                x.append(matrix[i][j])
                i-=1
            
            k+=1
            
        return x
