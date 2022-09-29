## passed in leet code
#TC : O(M*N)
#SC : O(1)

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if len(matrix)==0:
            return 0
        row = len(matrix)
        col = len(matrix[0])
        result_list = []
        top = 0
        left = 0
        right = col-1
        bottom = row-1
        print("b",bottom)
        while (top<=bottom and left <= right):
            # move from left to right
            if(left <= right):
                for i in range(left,right+1):
                    result_list.append(matrix[top][i])
                top+=1
            #move from top to bottom
            if(left <= right):
                for j in range(top,bottom+1):
                    result_list.append(matrix[j][right])    
                right-=1
            # move from right to left 
            if(top<=bottom):
                for k in range(right, left-1,-1):
                    print(matrix[bottom][k])
                    result_list.append(matrix[bottom][k])
                bottom-=1
            # # move from bottom to top
            if(left <= right):
                for m in range(bottom, top-1,-1):
                    result_list.append(matrix[m][left])
                left+=1
        return result_list
                
            
        