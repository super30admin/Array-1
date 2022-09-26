'''
Time Complexity: O(N*M)
Space Complexity: O(1)
'''
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        dire = 1
        row = 0
        col = 0
        rowlen = len(mat)
        collen = len(mat[0])
        op = []
        while(True):
            op.append(mat[row][col])
            if(row == rowlen-1 and col== collen-1):
                break
            if(dire==1):
                if(col==collen-1):
                    dire = -1
                    row += 1
                elif(row==0):
                    dire = -1
                    col += 1
                else:
                    row -=1
                    col +=1
            else:
                if(row == rowlen-1):
                    dire = 1
                    col +=1
                elif(col==0):
                    dire = 1
                    row += 1
                else:
                    row += 1
                    col -= 1
        return op
        
        