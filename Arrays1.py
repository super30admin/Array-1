


# Algorithm
# 1. Calculate product to left of element and right of element in seperate lists
# 2. Multiply the list to get the solution
# 3. Can be optimised by multiplying the right side running product directly to left side running product
# # TC-O(N)
# # SC-O(1)
class Solution25:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        rp=1
        temp=[1]
        for i in nums[:-1]:
            rp= rp*i
            temp.append(rp)

        rp=1
        for j in range(len(nums)-1,-1,-1):
            temp[j]=temp[j]*rp
            rp=rp*nums[j]
        return temp





class Solution26:
# Algorithm
# 1. Keep two direction 1 for upward and -1 for downward
# 2. upward can be traversed by decreaing i and increasing j (i and j are columns) and vice versa for downward
# 3. edge cases are when i is 0 or j is near length of matrix

# TC-O(M*N)-number of elements in matrix
# SC-O(1)
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        
        m= len(matrix)    #number of rows
        
        if m==0: return []
        
        n=  len(matrix[0]) #number of columns
    
        index=0
        i=0
        j=0
        dir=1
        result=[0 for i in range(m*n)]
        
        while index<m*n:
            result[index]=matrix[i][j]
            
            if dir==1:
                if j==n-1:
                    i=i+1
                    dir=-1
                elif i==0:
                    j=j+1
                    dir=-1
                else:
                    j=j+1
                    i=i-1
            else:
                if i==m-1:
                    j=j+1
                    dir=1
                elif j==0:
                    i=i+1
                    dir=1
                else:
                    j=j-1
                    i=i+1
            index=index+1
        return result
            
        





class Solution27:
# Algorithm
# 1. Keep all directions left,right,top,bottom and traverse
# TC-O(M*N)-number of elements in matrix
# SC-O(1)
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m= len(matrix)    #number of rows
        if m==0: return []
        n=  len(matrix[0]) #number of columns
        
        #get the pointers
        left=0
        right=n-1
        top=0
        bottom=m-1
        
        result=[]
        
        while(left<=right and top<=bottom):
            
            for i in range(left,right+1,1):
                result.append(matrix[top][i])
            top=top+1
            
            for i in range(top,bottom+1,1):
                result.append(matrix[i][right])
            right=right-1
            
            if top<=bottom:
                for i in range(right,left-1,-1):
                    result.append(matrix[bottom][i])
                bottom=bottom-1
            if left <=right:
                for i in range(bottom,top-1,-1):
                    result.append(matrix[i][left])
                left=left+1
        return result
            
            
            
       







