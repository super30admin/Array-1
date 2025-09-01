'''
At each traverse (right, bottom, left, up), we check if we have hit the wall. if we do, we
update the flag and adjust the current cell row and col idexes. At the same time we also update
the walls of boundaries. 
Time Compexity: O(mxn) - iterating over all cells one time
Space complexity: O(1) - Only int variables for pointing boundaries, current cell and flag
'''

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        answer = []
        rows = len(matrix)
        cols = len(matrix[0])
        
        r=0
        c=0
        flag = 1
        right = cols
        left = -1
        top = -1
        bottom = rows

        while len(answer)<rows*cols:
            answer.append(matrix[r][c])

            # Try right
            if flag ==1:
                c = c + 1
                # if hit the right 
                if c == right:
                    c = c - 1
                    r = r + 1
                    flag = 2
                    top = top + 1
            
            # try bottom
            elif flag == 2:
                r = r + 1
                # if hit the bottom 
                if r == bottom:
                    r = r - 1
                    c = c - 1 
                    flag = 3
                    right = right - 1

            # Try left
            elif flag == 3:
                c = c - 1 
                # if hit the left
                if c == left:
                    c = c + 1
                    r = r - 1
                    flag = 4
                    bottom = bottom - 1

            # Try up
            else:
                r = r - 1
                # if hit the top
                if r == top:
                    r = r + 1
                    c = c + 1
                    flag = 1
                    left = left + 1

        return answer 