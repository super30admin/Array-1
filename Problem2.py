# Given a matrix of M x N elements (M rows, N columns), return all elements of the matrix in diagonal order as shown in the below image.

# Example:

# Input:

# [

# [ 1, 2, 3 ],

# [ 4, 5, 6 ],

# [ 7, 8, 9 ]

# ]

# Output: [1,2,4,7,5,3,6,8,9]

# Solution -> 

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m = len(mat)
        n = len(mat[0])
        result = [0 for i in range(m*n)]
        r = 0
        c = 0
        d = 1
        idx = 0
        while idx < (m*n):
            print(True)
            print(idx)
            result[idx] = mat[r][c]
            idx=idx+1   
            if d==1:
                if (c == (n-1)):
                    r=r+1
                    d = -1
                elif (r==0):
                    c=c+1
                    d = -1
                else:
                    r=r-1
                    c=c+1
            else:
                if (r==(m-1)):
                    c=c+1
                    d = 1
                elif (c==0):
                    r=r+1
                    d = 1
                else:
                    c=c-1
                    r=r+1
        return result
    
# Time Complexity -> o(m*n)
# Space Complexity -> o(1)