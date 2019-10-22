class Solution:
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        count=0
        for i in matrix:
            count+=len(i)
        print(count)
        ans=[]
        if not matrix:
            return matrix
        T,R,L,B=0,len(matrix[0]),0,len(matrix)
        dir=0
        while(T<=B and L<=R):
            if dir ==0:
                print("dir",dir)
                for i in range(L,R):
                    print(matrix[T][i])
                    ans.append(matrix[T][i])
                T+=1
            elif dir ==1:
                print("dir",dir)
                for i in range(T,B):
                    #print(R)
                    print(matrix[i][R-1])
                    ans.append(matrix[i][R-1])
                R-=1
            elif dir ==2:
                print("dir",dir)
                # print("R",R)
                # print("L",L)
                for i in range(R-1,L-1,-1):
                    print(matrix[B-1][i])
                    ans.append(matrix[B-1][i])
                B-=1
            elif dir ==3:
                print("dir",dir)
                for i in range(B-1,T-1,-1):
                    print(matrix[i][L])
                    ans.append(matrix[i][L])
                L+=1
            dir=(dir+1)%4
        return ans[:count]                          
            
            
