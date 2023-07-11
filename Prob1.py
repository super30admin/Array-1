# // Time Complexity : O(n), n is the number of elements in the array
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Three line explanation of solution in plain english
# Since, we essentially want to multiply everything other than current element, we can get the left and right running products and multiply them. That's the first method, but this would have extra space so SC would be O(n)
# Improvement - After calculating the left running product, we can maintain right running product so far with a variable and multiply it with left running prod at that index. And then update the variable for next element and continue till the 0th element

# // Your code here along with comments explaining your approach
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        # left=[0 for _ in range(len(nums))]
        # right=[0 for _ in range(len(nums))]
        # res=[0 for _ in range(len(nums))]

        # left[0]=1
        # for i in range(1,len(nums)):
        #     left[i]=left[i-1]*nums[i-1]
        
        # right[-1]=1
        # for i in reversed(range(len(nums)-1)): #from nums[-2] to nums[0], python range so it's n-2+1=n-1
        #     right[i]=right[i+1]*nums[i+1]
        
        # for i in range(len(nums)):
        #     res[i]=left[i]*right[i]
        
        # return res

        left=[0 for _ in range(len(nums))]
        left[0]=1
        for i in range(1,len(nums)):
            left[i]=left[i-1]*nums[i-1]
        R=1
        print(left)
        for i in reversed(range(len(nums))): #Here, we want to multiply everything to the right for each element starting from nth element.
            left[i]=left[i]*R
            R=R*nums[i]
        return left