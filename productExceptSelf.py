# Time Complexity: O(n), We loop over the array twice in separate for loops, O(n)
# Space Complexity: O(1), Excluding the result array, we dont use any other elements
def productExceptSelf(nums: list[int]) -> list[int]:
    ans = [1, nums[0]]
    for i in range(2, len(nums)):
        ans.append(nums[i-1]*ans[i-1])
    rp = 1 # maintain a running product that tracks the product of nums array and multiply it with ans array values
    for i in range(len(nums)-2, -1, -1):
        rp *= nums[i+1]
        ans[i] = rp*ans[i]
    return ans