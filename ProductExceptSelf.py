'''TIme Complexity:O(n) 
Space Complexity: O(n) '''
def productExceptSelf(self, nums):
    """
    :type nums: List[int]
    :rtype: List[int]
    """
    if nums == None or len(nums)==0:
        return None
    output = [None]*len(nums)
    product = 1
    
    for i in range(len(nums)):
        output[i] = product
        product = product*nums[i]
    product = 1
    for j in range(len(nums)-1,-1,-1):
        output[j] = output[j]*product
        product = product*nums[j]
    return output