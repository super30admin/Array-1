class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        
        output = []
        i=0;j=0
        dir = 1
        k=0
        # print(len(mat) * len(mat[0]))
        while(len(output)< len(mat) * len(mat[0])):
            # print("lengthis",len(output) )
            print(mat[i][j])
            output.append(mat[i][j])
           
            
            if(dir == 1):
                if(j == len(mat[0])-1):
                    i+=1
                    dir = -1
                elif(i ==0):
                    j+=1
                    dir =-1
                else:
                    i-=1
                    j+=1
            elif(dir == -1):
                if(i == len(mat)-1):
                    j+=1
                    dir =1
                elif(j == 0):
                    i+=1
                    dir = 1
                else:
                    i+=1
                    j-=1
        return output
           
            
                    
                    
                    
                

                
            
    