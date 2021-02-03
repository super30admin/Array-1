# Time Complexity :O(n)
# Space Complexity :O(n)
#  Did this code successfully run on Leetcode :yes
# Any problem you faced while coding this :no
#Leetcode : 238

def productExceptSelf(nums):
    """
    :type nums: List[int]
    :rtype: List[int]
    """

    # We will make a single array for leftproduct. Its intially empty,
    # We calculate the product of all numbers before my boy.
    leftProduct = 1
    ans = [0] * (len(nums))

    # We will first assign the value and then calculate the new world.
    for index in range(len(nums)):
        ans[index] = leftProduct
        leftProduct *= nums[index]

    rightProduct = 1
    # We will first assign the value and then calculate the new world.

    for index in range(len(nums) - 1, -1, -1):
        ans[index] *= rightProduct
        rightProduct *= nums[index]
    return ans

if __name__ == '__main__':
    arr = [1,2,3,4]
    ans = productExceptSelf(arr)
    print(ans)