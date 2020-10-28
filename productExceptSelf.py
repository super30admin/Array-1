def productExceptSelf(self, nums):
    """
    :type nums: List[int]
    :rtype: List[int]
    """
    length = len(nums)
    # right=[0]*length
    # left=[0]*length
    # right[0]=1
    # left[length-1]=1
    # for i in range(1,length):
    #     right[i]=right[i-1]*nums[i-1]
    # for i in range(length-2,-1,-1):
    #     left[i]=left[i+1]*nums[i+1]
    # for i in range(length):
    #     nums[i]=left[i]*right[i]
    # return nums
    # time-O(n) space-O(n)
    ans = [0] * length
    ans[0] = 1
    for i in range(1, length):
        ans[i] = ans[i - 1] * nums[i - 1]
    r = 1
    for i in range(length - 1, -1, -1):
        ans[i] = ans[i] * r
        r *= nums[i]
    return ans
#time-O(n) space-O(1) if output arr is not counted