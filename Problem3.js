// problem 3:https://leetcode.com/problems/spiral-matrix/?envType=study-plan-v2&envId=top-interview-150
// Accepted in LeetCode
//TC is O(m*n) and SC O(1)
/**
 * @param {number[][]} matrix
 * @return {number[]}
 */
var spiralOrder = function(matrix) {

    let left=0;
    let top =0;
    let right = matrix[0].length-1;
    let bottom=matrix.length-1;
    let size = matrix.length*matrix[0].length; 
    let result=[];
    
    while(result.length < size){

        for(let i=left;i <= right && result.length<size; i++){

            result.push(matrix[top][i])
        }
        top++;

        for(let i= top; i<=bottom && result.length<size; i++){

            result.push(matrix[i][right])
        }
        right--;

        for(let i=right; i>=left && result.length<size; i--){
            result.push(matrix[bottom][i])
        }
        bottom--;

        for(let i= bottom; i>=top && result.length<size; i--){
            result.push(matrix[i][left])
        }
        left++;
        }

    return result;
    
};