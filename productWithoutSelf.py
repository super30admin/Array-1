# As taught in class, we maintain 2 things temp and result and then we keep changing the value of temp and result array. then once we get the result array, then we traverse it reverse and then multiply by ptr to get result
#Time Complexity: O(n)
#Space Complexity: O(n)
def productWithoutSleef(arr):
    if arr is None or len(arr) == 0:
        return [0]
    result = [0]*len(arr)
    temp = 1
    ptr = 1
    for i in range(len(arr)):
        ptr = ptr*temp
        result[i] = ptr
        temp = arr[i]

    temp = 1
    ptr = 1
    for i in range(len(arr),0,-1):
        ptr = ptr*temp
        result[i] = result[i]*ptr
        temp = arr[i]
    return result

arr = [1,2,3,5]
productWithoutSleef(arr)