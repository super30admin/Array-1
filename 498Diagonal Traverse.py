
# Time Complexity :O(mn)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode :Yes


class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        
        if len(mat)==0 or mat==None: 
            return []
        
        dirt= 1
        rows=len(mat)
        cols=len(mat[0])
        ind=0
        r=0
        c=0
        res_arr = []
        while(r<rows and c<cols):
            res_arr.append(mat[r][c])
            if dirt == 1:
                if c+1>cols-1:
                    r+=1
                    dirt=-1
                elif r-1<0:
                    c+=1
                    dirt=-1
                else:
                    r=r-1
                    c=c+1
            else:  
                if r + 1 > rows - 1:
                    c+=1
                    dirt=1
                elif c - 1 < 0:
                    r+=1
                    dirt=1
                else:
                    r += 1
                    c -= 1
            ind += 1
        return res_arr         
    
        