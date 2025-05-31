# Time Complexity : O(N)
# Space Complexity : 0(1)
# Did this code successfully run on Leetcode : YES
# store the leftprod in an array and then iterate backwords to multiple it with rightprod

def productExceptSelf(self, nums: List[int]) -> List[int]:

        answer = [0] * len(nums)

        answer[0] = 1

        for i in range(1,len(nums)):
            answer[i] = answer[i-1] * nums[i-1]
        R= 1
        for j in range(len(nums)-1,-1,-1):
            answer[j] *= R
            R *= nums[j]
        return answer

# Time Complexity : O(N^2)
# Space Complexity : 0(1)
# Did this code successfully run on Leetcode : YES
# use up down indicators to specify if travelling updiagnonal opr downdiagnonal, oince edge case is reached change direction 


def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        
        m = len(mat)
        n = len(mat[0])

        if m == 0 or n == 0:
            return []
        mysize = m * n
        myarr = [0] * mysize
        idx = 0 
        up = 1
        row = 0
        col = 0

        while idx < mysize:
            print(row)
            print(col)
            if up == 1:          
                myarr[idx] = mat[row][col]
                idx+=1
    
                if col + 1 == n:
                    row+=1
                    up = 0

                elif row -1 < 0:
                    col +=1
                    up = 0

                else:
                    col +=1
                    row-=1
            else:
                myarr[idx] = mat[row][col]
                idx+=1

                if row+1 == m :
                    col +=1
                    up = 1

                elif col - 1 < 0:
                    row+=1
                    up = 1
                else:
                    col -=1
                    row+=1
        return myarr


# Time Complexity : O(N^2)
# Space Complexity : 0(1)
# Did this code successfully run on Leetcode : YES
# traverse in all 4 diretiosn 


class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m = len(matrix)
        n = len(matrix[0])
        output = [0] * (m*n)
        top = 0 
        left = 0
        right = n-1
        down = m-1
        idx = 0 
        while idx < (m*n):
            #left to right 
            for i in range(left,right+1):
                output[idx] = matrix[top][i]
                idx+=1
            #top to down 
            for i in range(top+1,down+1):
                output[idx] = matrix[i][right]
                idx+=1
            # right to left 
            if top != down:
                for i in range(right-1,left-1,-1):
                    output[idx] = matrix[down][i]
                    idx+=1
            if left != right:    
                # Traverse upwards.
                for i in range(down - 1, top, -1):
                    output[idx] = matrix[i][left]
                    idx+=1
            left+=1
            right-=1
            top+=1
            down-=1
        return output