def knapSack(W, wt, val, n):
    # Base Case
    dp = [[0 for i in range(W+1)] for i in range(len(wt) + 1)]
    print(len(dp[0]))
    for i in range(1, len(dp)):
        for j in range(1, len(dp[0])):
            if j < wt[i-1]:
                dp[i][j] = dp[i-1][j]
            else:
                case1 = dp[i-1][j- wt[i-1]] + val[i-1]
                case2 = dp[i-1][j]
                dp[i][j] = max(case1, case2) 
    print(dp)            
    return dp[-1][-1]
    
val = [60, 100, 120]
wt = [10, 20, 30]
W = 50
n = len(val)
print (knapSack(W, wt, val, n))