def productExceptSelf(array):
    left= [1] * len(array)
    right= [1]* len(array)

# product of left side of the array
    for i in range(1, len(nums)):
        left[i] = left[i-1]*nums[i-1]
#product of right side of the array
    for j in range(len(nums)-2, -1,-1):
        right[j] = right[j+1]* nums[i+1]
#combining the prodoct of left and right
    res = [1] * len(nums)
    for i in range(len(nums)):
        res[i] = left[i] * right[i]
    return res #contains the product of except self results.

"""
Time Complexity: O(n)
Space Complexity: O(n)

"""
 
