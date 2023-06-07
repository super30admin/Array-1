#Time Complexity is: O(n) where n is the number of elements in the nums array
#Space Complexity is: O(1)
#Code ran successfully on leetcode
#Faced no problems while coding this problem

class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        #creating an array to store the product of all the remaining values except
        #the current values 
        self.arr=[]
        #appending the intial value of the array to 1 
        self.arr.append(1)
        #creating a running product variable and initialize the value to 1
        self.rp=1
        #forward iteration and calculating the product of previous elements
        for i in range(1,len(nums)):
            self.rp=self.rp*nums[i-1]
            self.arr.append(self.rp)
        self.rp=1
        #backwards iteration and calculating the product of next elements
        for i in range(len(nums)-2,-1,-1):
            self.rp=self.rp*nums[i+1]
            self.arr[i]*=self.rp
        #returing array
        return self.arr