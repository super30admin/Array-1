class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        """
        Time Complexity: O(m x n)
        Space Complexity: O(1)
        Did this code successfully run on Leetcode: Yes 

        Any problem you faced while coding this: No
        Your code here along with comments explaining your approach:
        The approach: 
            - At any time, we either move in upward dir or downward dir
            - if dir = upward we set variable = True
                - if true we check whether the pointer is at the last col   
                    -if it is at the last col, we increase the row by 1 and change the dir to False
                    -else if it's at the first row, we increase the col by 1 and change the dir to False
                    -else in a normal case we decrease the row by 1 and increase the col by 1
                - else if we are moving in downward direction, we do the following:             
                    -if it is at the last row, we increase the col by 1 and change the dir to True
                    -else if it's at the first col, we increase the row by 1 and change the dir to True
                    -else in a normal case we increase the row by 1 and decrease the col by 1
        """
        i = 0; j = 0; m = len(mat[0]) - 1; n = len(mat) - 1
        dir = True
        res = list()
        while (i<=n and j<= m):
            if dir == True:
                if j == m:
                    res.append(mat[i][j])
                    i += 1
                    dir = False
                elif i == 0:
                    res.append(mat[i][j])
                    j += 1
                    dir = False
                else:
                    res.append(mat[i][j])
                    i -= 1 
                    j += 1
            else:
                if i == n:
                    res.append(mat[i][j])
                    j += 1
                    dir = True
                elif j == 0:
                    res.append(mat[i][j])
                    i += 1
                    dir = True
                else:
                    res.append(mat[i][j])
                    i += 1 
                    j -= 1
        return res