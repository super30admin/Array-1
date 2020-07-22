class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        #checking for Null matrix
        if matrix==None or len(matrix)==0:
            return []
        m=len(matrix)
        n=len(matrix[0])
        #initializing result matrix
        result=[0 for i in range(m*n)]
        left=0
        right=n-1
        top=0
        down=m-1
        count=0
        #traversing the array until count reaches length of result matrix
        while count<m*n:
            #traversing left
            for i in range(left,right+1):
                result[count]=matrix[top][i]
                count+=1
            #adjusting top boundary
            top+=1
            #traversing down
            if count<m*n:
                for i in range(top,down+1):
                    result[count]=matrix[i][right]
                    count+=1
                 #adjusting right boundary
                right-=1
            #traversing right
            if count<m*n:
                for i in range(right,left-1,-1):
                    result[count]=matrix[down][i]
                    count+=1
                 #adjusting down boundary
                down-=1
            #traversing up
            if count<m*n:
                for i in range(down,top-1,-1):
                    result[count]=matrix[i][left]
                    count+=1
                 #adjusting left boundary
                left+=1
        return result
#Time-Complexity: O(m*n)
#space Complexity: O(1) excluding result array