class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        # Initializing multipliers for left and right products as 1
        left_multiplier = 1
        right_multiplier = 1
        n = len(nums)
        # Creating arrays to store left and right products
        left_arr = [0] * n 
        right_arr = [0] * n 

        # Iterating through the array to fill left_arr and right_arr
        for i in range(n):
            j = -i -1
            # Storing product of all elements to the left of index i
            left_arr[i] = left_multiplier
            # Storing product of all elements to the right of index j
            right_arr[j] = right_multiplier
            # Updating left and right multipliers
            left_multiplier *= nums[i]
            right_multiplier *= nums[j]

        # Combining left and right products for the final result
        return [l*r for l, r in zip(left_arr, right_arr)]

# Time Complexity (TC): O(n), since iterating through the array twice.
# Space Complexity (SC): O(n), due to the use of left_arr and right_arr.