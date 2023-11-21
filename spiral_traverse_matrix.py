class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m=len(matrix)
        n=len(matrix[0])
        l=0
        r=n-1
        t=0
        d=m-1
        
        res=[]
        while l<=r and t<=d:
            for i in range(l,r+1):
                res.append(matrix[t][i])
                print(str(i)+" t= "+str(t)+" ",end=" ")
            t+=1
            print()
            for i in range(t,d+1):
                res.append(matrix[i][r])
                print(str(i)+" r= "+str(r)+" ",end=" ")
            r-=1
            print()

            if t<=d:
                for i in range(r,l-1,-1):
                    res.append(matrix[d][i])
                    print(str(i)+" d= "+str(d)+" ",end=" ")
                d-=1
            print()
            if l<=r:
                for i in range(d,t-1,-1):
                    res.append(matrix[i][l])
                    print(str(i)+" l= "+str(l)+" ",end=" ")
                l+=1
            print()
        print(res)

        return res
        