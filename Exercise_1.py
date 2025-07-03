
'''
238 Product of Array Except Self
https://leetcode.com/problems/product-of-array-except-self/description/

Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.


Example 1:
Input: nums = [1,2,3,4]
Output: [24,12,8,6]

Example 2:
Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]

Constraints:
2 <= nums.length <= 105
-30 <= nums[i] <= 30
The input is generated such that answer[i] is guaranteed to fit in a 32-bit integer.

Solution:
1. Sub-optimal: Compute left and right products of the array and store the left and right in two separate arrays. For each i = 0:N-1, compute result [i] = left[i]*right[i].
Return result array
Time: O(3N) = O(N), Space: O(2N) = O(N)

2. Optimal: Use the result/output array to store the right product. This doesn't count as O(N) space as we are reusing the output array to store some intermediate information. Then, scan the array from left to right and maintain the a running product in a single variable 'rp'. Thus, rp stores the left product at the current index. Now, compute result[i]=rp*result[i]

https://youtu.be/Oepp2HQ7134?t=2466

Time: O(2N) = O(N), Space: O(1)
'''
def product_of_array(A):
    ''' sub-optimal'''
    N = len(A)
    # excluding the only elem in single elem array results in 0 prod
    # or if the array is empty results in 0 prod
    if N <= 1:
        return [0]
    left, right = [0]*N, [0]*N

    left[0] = 1
    for i in range(1,N):
        left[i] = A[i-1]*left[i-1]

    right[N-1] = 1
    for i in range(N-2,-1,-1):
        right[i] = A[i+1]*right[i+1]

    result = [1]*N
    for i in range(N):
        result[i] = left[i]*right[i] # left prod * right prod
    return result

def product_of_array_optimal(A):
    '''optimal'''
    N = len(A)
    # excluding the only elem in single elem array results in 0 prod
    # or if the array is empty results in 0 prod
    if N <= 1:
        return [0]

    # result array is expected to be returned,
    # doesn't count towards O(N) space
    result = [1]*N

    # Save the running product of right half
    # in the result array
    result[N-1] = 1
    for i in range(N-2,-1,-1): # O(N)
        result[i] = A[i+1]*result[i+1]

    rp = 1 # save the running product of left half in a single var
    for i in range(N): # O(N)
        result[i] = rp*result[i] # left prod * right prod
        rp = rp*A[i]
    return result


def run_product_of_array():
    tests = [([1,2,3,4], [24,12,8,6]), ([-1,1,0,-3,3],[0,0,9,0,0]), ([2], [0]), ([1,2], [2,1])]

    for test in tests:
        A, ans = test[0], test[1]
        prod = product_of_array(A)
        print(f"\nA = {A}")
        print(f"Prod of array except self (subotimal)= {prod} (T: O(N), S: O(N))")
        print(f"Pass: {ans == prod}")

        prod = product_of_array_optimal(A)
        print(f"\nA = {A}")
        print(f"Prod of array except self (optimal) = {prod} (T: O(N), S: O(1))")
        print(f"Pass: {ans == prod}")


run_product_of_array()