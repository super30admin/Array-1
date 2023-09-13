# Time Complexity : O(M * N)
# Space Complexity : O(1) as no extra space, just the output array
# Did this code successfully run on Leetcode : yes
# Three line explanation of solution in plain english : traverse the array making 
# sure to turn upwards or downards at the particular edge cases

def diagonalTraversal(nums):

    m = len(nums)
    n = len(nums[0])
    res = [0] * (m * n)
    i, r, c = 0, 0, 0
    flag = 1

    while i < (m * n):

        res[i] = nums[r][c]
        i += 1

        # upward traversal
        if flag == 1:

            # this condition must come first, 
            # else at the position [row_0][col_n],
            #  column will get incremented, which is out of bounds
            if c == n - 1:
                r += 1
                flag = -1
            elif r == 0:
                c += 1
                flag = -1
            else:
                r -= 1
                c += 1
        
        # downward traversal
        else:

            # this condition must come first, 
            # else at the position [row_m][col_0],
            # row will get incremented, which is out of bounds
            if r == m - 1:
                c += 1
                flag = 1
            elif c == 0:
                r += 1
                flag = 1
            else:
                r += 1
                c -= 1
    
    return res