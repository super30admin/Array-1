#Time Complexity : O(n)
#Space Complexity : o(1) (Since output array is counted as auxilary space)

#Did this code successfully run on Leetcode : Yes
#Three line explanation of solution in plain english: Take a left variable which multiplies all the left elements upto that index. Take a right variables which multiplies all the right elements to the end after that index. And keep updating this muliplication in result array.

#Your code here along with comments explaining your approach


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        #Output array
        result = [0] * len(nums)

        #find the total multiplication of all the left elements till index "i" and update result[i] with that multiplication
        left = 1
        for i in range(len(nums)):
            result[i] = left
            left *= nums[i]

        #find the total multiplication of all the right elements after index "i" and update result[i] with that multiplication, traversing the array in reverse order
        right = 1
        for i in range(len(nums)-1, -1, -1):
            result[i] = result[i] * right
            right *= nums[i]

        return result
