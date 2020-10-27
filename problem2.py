#timecomplexity O(m*n)
#spacecomplexity O(1) becouse function is returning list
# if the dir is 1 checking edge case and changing direction going up row-- and column ++
# if the dir is -1 checking the edge case and then changing the direction row++ and column --
# checking 


class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        if matrix==[]: return []
        i=0
        j=0
        result=[_ for _ in range(len(matrix)*len(matrix[0]))] # storing result 
        #dir=1 means direction up -1 means direction down
        _dir=1
        print(len(matrix)*len(matrix[0]))
        count=0
        index=(len(matrix)*len(matrix[0]))
        while(count<index):
            result[count]=matrix[i][j]
            if _dir==1:
                if j==len(matrix[0])-1:
                    i+=1
                    _dir=-1
                elif i==0:
                    j+=1
                    _dir=-1
                else:
                    i-=1
                    j+=1
            else:
                if i==len(matrix)-1:
                    j+=1
                    _dir=1
                elif j==0:
                    i+=1
                    _dir=1
                else:
                    j-=1
                    i+=1
            count+=1
        return result
                
                    
            