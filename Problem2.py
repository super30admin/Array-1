# Time Complexity = O(m*n) (two parse)
# Space Complexity = O(max(m,n))
# Works on leetcode

def diagonalTraverse(nums):
    dir = -1
    result = []
    if len(nums) == 0:
        return nums
    for i in range(len(nums[0])):
        row = []
        r = 0
        c = i
        while(r < len(nums) and c >=0):
            row.append(nums[r][c])
            r += 1
            c -= 1
        if dir == -1:
            result.extend(row[::-1])
        else:
            result.extend(row)
        dir *= -1

    for i in range(1, len(nums)):
        row = []
        r = i
        c = len(nums[0])-1
        while(r < len(nums) and c >=0):
            row.append(nums[r][c])
            r += 1
            c -= 1
        if dir == -1:
            result.extend(row[::-1])
        else:
            result.extend(row)
        dir *= -1
    return result



print(diagonalTraverse([[1, 2, 3],[4, 5, 6],[7, 8, 9]]))


