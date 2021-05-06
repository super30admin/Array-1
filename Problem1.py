# time complexity : 0(n)
# space complexity : 0(n)

def prod_arr(nums):
    
    n = len(nums)

    if n == 0:
        return 0
   
    left = [1]*n
    right = [1]*n

    #left[0] = 1

    for i in range(1,n):
        left[i] = left[i-1] * nums[i-1]
    
    
    
    #right[n-1] = 1
    for i in range(n-2,-1,-1):
        right[i] = nums[i+1]* right[i+1]

   
    for i in range(n):
        nums[i] = left[i] * right[i]
        
    return nums

nums = [1,2,3,4]
print(prod_arr(nums))

    