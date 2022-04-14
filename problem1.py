#product except self

# // Time Complexity : O(n)
# // Space Complexity :O(1) because the only list we initializine is the one we return 
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :no




def productExceptSelf( nums):
    res = []
    product=1
    for i in range(len(nums)):  #first find the product of the elements to its left and store that to an array
        res.append(product)
        product=product*nums[i]
    product=1
    for i in range(len(nums)-1, -1, -1):        #then find the product of the elements to their right and multiply that to the product of elements to the right
        res[i] *=product
        product=product*nums[i]
    return res



#test
print(productExceptSelf([1,2,3,4]))