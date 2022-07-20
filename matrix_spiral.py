#TC => o(m*n)
#SC => o(1) considering output array as constant
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        result = []
        ll =len(matrix) 
        if ll == 0:
            return result
        l = 0
        r = len(matrix[0]) -1
        t = 0
        b = ll-1
        
        while l <= r and t <= b:
            
            # move right 
            for i in range(l, r+1):
                result.append(matrix[t][i])
            
            t +=1
            # move down
            
            for i in range(t, b+1):
                result.append(matrix[i][r])
            r -=1

            # move left
            if t<=b:
                for i in reversed(range(l,r+1)):
                    result.append(matrix[b][i])
                b -=1
                
            # move up
            if l<=r:
                for i in reversed(range(t, b+1)):
                    result.append(matrix[i][l])
                l +=1
        return result