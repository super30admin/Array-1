class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        '''
        TC : O(M*N)
        SC : O(1)
        Approach : 
        
        To traverse the elements in diagonal order 
            maintain direction of the traverse when reach the end flip the direction and do this until we traverse all the elements
            for positive direction 
                if we reach the end of the column : change direction and increment row
                else  if we reach the start of the row : change the direction and increment column
                else decrement i and increment j
            for negetive direction 
                if we reach the end of the row : change direction and increment column
                else if we reach strat of the column : change direction and increment row
                else increment i and decrement j
        
        '''
        if not mat or not mat[0]: return  []
        m = len(mat)
        n = len(mat[0])
        result = []
        
        index = 0
        i = 0
        j = 0
        d = 1
        while index < m*n:
            result.append(mat[i][j])
            if d == 1:
                if j == n-1:
                    i += 1
                    d = -1
                elif i == 0:
                    j += 1
                    d = -1
                else:
                    i -= 1
                    j += 1
            else:
                if i == m-1:
                    j += 1
                    d = 1
                elif j == 0:
                    i += 1
                    d = 1
                else:
                    i += 1
                    j -= 1
            index += 1
        return result
                
                
        