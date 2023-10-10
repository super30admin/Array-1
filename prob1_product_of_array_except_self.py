class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        """
        Time Complexity: O(n)
        Space Complexity: O(1)
        Did this code successfully run on Leetcode: Yes 

        Any problem you faced while coding this: No
        Your code here along with comments explaining your approach:
        The approach: 
            - have a variable called rp (running product)
            - create a list out with 1 as initial element 
            - traverse the list -> At each index multiply the elements on left side with rp and store it in out list.
            - Repeat the same procedure in reverse order from right to left and multiply the elements on right side 
            with rp and later multiply it with the element on the same index in out 
            - Return the output
        """
        rp = 1
        out = [1]
        for i in range(1, len(nums)):
            rp = rp * nums[i -1 ]
            out.append(rp)
        # Go from right to left, 
        rp = 1
        for i in range(len(nums) - 2, -1, -1):
            rp = rp * nums[i + 1]
            out[i] = out[i] * rp
        return out     