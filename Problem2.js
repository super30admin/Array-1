//Diagonal Traverse (LC 498)

// Time Complexity : O(m x n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Had to draw it out to figure it out

//Use while loop and change direction of which way to go

/**
 * @param {number[][]} matrix
 * @return {number[]}
 */
var findDiagonalOrder = function(matrix) {
    let result = [];
    if(matrix.length === 0 || matrix === null){
        return result;
    }
    let m = matrix.length;
    let n = matrix[0].length;
    let r = 0;let c = 0; let dir = 1;
    while(r <= m-1 && c <= n-1){
        result.push(matrix[r][c]);
        if(dir === 1){
            if(c===n-1){
                dir = -1;
                r++;
            } else if(r === 0){
                dir = -1;
                c++;
            } else {
                r--;c++;
            }
        } else{
            if(r === m-1){
                dir=1;
                c++;
            } else if(c === 0){
                r++;
                dir = 1;
            } else {
                c--;r++;
            }
        }
        
    }
    return result;
};