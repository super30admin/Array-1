'''
Problem Number: 498. 
Problem Title: Diagonal Traverse

Problem Name: Diagonal Traverse

Source Link: https://leetcode.com/problems/diagonal-traverse/
'''

# Time Complexity : O(m * n) where m is the number of rows and n is the number of columns in the matrix.
# Space Complexity : O(m * n) for the result list which stores the diagonal traversal of the matrix.
# Did this code successfully run on Leetcode : Yes, the code runs successfully on Leetcode.
# Any problem you faced while coding this : Yes, understanding the traversal direction and managing the boundaries of the matrix correctly.

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if not mat or not mat[0]: # agar matrix khali hai ya pehli row khali hai toh empty list return karte hain (if the matrix is empty or the first row is empty, we return an empty list)
            return [] # empty list return karte hain (return an empty list)
        
        m = len(mat) # m ko matrix ki rows ki length se set karte hain (set m to the number of rows in the matrix)
        n = len(mat[0]) # n ko matrix ki columns ki length se set karte hain (set n to the number of columns in the matrix)
        result = [0] * (m * n) # result ko m*n length ki list se initialize karte hain (initialize result with a list of length m*n)
        row = 0 # row ko 0 se initialize karte hain (initialize row to 0)
        col = 0 # col ko 0 se initialize karte hain (initialize col to 0)
        direction = 1 # direction ko 1 se set karte hain (set direction to 1, which means moving upwards)
        # agar direction -1 hai toh hum downwards move karte hain (if direction is -1, we move downwards)
        # agar direction 1 hai toh hum upwards move karte hain (if direction is 1, we move upwards)
        index = 0 # index ko 0 se initialize karte hain (initialize index to 0)

        while index < m * n: # jab tak index m*n se chhota hai (while index is less than m*n)
            result[index] = mat[row][col] # result ke index par current element ko set karte hain (set the current element at result[index])
            index += 1 # index ko increment karte hain (increment index by 1)
            if direction == 1: # agar direction 1 hai toh upwards move karte hain (if direction is 1, we move upwards)
                if col == n - 1: # agar col last column par hai (if col is at the last column)
                    row += 1 # toh row ko increment karte hain (increment row by 1)
                    direction = -1 # direction ko downwards set karte hain (set direction to -1)
                elif row == 0: # agar row first row par hai (if row is at the first row)
                    col += 1 # toh col ko increment karte hain (increment col by 1)
                    direction = -1 # direction ko downwards set karte hain (set direction to -1)
                else: # agar dono conditions nahi hai (if neither condition is true)
                    row -= 1 # toh row ko decrement karte hain (decrement row by 1)
                    col += 1 # aur col ko increment karte hain (and increment col by 1)
            elif direction == -1: # agar direction -1 hai toh downwards move karte hain (if direction is -1, we move downwards)
                if row == m - 1: # agar row last row par hai (if row is at the last row)
                    col += 1 # toh col ko increment karte hain (increment col by 1)
                    direction = 1 # direction ko upwards set karte hain (set direction to 1)
                elif col == 0: # agar col first column par hai (if col is at the first column)
                    row += 1 # toh row ko increment karte hain (increment row by 1)
                    direction = 1 # direction ko upwards set karte hain (set direction to 1)
                else: # agar dono conditions nahi hai (if neither condition is true)
                    row += 1 # toh row ko increment karte hain (increment row by 1)
                    col -= 1 # aur col ko decrement karte hain (and decrement col by 1)
        return result # result ko return karte hain (return the result)
