''' 
Time Complexity: O(n)
Space Complexity: O(n)  

Approach: 
We create a prefix product left array and a suffix product right array. 
We then multiply the corresponding elements of these two arrays to get the result.
'''




class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        left = []
        prod = 1
        right = []
        res = []
        N = len(nums)

        for num in nums:
            prod = prod * num
            left.append(prod)
        prod = 1
        for num in nums[::-1]:
            prod = prod * num
            right.append(prod)

        right.reverse()


        for i in range(N):
            if i == 0:
                res.append(right[i + 1])
            elif i == N - 1:
                res.append(left[i - 1])
            else:
                res.append(left[i - 1] * right[i + 1])

        return res
