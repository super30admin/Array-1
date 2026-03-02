#Product of Array Except Self

#time complexity -> O2n -> On
# Space complexity -> O1 since we are using only result array and not 2nd array

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        # generate an array from right to left saving the product till that position 
        # For exampe for [1,2,3,4] will be [24, 12, 4, 1] in the result array
        # then in the 2nd iteration from the start position keep the product in the single variable, and for each index the result product will be
        # product of the variable and the value coming from the result array at that index, the update the index value in the same reult array
        length = len(nums)
        resultArr = [1]*length
        product = 1
        for i in range(length-1, -1, -1):
            resultArr[i] = product
            product *= nums[i]
        product = 1
        for i in range(0,length):
            resultArr[i] = product * resultArr[i]
            product = product *  nums[i]
        return resultArr


# 1,2,3,4

# 24, 12, 4, 1
PR = 1

currentPos * PR = 24, 
Pr = 1*1

currentPos * PR = 12* 1
pr = 1*2 = 2

currentPos * PR = 4 * 2 = 8
pr = currentPos * pr = 3 * 2 = 6

currentPos * PR = 1 * 6 = 6

# 24, 12, 8, 6