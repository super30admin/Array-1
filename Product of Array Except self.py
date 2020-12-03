# Time: O(n) | Space: O(1)

class Solution:
    def productExceptSelf(self, nums):
        leng = len(nums)
        result = [0] * leng
        result[0] = 1
        for i in range(1, leng):
            result[i] = result[i-1] * nums[i-1]


        elem = 1
        for i in reversed(range(leng)):
            result[i] = result[i] * elem
            elem *= nums[i]

        return result






if __name__ == "__main__":
    print(Solution().productExceptSelf([1,2,3,4]))