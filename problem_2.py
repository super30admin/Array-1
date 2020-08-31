# Runtime : O(MxN)
# Space : O(n)

# here I make use of the fact that 
# the addition of row and column
# is constant for a particular 
# slanting series. I maintian a
# hashmap and store values of a particular 
# level in that 

from collections import defaultdict
def solution(array):
    d = defaultdict(list)
    maxx = 0
    for r in range(len(array)):
        for c in range(len(array)):
            maxx = max((r+c), maxx)
            if not (r+c)%2:
                d[(r+c)] = [array[r][c]] + d[(r+c)]
            else:
                d[(r+c)].append(array[r][c])

    ans = []

    for k in d:
        ans += d[k]
    return ans

array = [[ 1, 2, 3 ],[ 4, 5, 6 ],[ 7, 8, 9 ]]  
print(solution(array))