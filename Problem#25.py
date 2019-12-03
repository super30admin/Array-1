# -*- coding: utf-8 -*-
"""
Created on Mon Dec 02 19:40:51 2019

@author: gunjan
"""
###############################################
#############Method 1: space compexity is high
###############################################
def solution1(input):
    if(input==[] or len(input)==0 ):
        return 0
        
    #forward pass
    temp=1
    runningP=1
    fwdarray=[]
    for i in range(len(input)):
        runningP=runningP*temp
        fwdarray.append(runningP)
        temp=input[i]
    
    #backward pass 
    runningP=1
    temp=1
    bckwdarray=[]
    for i in range(len(input)-1,-1,-1):
        runningP=runningP*temp
        bckwdarray.append(runningP)
        temp=input[i]
    
    bckwdarray.reverse() 
    
    import numpy as np
    result1 = np.multiply(fwdarray, bckwdarray)
    
    return result1

#Time Complexity=O(n)
#Space Complexity=O(n)
##############################################
#############Method 2: Space complexity is low
###############################################
def solution2(input):
    if(input==[] or len(input)==0 ):
        #return result
        print "Array of length 0"
        
    #forward pass
    temp=1
    runningP=1
    result2=[]
    for i in range(len(input)):
        runningP=runningP*temp
        result2.append(runningP)
        temp=input[i]
    
    #backward pass 
    runningP=1
    temp=1
    for i in range(len(input)-1,-1,-1):
        runningP=runningP*temp
        result2[i]=runningP*result2[i]
        temp=input[i]
    
    return result2

#Time Complexity=O(n)
#Space Complexity=O(1)

###############################################

solution1([0])
solution1([1,2,3,4])
    
solution2([0])
solution2([1,2,3,4])
    
    
