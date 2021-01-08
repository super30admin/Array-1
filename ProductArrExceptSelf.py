# TC = O(n)
# SC = O(1)
# Two pass: forward we calculate product of elements right of current element. In the backward pass we multiple left products to previously calculated values to get result.
# Logic- Product of left elements * Product of right elements = Result at current index
# We are using running product int to reduce SC to O(1)
def productOthers(nums):
    if not nums or len(nums) == 0:
        return [0]
    res = [0] * len(nums)
    # forward pass
    rp = 1
    res[0] = 1
    for i in range(1, len(nums)):
        rp = rp * nums[i-1]
        res[i] = rp
    print(res)

    # backward pass
    rp = 1
    for i in range(len(nums)-2,-1,-1):
        rp = rp * nums[i+1]
        res[i] = res[i] * rp    
    return res

nums = [1,2,3,4]
print(productOthers(nums))
