nums = [1,2,3,4]
n = len(nums)
ans = [0]*n
ans[0] = 1
for i in range(1,n):
    ans[i] = ans[i-1]*nums[i-1]
prod = 1
for i in reversed(range(n)):
    ans[i] = ans[i]*prod
    prod = prod*nums[i]
print(ans)