#time complexity : O(m*n)
#space complexity : O(1)
#Did this code successfully run on Leetcode : Yes
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        #intialising row and column length
        m = len(matrix)
        n = len(matrix[0])
        result=[]
        #null conditions
        if matrix == None and len(matrix) == 0 :
            return []
        #initialising 4 pointers for sprial traversal
        left, top = 0,0
        right = n-1
        bottom = m-1
        row,column = 0,0 
        #the loop will terminate once right cross left and bottom cross top
        while left <= right and top<=bottom:
            #for traversal of top row i.e left to right of a particular row
            for column in range(left, right+1):
                result.append(matrix[top][column])
            #after top traversal is done increasing the top value
            top +=1
            #for traversal of down column i.e top to bottom of a particular column
            #checking base condition always before executing the for loop there might be the case that main while loop is working because top have not crossed bottom but left and right have crossed
            if left<=right:
                for row in range(top, bottom+1):
                    result.append(matrix[row][right])
                #after right pointer traversal is done decreasing the right value
                right -=1
            #for traversal of bottom row i.e right to left of a particular row
            if top<=bottom:
                for column in range(right, left-1, -1):
                    result.append(matrix[bottom][column])
                #after bottom pointer traversal is done decreasing the bottom value
                bottom -=1
             #for traversal of up in row i.e bottom to top of a particular column
            if left<=right:
                for row in range(bottom, top-1, -1):
                    result.append(matrix[row][left])
                #after left pointer traversal is done increasing the left value
                left +=1
            
        return result
            
