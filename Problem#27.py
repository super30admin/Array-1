#ran on leetcode

class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        result=[]
        
        n=len(matrix)     #no of row
        m=len(matrix[0])  #no of col
        
        #defining pointers
        left=0
        right=m-1
        top=0
        bottom=n-1

        # edge condition check
        if(matrix==0 or len(matrix)==0):
            return result
            #print "Null Array"

        #
        while(left<=right and top<=bottom):
            #case 1: top row:l->r
            for i in range(left,right+1):
                result.append(matrix[top][i])
            top+=1
            #case 2: right col:t->b
            for i in range(top,bottom+1):
                result.append(matrix[i][right])
            right-=1
            
            #case 3: bottom row:r->l; check t<=b
            if(top<=bottom):
                for i in range(right,left-1,-1): #note left-1
                    result.append(matrix[bottom][i])
                bottom-=1
            #case 4: left col:b->t; check l<=r
            if(left<=right):
                for i in range(bottom,top-1,-1):  #note top-1
                    result.append(matrix[i][left])
                left+=1
        return result
    

######################
#Complexity
#Time:O(mn)  # we are going through every element
#Space:O(1)  # we are not using any extra space
######################




# -*- coding: utf-8 -*-
"""
Created on Sat Dec  7 21:08:21 2019

@author: gunja
"""

#spiral array proble
matrix=[[11,2,333],[41,55,66],[7,88,99]]
#matrix=[[1,2,3],[4,5,6],[7,8,9]]
result=[]

m=len(matrix[0])  # no of col
n=len(matrix)     #no of row

#defining pointers
left=0
right=m-1
top=0
bottom=n-1

# edge condition check
if(matrix==0 or len(matrix)==0):
    #return result
    print "Null Array"
    
#
while(left<=right and top<=bottom):
    #case 1: top row:l->r
    for i in range(left,right+1):
        result.append(matrix[top][i])
    top+=1
    #case 2: right col:t->b
    for i in range(top,bottom+1):
        result.append(matrix[i][right])
    right-=1
    #case 3: bottom row:r->l; check t<=b
    print top
    print bottom
    print left
    print right
    if(top<=bottom):
        for i in range(right,left-1,-1): #note left-1
            result.append(matrix[bottom][i])
        bottom-=1
    #case 4: left col:b->t; check l<=r
    if(left<=right):
        for i in range(bottom,top-1,-1):  #note top-1
            result.append(matrix[i][left])
        left+=1


print result