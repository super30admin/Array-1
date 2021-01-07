# Approach: We iterate over the arrays in 2 directions and calculate the running products on both left and right until the number at current position
# Time complexity: O(N)
# Space : O(1) as we only return the output


def productExceptSelf(nums):

    # base case 
    if not nums:
        return 0

    result = [1] * len(nums) # create a resultant array with 1 at first position so as to traverse from second and use this as ref to calc running product
    
    runningProduct = 1
    
    # Left to right pass
    for i in range(1, len(nums)):
        
        result[i] = runningProduct * nums[i-1]
        runningProduct *= nums[i-1]

    # reset back to 1 
    runningProduct = 1
    
    # right to left pass without using an extra array, mutate the resultant array
    for i in range(len(nums)-2 ,-1, -1):
        runningProduct = runningProduct * nums[i+1]
        result[i] = result[i] * runningProduct
        
        
    return result