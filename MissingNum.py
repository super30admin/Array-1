"""
The approach here is to keep another array and iterate over the given input array. at each iteration
store the element value -1 indexed place as 1 in the new formed array. finally iterate over the new formed
array and if there is no 1 found in the new formed array then the element is not there in the main array.

Leetcode - running
Time complexity O(N)
Space O(N)
"""
   
    def findDisappearedNumbers(self, nums):
        res=[]
        find=[0]*len(nums)
        for i in range(len(nums)):
            find[nums[i]-1]=1
        for i in range(len(find)):
            if not find[i]:
                res.append(i+1)
        return res