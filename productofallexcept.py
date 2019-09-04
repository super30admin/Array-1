#time complexity is O(n)

#####using left product elements and rigght product elemnts of except and multiplying both LEFT AND RIGHT
class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        left=[None] * len(nums)
        right=[None] * len(nums)
                # left=[]
                # right=[]
        left[0]=1
        right[(len(nums)-1)]=1
        for i in range(1,len(nums)):
            left[i]=left[i-1]*nums[i-1]

        for j in range((len(nums)-2),-1,-1):
            right[j]=right[j+1]*nums[j+1]

        for i in range(len(nums)):
            left[i]=left[i]*right[i]

        return left


##### using variable ####3

class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """

        left = [None] * len(nums)
        output = [None] * len(nums)
        # left=[]
        # right=[]
        left[0] = 1
        # right[(len(nums)-1)]=1
        for i in range(1, len(nums)):
            left[i] = left[i - 1] * nums[i - 1]
        # print(left)

        right = 1
        for i in range((len(nums) - 1), -1, -1):
            left[i] = left[i] * right
            # print(left)
            right = right * nums[i]

        return left







