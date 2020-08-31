#Runtime : O(n)

# here we maintain two arrays
# one call left, that maintains
# the product of all elements 
# before a specific index
# similarly we maintin an array
# called right that maintains 
# a product of all the elements
# after that specific index. 

def solution(array):
    left = [0]*len(array)
    right = [0]*len(array)
    ans = [0]*len(array)

    left[0] = array[0]
    for i in range(1,len(array)):
        left[i] = array[i]*left[i-1]
    # print(left)

    right[-1] = array[-1]
    for i in range(len(array)-2, -1, -1):
        right[i] = array[i]*right[i+1]
    # print(right)

    ans[0] = right[1]
    ans[-1] = left[-2]

    for i in range(1, len(array)-1):
        ans[i] = left[i-1]*right[i+1]
    return ans

array = [1,2,2,3,3,4]

print(solution(array))