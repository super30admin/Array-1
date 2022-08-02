"""
Time Complexity : O(N*M), N: no of row, M:no of cols
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes

Problem 2: Given a matrix of M x N elements (M rows, N columns), return all elements of the matrix in diagonal order as shown in the below image
Example:
Input:

[[ 1, 2, 3 ],

[ 4, 5, 6 ],

[ 7, 8, 9 ]]

Output: [1,2,4,7,5,3,6,8,9]
"""

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        """
        if we move diagonal in upward direction, the row will decrement by one whereas,
        the col will increment by one. If we move downwards, the reverse happens
        """
        if len(mat) == 0: return 0
        if len(mat) == 1: return mat[0]
        
     
        dir_flag = True                         #True: upward direction
        row , col = len(mat), len(mat[0])
        res = [0 for i in range(row*col)]
        r, c = 0,0
        count = 0
        
        while (count < len(res)):
            res[count] = mat[r][c]
            count += 1
            
            # going upward
            if dir_flag == True:
                if (c==col-1):
                    r += 1
                    dir_flag = False
                elif (r==0):
                    c += 1
                    dir_flag = False
                else:
                    r -= 1
                    c += 1
            # goind downward direction       
            elif (dir_flag == False):
                if (r == row - 1):
                    c += 1
                    dir_flag = True
                elif (c == 0):
                    r += 1
                    dir_flag = True
                else:
                    r += 1
                    c -= 1
                
        return res
                    
            
                        
                    
                