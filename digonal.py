class Solution:#time O(m*n) O(1)
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if len(mat)==0 or mat==None:return []
        d=1
        r=len(mat)
        c=len(mat[0])
        mr=0
        mc=0
        i=0
        res=[None]*(r*c)
        while(i<(r*c)):
            res[i]=mat[mr][mc]
            if d==1:
                if mc+1>c-1:
                    mr+=1
                    d=0
                elif mr-1<0:
                    mc+=1
                    d=0
                else:
                    mr-=1
                    mc+=1
            else:
                if mr+1>r-1:
                    mc+=1
                    d=1
                elif mc-1<0:
                    mr+=1
                    d=1
                else:
                    mc-=1
                    mr+=1
            i+=1
        return res
