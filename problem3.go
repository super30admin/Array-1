// Time Complexity :  O(m*n)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
func spiralOrder(matrix [][]int) []int {
    if len(matrix) == 0{
        return []int{}
    }
    
    m := len(matrix)
    n := len(matrix[0])
    top := 0
    bottom := m-1
    left := 0
    right := n-1
    
    result := []int{}
    
    for top<=bottom && left <= right {
        
        
        for i:=left;i<=right;i++{
            result = append(result,matrix[top][i])
        }
        top+=1
        
        if left <= right{
            for i:=top;i<=bottom;i++{
                result = append(result,matrix[i][right])
            }
            right-=1
        }

        if top<=bottom{
            for i:=right;i>=left;i--{
                 result = append(result,matrix[bottom][i])
            }

            bottom-=1
        }
        
        if left <= right{
            for i:=bottom;i>=top;i--{
                 result = append(result,matrix[i][left])
            }
            left+=1
        }

    }
    
    return result
}
