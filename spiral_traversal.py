class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        low=0
        high=len(matrix[0])-1
        top=0
        bottom=len(matrix)-1
        l=[]
        while(low<=high and top<=bottom):
            for i in range(low, high+1):
                l.append(matrix[top][i])
            top+=1
            for i in range(top, bottom+1):
                l.append(matrix[i][high])
            high-=1
            if(top<=bottom):
                for i in range(high, low-1,-1):
                    l.append(matrix[bottom][i])
                bottom-=1
            if(low<=high):
                for i in range(bottom, top-1, -1):
                    l.append(matrix[i][low])
                low+=1
        return l
