class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        ROWS, COLS = len(mat), len(mat[0])
        res = []
        i, j = 0, 0
        up = 1

        while len(res) < ROWS * COLS:
            if up:
                res.append(mat[i][j])
                i-=1
                j+=1

                if i < 0 and j < COLS:
                    i+=1
                    up = 0
                elif j == COLS:
                    i+=2
                    j-=1
                    up = 0
                
            else:
                res.append(mat[i][j])
                i += 1
                j -= 1

                if j < 0 and i < ROWS:
                    j+=1
                    up=1
                elif i == ROWS:
                    i-=1
                    j+=2
                    up=1

        return res
                














        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        r = 0
        c = 0
        going_up = True
        res = []

        while len(res)!= ROW*COL:
            if going_up:
                while r>=0 and c < COL:
                    print(r, c)
                    # if r>=0 and c < COL:
                    res.append(mat[r][c])
                    r -= 1
                    c += 1
                        
                if c == COL:
                    r += 2
                    c -= 1
                else:
                    r += 1

                going_up = False

            else:
                while r < ROW and c >=0:
                    # if r < ROW and c >=0:
                    res.append(mat[r][c])
                    r += 1
                    c -= 1
            
                   
                if  r == ROW:
                    r -= 1
                    c += 2
                else:
                    c += 1
                
                going_up = True
        return res

































        # cur_row = cur_col = 0

        # res = []

        # #Two cases . Going up and Going down
        # going_up = True

        # while len(res)!= ROWS * COLS:

        #     if going_up:
        #         while cur_row >= 0 and cur_col < COLS:
        #             res.append(mat[cur_row][cur_col])
                
        #             cur_row -= 1
        #             cur_col += 1

        #         #could be two violations - row out of bound, and row, col both out of bound(diagonal chya var)
        #         if cur_col == COLS:
        #             cur_row += 2
        #             cur_col -= 1
                
        #         else:
        #             cur_row += 1

        #         going_up = False

        #     else:
        #         while cur_row < ROWS and cur_col >=0:
        #             res.append(mat[cur_row][cur_col])

        #             cur_row += 1
        #             cur_col -= 1

        #         #could be again two cases
        #         if cur_row == ROWS:
        #             cur_row -= 1
        #             cur_col += 2
        #         else:
        #             cur_col += 1

        #         going_up = True
        # return res




