# As taught in class we define 4 pointers and define a  range and then add the values between that range to the result array
# Time Complexity: O(n*m)
#Space Complexity: O(n)
def spiral(arr):
    result = list()
    if (arr is None or len(arr) == 0):
        return result
    left = 0
    right = len(arr[0])-1
    top = 0
    bottom = len(arr) - 1
    while(left<=right and top <= bottom):
        for i in range(left,right):
            result.append(arr[top][i])
        top = top  + 1
        for i in range(top,bottom):
            result.append(arr[i][right])
        right = right - 1
        for i in range(right,left):
            result.append(arr[bottom][i])
        bottom = bottom - 1
        for i in range(bottom,top):
            result.append(arr[i][left])
        left = left + 1

arr = [[1,2,3],[4,5,6],[7,8,9]]
spiral(arr)

