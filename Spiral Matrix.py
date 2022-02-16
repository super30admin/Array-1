#TC:O(m*n), where m and n are row and column of the matrix
#SC:O(1)
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        fc, fr = 0, 0
        lr = len(matrix) - 1
        lc = len(matrix[0]) - 1
        ans = [ ]
        
        while(fr <= lr and fc <= lc):
            for i in range(fc,lc+1):
                ans.append(matrix[fr][i])
            fr +=1
            for i in range(fr,lr+1):
                ans.append(matrix[i][lc])
            lc -=1
            if fr <= lr:
                for i in range(lc,fc-1,-1):
                    ans.append(matrix[lr][i])
                lr -=1
            if fc <= lc:
                for i in range(lr,fr-1,-1):
                    ans.append(matrix[i][fc])
                fc +=1
        return ans
            