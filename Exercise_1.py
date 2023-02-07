#Time Complexity : O(N), N being the length of the array. 
#Space Complexity : O(1), because the array is returned as a result. 
#Did this code successfully run on Leetcode : Yes.
#Any problem you faced while coding this : Had a little issue in the end where I mixed
#array and nums, but was simple enough to debug. 

#Your code here along with comments explaining your approach in three sentences only
'''Created an array of running left product. Then, from the right, keep track of running
product from the right and multiply into array. Return array. 
'''

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        array = []
        length = len(nums)
        rp = 1
        for i in range(length):
            array.append(rp)
            rp = rp*nums[i]
        print(array)

        rp=1
        for i in range(length):
            index = length-1-i
            array[index]=rp*array[index]
            rp=rp*nums[index]
        
        return array