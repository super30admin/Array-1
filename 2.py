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

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]: # type: ignore
        if mat == None or len(mat) == 0:
            return []
        m = len(mat)
        n = len(mat[0])
        result = [0 for i in range(m*n)]
        index = 0 #on result arr
        r = 0
        c = 0
        flag = 1
        while index < m*n:
            result[index] = mat[r][c]
            index = index+1
            if flag == 1:
                if c == n-1:
                    r = r+1
                    flag = 0
                elif r == 0:
                    c = c+1
                    flag = 0
                else:
                    r = r-1
                    c = c+1
            else:
                if r == m-1:
                    c = c+1
                    flag = 1
                elif c == 0:
                    r = r+1
                    flag = 1
                else:
                    r = r+1
                    c = c-1
        return result                                        

