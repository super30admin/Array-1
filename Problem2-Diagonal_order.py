class Solution(object):
    def findDiagonalOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        #base condition
        if not matrix:
            return []
        #direction variable (+1=up, -1=down)
        dir=1
        #boundaries
        i=0
        j=0
        r=len(matrix)
        c=len(matrix[0])
        res=[]
        #loop end condition>> until you get all elements in result array
        while (len(res)!=(r)*(c)):
            #append value to result>>starter res=[matrix[0][0]]
            res.append(matrix[i][j])
            #check conditions and move on
            if dir==1:
                #order of if and elif very important
                #consider element 3, if we increment j it will go out of bounds 
                #(when we consider (i==0) condition as first if block)
                if (j==c-1):
                    dir=-1
                    i+=1
                elif(i==0):
                    dir=-1
                    j+=1
                else:
                    i-=1
                    j+=1
                    
            elif dir==-1:
                if(i==r-1):
                    dir=1
                    j+=1
                elif(j==0):
                    dir=1
                    i+=1
                else:
                    i+=1
                    j-=1
        return res
                


#O(m*n)
#O(1) as result array was supposed to be returned so no auxiliary array
        
        