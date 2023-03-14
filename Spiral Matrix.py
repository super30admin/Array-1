# Time Complexity : O(mn)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        res = []
        rows = len(matrix)
        column = len(matrix[0])

        up, left = 0, 0
        right = column-1
        down = rows-1
        # while len(res) < rows * column:
        while(up <= down and left <= right):
            # print(res)
            for i in range(left,right+1):
                res.append(matrix[up][i])
            for i in range(up+1,down+1):
                res.append(matrix[i][right])
            if up != down:
                for i in range(right-1,left-1,-1):
                    res.append(matrix[down][i])
            if left != right:
                for i in range(down-1,up,-1):
                    res.append(matrix[i][left])

            right-=1
            left+=1
            up+=1
            down-=1

        return res
