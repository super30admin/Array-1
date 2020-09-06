# Time Complexity : O(m+n)
# Space Complexity : O(m+n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach 
# Simple dfs approach for 4 directions and keep on checking visited array to avoid reiteration

def spiral(matrix):
    def dfs(i, j, d):
        #Mark the element as visited to avoid reiteration
        visited[i][j] = True
        ans.append(matrix[i][j])
        # get the value from the direction array and move accordingly
        dx, dy = dirs[d]  
        # add it to current row and col
        row = i + dx
        col = j + dy
        # check the boundary conditions
        if 0 <= row < m and 0 <= col < n and not visited[row][col]:
            dfs(row, col , d)
        # if it reaches boundary, change the direction
        else:
            # we only have 4 items in the dirs array to iterate only on those 4 take modulus
            d = (d+1) % 4
            #same process as above unless and until a not visited element is found
            dx, dy = dirs[d]
            row = i + dx
            col = j + dy
            if 0 <= row < m and 0 <= col < n and not visited[row][col]:
                dfs(row,col, d)
     

    if len(matrix) == 0 or len(matrix[0]) == 0:
        return
    m,n = len(matrix), len(matrix[0])
    # visited matrix to track whether element was visited
    visited = [[False for _ in range(n)] for _ in range(m)]
    #dirs list for 4 directions
    dirs = [[0,1], [1,0], [0,-1], [-1,0]]
    ans = []
    dfs(0,0,0)
    return ans


print spiral([[1,2,3],[4,5,6],[7,8,9]])
