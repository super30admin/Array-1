#Time Complexity is: O(m*n) where m is the no of rows and n is no of columns in the matrix
#Space Complexity is: O(m*n) where m is the no of rows and n is no of columns in the matrix
#Code ran successfully on leetcode
#Faced no problems while coding this problem

#Program to return an array of all the elements of the array in a diagonal order 
class Solution(object):
    def findDiagonalOrder(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: List[int]
        """
        #self.m is equal to number of rows in the matrix
        self.m=len(mat)
        #self.n is equal to number of columns in the matrix
        self.n=len(mat[0])
        #Initializing an array of size equal to matrix with 0's
        self.result=[0 for i in range(0,self.m*self.n)]
        #Initializing index value to 0
        self.ind=0
        #Creating a direction variable such that if it is true the direction will be upward, otherwise it will be downward
        self.dir=True
        #taking the intial value of the current row and column to 0
        self.i=self.j=0
        #iterating through the while loop until it reaches the last index
        while(self.ind<len(self.result)):
            #storing the value of a particular row and column in the result array
            self.result[self.ind]=mat[self.i][self.j]
            self.ind+=1
            if(self.dir):
                #Upward direction
                #if the pointer is in the first row but not in the last column
                if(self.i==0 and self.j!=self.n-1):
                    self.j+=1
                    self.dir=False
                #if the pointer is in the first row and in the last column
                elif(self.j==self.n-1):
                    self.i+=1
                    self.dir=False
                #moving upward in diagonal fashion
                else:
                    self.i-=1
                    self.j+=1
            else:
                #Downward direction
                #if the pointer is in the first column and not in the last row
                if(self.j==0 and self.i!=self.m-1):
                    self.i+=1
                    self.dir=True
                #if the pointer is in the last row
                elif(self.i==self.m-1):
                    self.j+=1
                    self.dir=True
                #moving downward in diagonal fashion
                else:
                    self.i+=1
                    self.j-=1
        #returning the final result array
        return self.result

