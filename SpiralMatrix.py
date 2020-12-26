'''Time Complexity: O()
Space Complexity : O()'''
def spiralOrder(self, matrix):
    if matrix==None or len(matrix)==0:
        return 0
    output = []
    top = 0
    left = 0
    right = len(matrix[0])-1
    buttom = len(matrix)-1
    while(top<=buttom and left<=right):
        if top<=buttom and left<=right:
            for i in range(left,right+1):
                output.append(matrix[top][i])
            top = top + 1
        if top<=buttom and left<=right:
            for j in range(top,buttom+1):
                output.append(matrix[j][right])
            right = right - 1
        if top<=buttom and left<=right:
            for k in range(right, left-1, -1):
                output.append(matrix[buttom][k])
            buttom = buttom-1
        if top<=buttom and left<=right:
            for x in range(buttom,top-1,-1):
                output.append(matrix[x][left])
            left = left + 1
    return output