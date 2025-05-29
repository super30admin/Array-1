# Time complexity : O(mn)
# Space complexity : O(mn)
def print_diagonal(nums):
    m = len(nums)
    n = len(nums[0])

    arr = [0] * (m*n)

    idx = 0
    flag = True
    i = 0
    j = 0
    for idx in range(0, len(arr)):
        arr[idx] = nums[i][j]
        if flag:
            if j == n-1:
                flag = False
                i+=1
            elif i == 0:
                flag = False
                j+=1
            else:
                i-=1
                j+=1
        else:
            if i == m-1:
                flag = True
                j+=1
            elif j == 0:
                flag = True
                i+=1
            else:
                j-=1
                i+=1
    return arr
            

if __name__ == "__main__":
    nums = [[1,2,3], [4,5,6], [7,8,9]]
    print(print_diagonal(nums))