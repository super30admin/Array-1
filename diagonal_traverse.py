'''
Time complexity: O(N*M)
Space complexity: O(N*M)
'''

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        rows = len(mat)
        cols = len(mat[0])
        res = []
        going_up = True # false meaning we are going down
        i = j = 0

        while len(res) != rows * cols:
            if going_up:

                while i>=0 and j<cols:
                    res.append(mat[i][j])
                    i -=1 
                    j +=1 

                if j == cols:
                        i += 2
                        j -= 1
                elif i < 0:
                    i += 1
                going_up = False
            else:
                while i <rows  and j>=0:
                    res.append(mat[i][j])
                    i +=1 
                    j -=1
                
                if i == rows:
                    j += 2 
                    i -= 1 
                elif j < 0:
                    j +=1 
                
                going_up = True
        
        return res
                


            
            

        