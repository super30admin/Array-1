//Problem 2; https://leetcode.com/problems/diagonal-traverse/
// Accepted in LeetCode
//TC O(m*n) and SC O(1)

/**
 * @param {number[][]} mat
 * @return {number[]}
 */
var findDiagonalOrder = function(mat) {

    if(mat.length === 1) return mat.flat();

    let row = mat.length;
    let col = mat[0].length;

    // creating result matrix and intializing an empty array

    let result = Array.from(Array(row+col-1), ()=> new Array(). fill([]));

    for (let i=0;i<row; i++){
        for(let j=0;j<col;j++){
            if((i+j)%2 === 0){
            result[i+j].unshift(mat[i][j]);
        }
        else {  
            result[i+j].push(mat[i][j]);

        }
    }

}

return result.flat();
};