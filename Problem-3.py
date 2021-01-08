#Time Complexity :O(m*n)
#Space Complexity :O(m*n)
#Did this code successfully run on Leetcode :yes
#Any problem you faced while coding this : tried running sum.
class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        left=0
        right=len(matrix[0])-1
        top=0
        bottom=len(matrix)-1
        result=[]
       
        while(top<=bottom and left<=right):
            #l -> r
            
            if(top<=bottom and left<=right):
                for i in range(left,right+1):
                    result.append(matrix[top][i])
                top+=1
            #t --> b
            if(top<=bottom and left<=right):
                for i in range(top,bottom+1):
                    result.append(matrix[i][right])
                right-=1
            
            #r --> l
            if(top<=bottom and left<=right):
                for i in range(right,left-1,-1):
                    result.append(matrix[bottom][i])
                bottom-=1
            
            if(top<=bottom and left<=right):
                for i in range(bottom,top-1,-1):
                    result.append(matrix[i][left])
                left+=1
                
        return(result)
                
        