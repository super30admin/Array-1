"""
Rasika Sasturkar
Time Complexity: O(n)
Space Complexity: O(1)
"""


def productExceptSelf(nums):
    """
    Without using auxillary data structure.
    In left pass, updating the number by multiplying it with previous
    number (stored as running product).
    In right pass, updating the number by multiplying running sum
    with next number and current number
    """
    n = len(nums)
    result = [0 for _ in range(n)]

    # null case
    if nums is None:
        return result

    rp = 1  # running product
    result[0] = 1

    # left pass
    for i in range(1, n):
        rp *= nums[i - 1]
        result[i] = rp

    # right pass
    rp = 1
    for i in range(n - 2, -1, -1):
        rp *= nums[i + 1]
        result[i] = rp * result[i]

    return result


def main():
    """
    Main function - an example from LeetCode problem to show the working.
    This code ran successfully on LeetCode and passed all test cases.
    """
    nums1 = [1, 2, 3, 4]
    print(productExceptSelf(nums1))  # returns [24, 12, 8, 6]
    nums2 = [-1, 1, 0, -3, 3]
    print(productExceptSelf(nums2))  # returns [0, 0, 9, 0, 0]


if __name__ == "__main__":
    main()
