// Time Complexity :  O(m*n)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
func findDiagonalOrder(mat [][]int) []int {
    if len(mat) == 0{
        return []int{}
    }
    
    row:=0
    column:=0
    m:= len(mat)
    n:=len(mat[0])
    result := make([]int,m*n)
    index:=0
    
    dir:= 1 //upward
    
    for index < m*n{
        result[index] = mat[row][column]
        
        if dir == 1{
            if column == n-1{
                dir = -1
                row+=1 
                
            }else if row == 0{
                dir = -1
                column +=1
            }else{
                row -= 1
                column+= 1
            }
            
        }else{
            if row == m-1{
                dir = 1
                column+=1
            }else if column == 0{
                dir = 1
                row+=1
            }else{
                row+=1
                column-=1
            }
            
        }
        index+=1
        
    }
    
    return result
}
