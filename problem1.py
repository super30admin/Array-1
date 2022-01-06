#Time Complexity O(n)
#Space Complexity O(n)

def sol(nums):
    left_arr = [0]*len(nums)
    right_arr = [0]*len(nums)
    l_prod =1
    r_prod =1
    left_arr[0]=1
    right_arr[len(right_arr)-1]=1

    for x in range(1,len(left_arr)):
        l_prod = l_prod *(nums[x-1])
        left_arr[x] = l_prod
    
    for x in range(len(left_arr)-2,-1,-1):
        r_prod = r_prod *(nums[x+1])
        right_arr[x] = r_prod
    
    res = []
    for x in range(len(nums)):
        res.append(left_arr[x]*right_arr[x])
    return res

print(sol([1,2,3,4]))
    



