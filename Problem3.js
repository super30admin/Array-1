//Spiral Matrix (LC 54)

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Had to draw it out to figure it out

//Use while loop and change top,bottom,right,left accordingly

/**
 * @param {number[][]} matrix
 * @return {number[]}
 */
var spiralOrder = function(matrix) {
    let result = [];
    if(matrix.length === 0 || matrix === null){
        return result;
    }
    let top = 0; let bottom = matrix.length - 1;
    let left = 0; let right = matrix[0].length - 1;
    while(top <= bottom && left <= right){
        //top
        for(let i = left;i<=right;i++){
            result.push(matrix[top][i]);    
        }
        //right
        top++;
        for(let i=top;i<=bottom;i++){
            result.push(matrix[i][right]);
        }
        right--;
        //bottom
        if(top <= bottom){
            for(let i=right;i>=left;i--){
                result.push(matrix[bottom][i]);
            }    
        }
        bottom--;
        //left
        if(left <= right){
            for(let i=bottom;i>=top;i--){
                result.push(matrix[i][left]);
            }
        }
        left++;
    }
    return result;
};