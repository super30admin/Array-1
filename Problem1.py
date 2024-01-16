# Time Complexity: O(N)
# Space Complexity: O(N)

class Solution:
    """
    Maintain 2 arrays prefix: contains product of 0..i / postfix contains product of i+1..len(nums)
    res[i] = prefix[i-1] * postfix[i+1]
    """
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        prefix = []
        postfix = [1] * (len(nums))
        for i in range(len(nums)):
            if i > 0:
                prefix.append(nums[i] * prefix[i - 1])
            else:
                prefix.append(nums[i])
        # print(prefix)
        for i in range(len(nums) - 1, 0, -1):
            if i == len(nums) - 1:
                postfix[i] = nums[i]
            else:
                postfix[i] = nums[i] * postfix[i + 1]
        # print( postfix)
        
        res = [1] * (len(nums))
        for i in range(len(nums)):
            left = prefix[i - 1] if i > 0 else 1
            right = postfix[i + 1] if i < len(nums) - 1 else 1
            res[i] = left * right
        return res

        
