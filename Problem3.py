#Time Complexity is: O(m*n) where m is the no of rows and n is no of columns in the matrix
#Space Complexity is: O(m*n) where m is the no of rows and n is no of columns in the matrix
#Code ran successfully on leetcode
#Faced no problems while coding this problem

#Program to return an array of all the elements of the array in a spiral order
class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        #sc: starting column index
        #sr: starting row index
        #er: ending row index
        #ec: ending column index
        self.sr=0
        self.sc=0
        self.er=len(matrix)
        self.ec=len(matrix[0])
        self.outputlist=[]

        while(self.sr<self.er and self.sc<self.ec):
            #printing the first row
            for i in range(self.sc,self.ec):
                #appending the values into the outputlist
                self.outputlist.append(matrix[self.sr][i])
            #Increasing the value of starting row index value
            self.sr+=1

            #printing the last column
            for i in range(self.sr,self.er):
                #appending the values into the outputlist
                self.outputlist.append(matrix[i][self.ec-1])
            #Decreasing the ending column index value
            self.ec-=1

            if(self.sr<self.er):
                #printing the last row
                for i in range(self.ec-1,self.sc-1,-1):
                    #appending the values into the outputlist
                    self.outputlist.append(matrix[self.er-1][i])
                #Decreasing the ending column index value
                self.er-=1
            
            if(self.sc<self.ec):
                #printing first column
                for i in range(self.er-1,self.sr-1,-1):
                    #appending the values into the outputlist
                    self.outputlist.append(matrix[i][self.sc])
                #Increasing the starting column index value
                self.sc+=1
        #returning the outputlist
        return self.outputlist

                


