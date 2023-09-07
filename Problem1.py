'''
1. Maintain the product of all the numbers to left of each number in the list. Starting from 1.
2. Since there is nothing to left of 1, include 1 to the leftproduct array. 
3. Similarly get the rightproduct array comprising of all the products to right of each element
4. The result would be the product of these two arrays with 2nd reversed element wise eventually getting the product of all numbers excluding that one.

TC: O(n^2)
SC: O(n)
'''

def getProduct(arr):
    product =  1
    for i in arr:
        product*=i
    return product

def productArray(nums):

    leftproduct = [1]
    rightproduct = [1]

    for i in range(1,len(nums)):
        leftproduct.append(getProduct(nums[:i]))
        rightproduct.append(getProduct(nums[::-1][:i]))
    for i in range(len(leftproduct)):
        return [i*j for i,j in zip(leftproduct,rightproduct[::-1])]

nums = [1,2,3,4]
print(productArray(nums))
