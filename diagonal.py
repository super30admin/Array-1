class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        # rows = len(mat)
        # col = len(mat[0])
        # d = {}
        # for i in range(rows):
        #     for j in range(col):
        #         if i+j in d:
        #             d[i+j].append(mat[i][j])
        #         else:
        #             d[i+j]=[mat[i][j]]
        # arr = []
        # for i,j in d.items():
        #     if i%2!=0:
        #         arr.extend(j)
        #     else:
        #         j.reverse()
        #         arr.extend(j)
        # return arr
        rows = len(mat)
        col = len(mat[0])
        dir = True
        count = 0
        res = []
        i =0
        j=0
        while count < rows*col:
            res.append(mat[i][j])
            count+=1
            # up
            if dir: 
                if j == col - 1:
                    i+=1
                    dir = False
                    
                elif i == 0:
                    j+=1
                    dir = False
                else:
                    i-=1
                    j+=1
            else:
                if i == rows-1:
                    j+=1
                    dir = True
                elif j == 0:
                    i+=1
                    dir = True
                else:
                    i+=1
                    j-=1
        return res
        
                


            

        