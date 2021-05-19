class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        '''
        TC : O(M*N)
        SC : O(1)
        
        Approach :
        
        Maintain 4 pointer 
            top : points the row from the top which is not explored  
            bottom : points the row from the bottom which is yet to explore 
            left : poites the column from the left which is yet to explore 
            right : points the column from the right which is yet to explore
        
        Start trversing from the top left element 
            1st : traverse the row at top pointer  // increment top counter as from top one row is traversed
            2nd : traverse the column at right pointer    // decrement right counter as from right one column is traversed
            3rd : traverse the row at bottom pointer  // decrement bottom counter as from bottom one row is traversed
            4th : traverse the column at left pointer    // incememt left counter as from left one column is traversed
            repeat this 4 steps unti we reach the point where (top > bottom or left > right).
        
        '''
        
        res = []
        if not matrix: return res
        
        left = 0 
        right = len(matrix[0])-1
        top =0 
        bottom = len(matrix) -1
        
        while top<= bottom and left <= right:
            for i in range(left,right+1):
                res.append(matrix[top][i])
            top += 1
            if top >bottom: break
            
            for i in range(top,bottom+1):
                res.append(matrix[i][right])
            right -= 1
            if left> right: break
                
            for i in range(right, left-1,-1):
                res.append(matrix[bottom][i])
            bottom -= 1
            
            for i in range(bottom,top-1,-1):
                res.append(matrix[i][left])
            left += 1
        return res