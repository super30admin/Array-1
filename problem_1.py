# Did this code successfully run on Leetcode : YES


# TC: O(N)
# SC: O(1)

# Approach
# calculate product, result array is product divided by element at that index

# def solution(arr):
#     p = 1
#     for i in arr:
#         p *= i
#     result = [p/i for i in arr]
#     return result

# print(solution([1, 2, 3, 4]))

# Approach without division
# TC: O(N*N)
# SC: O(1)

# def solution(arr):
#     result = [1] * len(arr)
#     for i in range(len(arr)):
#         for j in range(len(result)):
#             if i == j:
#                 pass
#             else:
#                 result[j] *= arr[i]
#     return result

# print(solution([1, 2, 3, 4]))

# Approach 
# running product
# TC: O(n)
# SC: O(1)

def solution(arr):
    lr = 1
    result = []
    for i in arr:
        result.append(lr)
        lr *= i
    rp = 1
    for i in range(len(arr)-1, -1, -1):
        result[i] *= rp
        rp *= arr[i]
    return result

print(solution([2, 3, 4, 5, 6]))