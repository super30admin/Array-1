class Solution:
    #diagonal order of matrix

    # // Time Complexity : O(n*m) n=row of matrix, m=column of matrix
    # // Space Complexity :O(1) because the only list we initializine is the one we return 
    # // Did this code successfully run on Leetcode :yes
    # // Any problem you faced while coding this :no


    def spiralOrder(self,  matrix):
        res=[]
        top=0
        bottom=len(matrix)-1
        left=0
        right = len(matrix[0])-1

        while(top<=bottom and right>=left):
            i=left
            while (right>=i):                 #keep adding til you get to the right boundary
                res.append(matrix[top][i])
                i+=1
            top+=1

            if(right>=left):
                i=top
                while(i<=bottom):              #keep going till you get to the bottom boundary
                    res.append(matrix[i][right])
                    i+=1
                right-=1

            if(top<=bottom):
                i=right
                while(i>=left):                #keep going til you get to the left boundary
                    res.append(matrix[bottom][i])
                    i-=1
                bottom-=1

            if(right>=left):
                i=bottom
                while(i>=top):                  #keep going till you get to the top boundary
                    res.append(matrix[i][left])
                    i-=1
                left+=1
        return res

    
