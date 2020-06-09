# Time Complexity : O(m x n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Your code here along with comments explaining your approach

class Solution:
    def spiralOrder(self,matrix):
        if not matrix:
            return []
        left, right = 0, len(matrix[0])
        up, down = 0 , len(matrix)
        result = []
        while up < down:
            # left to right 
            for i in range(left, right):
                result.append(matrix[up][i])
            up += 1 
            
            # coming down
            if left < right:
                for i in range(up,down):
                    print(i,right-1)
                    result.append(matrix[i][right-1])
            right -= 1 
            
            # right to left 
            if up < down:
                for i in range(right-1,left-1,-1):
                    result.append(matrix[down-1][i])
            down -= 1 
            
            #down to up 
            if left < right:
                for i in range(down-1,up-1,-1):
                    result.append(matrix[i][left])
            left += 1 
        return result 
               

if __name__ == "__main__":
    s = Solution()
    # matrix = [[1,2,3],[4,5,6],[7,8,9]]
    matrix = [[1],[2],[3],[4],[5],[6],[7],[8],[9],[10]]
    res = s.spiralOrder(matrix)
    print(res)