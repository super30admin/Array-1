#sapce complexity: O(1)
#time complexity: O(m*n)
#ran on leetcode: yes
#By using 4 pointers, Top, bottom, left and right we can navigate through the array in a spiral order.
#whenver a row or colum is done we move onto the next row or column. We do all this until the top 
#stays lower tha bottom and left stays lower than right.
class Solution:
    def spiralOrder(self, matrix):
        n=len(matrix)
        m=len(matrix[0])
        top=0
        bottom=n-1
        left=0
        right=m-1
        L=[]
        while(top<=bottom and left<=right):
            #going through the upper row in left to right fashion
            for i in range(left,right+1):
                L.append(matrix[top][i])
            top+=1
            #since the top row was processed, need to check if top has goe beyone bottom and break it
            if(top>bottom):
                break
            #process the rightmost column from top to bottom
            for i in range(top,bottom+1):
                L.append(matrix[i][right])
            right-=1
            #since the right most column has been processed, check if it has gone beyond top
            if(left>right):
                break
            #process the bottom row in right to left fashion
            for i in range(right,left-1,-1):
                L.append(matrix[bottom][i])
            bottom-=1
            #since the bottom row has been processed, check if it has gone beyond top
            if(bottom<top):
                break
            #process the leftmost column in bottom to top fashion
            for i in range(bottom,top-1,-1):
                L.append(matrix[i][left])
            left+=1
        return L
matrix = [[1,2,3],[4,5,6],[7,8,9]]
s=Solution()
print(s.spiralOrder(matrix))