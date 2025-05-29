# Time complexity : O(mn)
result = []
def spiral(nums):

    if len(nums) == 0:
        return []
    
    helper(nums, 0, len(nums[0])-1, 0, len(nums)-1)

    return result

def helper(nums, left, right, top, bottom):
    if (left > right or top > bottom):
        return
    
    for i in range(left, right+1):
        result.append(nums[top][i])

    top+=1

    for i in range(top, bottom+1):
        result.append(nums[i][right])
    
    right -=1 

    if (top <= bottom):
        for i in range(right, left-1, -1):
            result.append(nums[bottom][i])

    bottom -= 1

    if (left <= right):
        for i in range(bottom, top-1, -1):
            result.append(nums[i][left])
        
    left += 1

    helper(nums, left, right, top, bottom)

if __name__ == "__main__":
    nums = [[11,2,333],[41,56,66],[7,88,99]]
    print(spiral(nums))