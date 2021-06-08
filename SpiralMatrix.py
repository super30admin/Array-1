class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        row = len(matrix)
        column = len(matrix[0])
        # arr=[0 for i in range(0,row*column)]
        arr = []
        r1,c1 = 0,0
        r2= row-1
        c2= column-1
        while r1<=r2 and c1<=c2:
            for j in range(c1, c2+1):
                arr.append(matrix[r1][j])
            r1+=1
            if c1<=c2:
                for j in range(r1, r2+1):
                    arr.append(matrix[j][c2])
                c2-=1
            if r1<=r2:
                for j in range(c2, c1-1,-1):
                    print(r2,j)
                    arr.append(matrix[r2][j])
                r2-=1
            if c1<=c2:
                for j in range(r2,r1-1,-1):
                    arr.append(matrix[j][c1])
                c1+=1
        return arr
    
""" Time complexity - O(mn) as we are traversing through all elemnets of the array
Space complexity - O(1)"""
                            
                    
                
             
                
             
            
        