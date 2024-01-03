class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        list1=[]
        left=0
        right=len(matrix[0])-1
        top=0
        bottom=len(matrix)-1
        while left<=right and top<=bottom:
            for i in range(left,right+1):
                list1.append(matrix[top][i])
            top+=1
            for i in range(top,bottom+1):
                list1.append(matrix[i][right])
            right-=1
            if len(list1)==(len(matrix)*len(matrix[0])):
                break
            for i in range(right,left-1,-1):
                list1.append(matrix[bottom][i])
            bottom-=1
            for i in range(bottom,top-1,-1):
                list1.append(matrix[i][left])
            left+=1
        return list1

# Time complexity: O(m*n)
# Space complexity: O(1)
