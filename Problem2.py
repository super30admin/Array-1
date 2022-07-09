'''
Problem 2
Given a matrix of M x N elements (M rows, N columns), return all elements of the matrix in diagonal order as shown in the below image.

Example:

Input:

[

[ 1, 2, 3 ],

[ 4, 5, 6 ],

[ 7, 8, 9 ]

]

Output: [1,2,4,7,5,3,6,8,9]
'''

'''
Time Complexity : O(MN)
Space Complexity : 0(1)
'''

'''
Approach : 
check if it should do up(+1) or down(-1)
if(up):
    check if it reaches end or edges of matrix if yes then change directions and changes rows
    else chnage colums  and rows
repeat same for down
'''

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m = len(mat)
        n = len(mat[0])
        result = []
        index = 0
        row= 0 
        col = 0
        dir = 1
        result = [None] * (m*n)
        while(index <m*n):
            result[index] = mat[row][col]
            index = index +1
            if(dir == 1):
                if(col == n-1):
                    dir = -1
                    row = row + 1
                elif(row == 0):
                    col = col +1
                    dir = -1
                
                else:
                    row = row -1
                    col = col + 1
                
            else :
                if(row == m-1):
                    
                    dir = 1
                    col = col +1
                    
                    
                elif(col == 0):
                    dir = 1
                    row = row + 1
                    
                else :
                    row = row +1
                    col = col -1
                
        return result
