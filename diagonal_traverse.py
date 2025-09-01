'''
Flag for diagonal up and diagonal down. Checks 
    1) when going up:
        - hit the top and right
        - hit only top
        - hit only right
    2) when going down:
        - hit bottom and left
        - hit only bottom
        - hit only left
Time complexity: O(mxn) - iterating over all elements in the matrix
Space Complexity: O(1) - if answer is not included 
'''
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        answer = []

        rows = len(mat)
        cols = len(mat[0])
        r = 0
        c = 0
        diagonal_flag = True # up - True, down - False 
        while len(answer)<rows*cols: 
            answer.append(mat[r][c])

            # diagonal up
            if diagonal_flag:
                # update row and col
                r = r - 1 # upper row
                c = c + 1 # right col
                
                # hit the top and not hitting right, iterate to next row but keep same col
                if r<0 and c<=cols-1:
                    r = r + 1
                    diagonal_flag = False
                elif r<0 and c == cols: # hitting top and hitting right
                    r = r + 2
                    c = c - 1
                    diagonal_flag = False
                elif c==cols: # hit the right, iterate to row + 2 and col - 1
                    r = r + 2
                    c = c - 1
                    diagonal_flag = False

            # diagonal down
            else:
                # update row and col
                r = r + 1 # bottom row
                c = c - 1 # left col

                # if hit the bottom and not hitting left, iterate to col + 2 and row - 1
                if r==rows and c>=0:
                    r = r - 1 
                    c = c + 2
                    diagonal_flag = True
                elif r == rows and c == -1: # hitting the bottom and left too
                    r = r - 1 
                    c = c + 2
                    diagonal_flag = True
                elif c==-1: # hit left, keep the same row, iterate to col + 1
                    c = c + 1
                    diagonal_flag = True
        
        return answer
            