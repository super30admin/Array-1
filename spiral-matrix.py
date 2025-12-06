
# Find the no. of rows and col. Assign top=0, left=0, down = r-1 and right = c-1.
#  find the total number of elemtns in the matrix as n. Assign an empty array arr. while left<=rigth and top<=down 
#  print the elemtns from left to right and then increment top
#  print elemts from top to down and decrement right
#  print elemts from right to left and decrement down
#  print elemetns from down to top and increment left

#  Time complexity: O(row*col)
#  Space complexity: O(1)


class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        r=len(matrix)
        c=len(matrix[0])
        top = 0
        left = 0
        down = r-1
        right = c-1
        n = r*c
        arr=[]
        while left<=right and top<=down:
            
            for i in range(left,right+1):
                arr.append(matrix[top][i])
            top+=1
               
            for i in range(top,down+1):
                arr.append(matrix[i][right])
            right-=1
            if top<=down:
                for i in range(right,left-1,-1):
                    arr.append(matrix[down][i])
                down-=1
            if left<=right:
                for i in range(down,top-1,-1):
                    arr.append(matrix[i][left])
                left+=1
        return arr