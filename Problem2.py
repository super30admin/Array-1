# Time complexity : O(m*n)
# Space complexity : O(1)
# Leetcode : Solved and submitted

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        
        # taking a flag to differentitate the direction of operation, and find the length and width of the matrix
        flag = True
        n = len(mat)
        m = len(mat[0])
        
        if n == 0:
            return []
        
        # creating the output array, and assigning the first element which is at index (0,0) to the resultant array
        res = [0 for _ in range(n*m)]
        rows = 0
        columns = 0
        
        # index is used to keep track of the elements in the array, so that we don't traverse more elements
        idx = 0
        while(idx < len(res)):
            # putting the element of the matrix in the res array when it it visited and then we increment the index counter
            res[idx] = mat[rows][columns]
            idx += 1
            
            # if flag is true, that is we are moving in upward diagonal, then we keep check of the boundaries and move the pointer accordingly 
            # and change the flag , if no boundary, then simply move up the diagonal, and similarly
            if(flag):
                if columns == m-1:
                    rows += 1
                    flag = False
                elif rows == 0:
                    columns += 1
                    flag = False
                else:
                    rows -= 1
                    columns += 1
            else:
            # if flag is false, that is we are moving in downward diagonal, then we keep check of the boundaries and move the pointer accordingly 
            # and change the flag , if no boundary, then simply move down the diagonal, and similarly
                if rows == n-1:
                    columns += 1
                    flag = True
                elif columns == 0:
                    rows += 1
                    flag = True
                else:
                    rows += 1
                    columns -= 1
        
        return res
