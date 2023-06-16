# Time Complexity : O(n*m)
# Space Complexity : O(1)

# The code ran on LeetCode

# Maintain 4 pointers to traverse the matrix. Keep updating the pointers and check if they crossed. Traverse the matrix in the order : top row, last column, last row and first column

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        
        m = len(matrix); n = len(matrix[0])

        l = 0; t = 0; r = n-1; b = m-1

        res = []

        while l <= r and t <= b:
            # Traverse top row
            for j in range(l, r+1):
                res.append(matrix[t][j])
            t+=1

            # Last column
            if t <= b:
                for i in range(t, b+1):
                    res.append(matrix[i][r])
                r-=1
            
            # Bottom row
            if t <= b and l <= r:
                for j in range(r, l-1, -1):
                    res.append(matrix[b][j])
                b-=1

            # Left column
            if t <= b and l <= r:
                for i in range(b, t-1, -1):
                    res.append(matrix[i][l])
                l+=1
        return res