# Time complexity : O(n)
# Space Complexity : O(n)
def product_except_itself(nums):
    n = len(nums)
    result = [0] * n
    result[0] = 1
    rp = 1

    for i in range(1,n):
        rp = rp * nums[i-1]
        result[i] = rp
    
    rp = 1

    for i in range(n-2, -1, -1):
        rp = rp * nums[i+1]
        result[i] = rp * result[i]

    return result
    
if __name__ == "__main__":
    nums = [1,2,3,4]
    print(product_except_itself(nums))