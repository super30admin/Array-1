#diagonal array
#time complexity: O(m*n) m and n being the length of rows and cols respectively
#leetcode solution accepted
#space complexity:O(n)because we are creating a matrix

class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        num_rows = len(matrix) #define row
        num_cols = len(matrix[0])#define column
        diag=[[]for _ in range(num_rows+num_cols-1)]#create an matrix of rows and cols
        
        for i in range(num_rows):#start the iteration
            for j in range(num_cols):
                diag[i+j].append(matrix[i][j])#append the value to the diag
        res = diag[0]#intialize res at [0]
        for x in range(1,len(diag)):
            if x%2==1:#checking if even or odd, reason because we know that at even rows we need to add the values in the opp way
                res.extend(diag[x])
            else:
                res.extend(diag[x][::-1])
        return res