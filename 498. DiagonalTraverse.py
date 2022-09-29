## passed on LC
## TC: O(M*N)
## SC: O(1)


class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if len(mat)==0:
            return 0
        m = len(mat)
        n = len(mat[0])
        result_list = [0]*(m*n)
        i = 0
        direction = 1 
        row = 0
        col = 0
        while i < m*n:
            print(mat[row][col])
            result_list[i]=mat[row][col]
            if (direction ==1):
                print("hi")
                if col == n-1:
                    direction = -1
                    row = row+1
                elif row == 0:
                    direction = -1
                    col = col+1
                else:
                    row = row-1
                    col = col+1
    
            else:
                print("hellow")
                if row==m-1:
                    direction = 1
                    print("this",col+1)
                    col=col+1
                elif col == 0:
                    print("thiss",col+1)
                    direction = 1
                    row=row+1
                else:
                    row = row+1
                    col = col-1
            i+=1
        return result_list