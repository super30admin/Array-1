class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        
        # Step 1: Initialize result array with 1s.
        # 'res[i]' will eventually hold the product of all elements
        # to the LEFT of index i (initially all 1s as placeholders).
        res = [1] * n

        # Step 2: Compute prefix products (products of all elements to the left of i)
        # Example: nums = [1, 2, 3, 4]
        # After this loop, res = [1, 1, 2, 6]
        # Explanation:
        # res[1] = res[0] * nums[0] = 1 * 1 = 1
        # res[2] = res[1] * nums[1] = 1 * 2 = 2
        # res[3] = res[2] * nums[2] = 2 * 3 = 6
        for i in range(1, n):
            res[i] = res[i - 1] * nums[i - 1]

        # Step 3: Initialize variable 'product' to hold suffix product
        # (product of elements to the right of the current index)
        # Start with the last element since nothing is to its right.
        product = nums[-1]

        # Step 4: Traverse array backward (from second last element to first)
        # Multiply each res[i] (which currently has prefix product)
        # by 'product' (which represents suffix product).
        # Then, update 'product' by multiplying it with nums[i].
        #
        # Example trace (nums = [1, 2, 3, 4]):
        # Initially product = 4
        #
        # i = 2 → res[2] = res[2] * 4 = 2 * 4 = 8
        #          product = product * nums[2] = 4 * 3 = 12
        #
        # i = 1 → res[1] = res[1] * 12 = 1 * 12 = 12
        #          product = product * nums[1] = 12 * 2 = 24
        #
        # i = 0 → res[0] = res[0] * 24 = 1 * 24 = 24
        #          product = product * nums[0] = 24 * 1 = 24
        #
        # Final res = [24, 12, 8, 6]
        for i in range(n - 2, -1, -1):
            res[i] = res[i] * product
            product = product * nums[i]

        # Step 5: Return the final result array
        return res