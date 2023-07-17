class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        i=0
        j=0
        output=[]

        while(True):
            if(len(output)==len(mat[0])*len(mat)):
                break
            # print(output, i, j)
            output.append(mat[i][j])

            if((i+j)%2):
                # print("mod=1", i, j, output)
                if(j==0 and i!=len(mat)-1):
                    i+=1
                else:
                    if(i==len(mat)-1):
                        j+=1
                    else:
                        i+=1
                        j-=1
            else:
                # print("mod=0", i, j, output)
                if(i==0 and j!=len(mat[0])-1):
                    j+=1
                else:
                    if(j==len(mat[0])-1):
                        i+=1
                    else:
                        i-=1
                        j+=1
        # print(output)
        return output
            


        #     if(len(output)==len(mat)*len(mat[0])):
        #         break
        #     if((i+j)%2):
        #         if(j!=len(mat[0])):
        #             if(j>=0 and i<=len(mat)-1):
        #                 # print(output)
        #                 output.append(mat[i][j])
        #                 j-=1
        #                 i+=1
        #             else:
        #                 j=0
        #         else:
        #             j=len(mat[0])
        #             i=1
        #             break
        #     else:
        #         if(j!=len(mat[0]) and i!=len(mat)):
        #             if(len(mat)-1>=i>=0 and 0<=j<=len(mat[0])-1):
        #                 print(output,i,j)
        #                 output.append(mat[i][j])
        #                 i-=1
        #                 j+=1
        #             else:
        #                 i+=1
        #         else:
        #             i=1
        #             j-=1
        #             break
        # while(True):
        #     if(len(output)==len((mat))*len(mat[0])):
        #         break
        #     if((i+j)%2):
        #         if(j>=0 and i<=len(mat)-1):
        #             output[i][j]=mat[i][j]
        #             i+=1
        #             j-=1
        #         else:
        #             i-=1
        #             j=i
        # print(output,i,j) 
        return []
        