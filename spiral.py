class Solution(object):
    def spiralOrder(self, matrix):
        dire=[[0,1],[1,0],[0,-1],[-1,0]]
        t=len(matrix)*len(matrix[0])
        result=[matrix[0][0]]
        i,j=0,0
        ur=-1
        lr=len(matrix)
        uc=len(matrix[0])
        lc=-1
        while(len(result)<t):
            for d in dire:
                flag=True
                while(flag):
                    i=i+d[0]
                    j=j+d[1]
                    if(ur<i<lr and lc<j<uc):
                        result.append(matrix[i][j])
                        flag=True
                    else:
                        i=i-d[0]
                        j=j-d[1]
                        flag=False
                        if(d[1]==1):
                            ur+=1
                        elif(d[0]==1):
                            uc-=1
                        elif(d[1]==-1):
                            lr-=1
                        else:
                            lc+=1

        return result
                


            


                
            
            
            

            



        
