"""
The approach is to keep on moving the spiral order. first print the first row. then the last column
then the last row and then the first column. meanwhile also keep bottom and top pointers and left 
and right pointers. increment and decrement those accoridingly to the required path of printing.

Leetcode running.
Time complexity and space compexity - O(N), O(1)
"""
def spiralOrder(self, matrix):
        if not matrix:
            return []
        top = 0
        bottom = len(matrix) - 1
        lc = 0
        rc = len(matrix[0]) - 1
        res = []
        
        

        while top<= bottom and lc <= rc:
            
            for i in range(lc,rc+1):
                res.append(matrix[top][i])
            top += 1
            
            for i in range(top,bottom+1):
                res.append(matrix[i][rc])
            rc -= 1
            
            if top <= bottom:
                for i in range(rc,lc-1,-1):
                    res.append(matrix[bottom][i])
                bottom -= 1
                
            if lc <= rc:
                for i in range(bottom,top-1,-1):
                    res.append(matrix[i][lc])
                lc += 1
        return res