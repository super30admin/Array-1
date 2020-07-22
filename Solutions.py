'''
PROBLEM 1

TIME COMPLEXITY: O(N)
SPACE COMPLEXITY: O(1)

- traverse the array while calculating running product upto i-1 index and saving it in result array
- traverse the array from the end, calculating running sum upto i+1 index and keep multiplying with element at same index in result array
- the resulting array will denote the multiplication of elements on left and right side of the element at index

'''

class Solution:
    def array1(self, nums):
        left=[ 1 for i in range(len(nums))]

        for i in range(0, len(nums)-1):
            left[i+1]=nums[i]*left[i]

        right=1
        for i in range(len(nums)-1, -1, -1):
            left[i]=left[i]*right
            right*=nums[i]

        print(left)


obj=Solution()
input=[2,3,4,6]
obj.array1(input)


'''
PROBLEM 2

TIME COMPLEXITY: O(N)
SPACE COMPLEXITY: O(1)

- start from row=0 and col=0 and with direction=1 where direction =1 indicates upward and direction=0 indicates downwards
- when row and col hit the boundaries, change the direcction and update row and col 
- keep adding the element in result array while traversing and return 

'''

class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        if len(matrix)==0:
            return []
        direction=1
        m=len(matrix)-1
        n=len(matrix[0])-1
            
        row=0
        col=0
        result=[]
        while(row<=m and col<=n):
            result.append(matrix[row][col])
            if direction == 1:
                if col==n:
                    row+=1
                    direction=0
                elif row==0:
                    col+=1
                    direction=0
                else:
                    row-=1
                    col+=1
            
            elif direction ==0:
                if row==m:
                    col+=1
                    direction=1
                elif col==0:
                    row+=1
                    direction=1
                else:
                    row+=1
                    col-=1
            
        return result
            

'''
PROBLEM 3

TIME COMPLEXITY: O(N)
SPACE COMPLEXITY: O(1)

- start from row=0 and col=0 and with direction=1 where direction =1 indicates RIGHT , direction=2 indicates DOWN , direction=3 indicates LEFT , direction=4 indicates UP  
- when row and col hit the boundaries which are uuper, lower, right and left, change the direction and update row and col 
- whenever the direction changes, value of boundaries, upper, lower, right and left are updated accordingly

'''

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if len(matrix)==0:
            return []
        m=len(matrix)-1
        n=len(matrix[0])-1

        d=1
        row=0
        col=0
        result=[]
        
        upper=0
        lower=m
        right=n
        left=0
        
        while(upper<=row<=lower and left<=col<=right):
            print("row:",row)
            print("col:",col)
            result.append(matrix[row][col])
            
            if d==1:
                if col==right:
                    d=2
                    upper+=1
                    row+=1
                else:
                    col+=1
                
            
            elif d==2:
                if row==lower:
                    d=3
                    right-=1
                    col-=1
                else:
                    row+=1
                
            
            elif d==3:
                if col==left:
                    d=4
                    lower-=1
                    row-=1
                else:
                    col-=1
                    
            elif d==4:
                if row==upper:
                    d=1
                    left+=1
                    col+=1
                else:
                    row-=1
        return result
                