#time complexity is O(n)

#####using left product elements and rigght product elemnts of except and multiplying both LEFT AND RIGHT
class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        left=[None] * len(nums)  #creating left array and write array of lenght equal to the  input array
        right=[None] * len(nums)
                # left=[]   #not sure why this doesnt work
                # right=[]
        left[0]=1 #making the value of the first element of array as 1, beacuase there is nothing on the left side of the first element in the
                                    #in the input array . We will traversing from left to right
        right[(len(nums)-1)]=1   #since we are traversing from right to left, there is nothing to the rightside of the last element in the input arrau
                                        #hence making it 1
        for i in range(1,len(nums)):    #travsering through the nums array from 1. (left to righ)
            left[i]=left[i-1]*nums[i-1]    ##getting the product of all the elements before the ith element

        for j in range((len(nums)-2),-1,-1):   #traversing from right to left
            right[j]=right[j+1]*nums[j+1]           #getting the product of all elements before ith element

        for i in range(len(nums)):
            left[i]=left[i]*right[i]   #final - to get output, mulitply ith element of left array to the ith index of right array

        return left


##### using variable ####

class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """

        left = [None] * len(nums)    #here instead of creating two separate right and left arrays, we will create just one extra array left.
                                            #here we are not creating right array. Saving space complexity
        output = [None] * len(nums)
        # left=[]
        # right=[]
        left[0] = 1
        # right[(len(nums)-1)]=1
        for i in range(1, len(nums)):      #doing the same steps like above just for the above
            left[i] = left[i - 1] * nums[i - 1]
        # print(left)

        right = 1                               #we are creating a variable r.
        for i in range((len(nums) - 1), -1, -1):
            left[i] = left[i] * right               #this variable will multiply the left index
            # print(left)
            right = right * nums[i]             #this r will get the value of nums from right to left
                                                #which will be multiplies with left elements

        return left







