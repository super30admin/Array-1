// Time Complexity : O(nm)
// Space Complexity : O(n) or O(m)
// Did this code successfully run on Leetcode : Yes

// ## Problem 2
// https://leetcode.com/problems/diagonal-traverse/

// Given a matrix of M x N elements (M rows, N columns), 
// return all elements of the matrix in diagonal order as shown in the below image.

// Example:

// Input:

// [

// [ 1, 2, 3 ],

// [ 4, 5, 6 ],

// [ 7, 8, 9 ]

// ]

// Output: [1,2,4,7,5,3,6,8,9]

var findDiagonalOrder = function(matrix) {
    if(!matrix.length) return matrix
    const R = matrix.length;
    const C = matrix[0].length;
    const N = R * C;
    const res = [];
    
    let r = 0, c = 0;
    let up = true;
    while(res.length < N){
      const curr = matrix[r][c]
      res.push(curr)
      if(up){ // going up
        if(c === C-1){ // last column is met
          up = false
          r++ // go up one row
        }else if(r === 0){ // first row
          up = false;
          c++ // go up one column
        }else{ // continue going up
          r--
          c++
        }
      }else{ // going down
        if(r === R-1){ // last row
          up = true
          c++ // go up one column
        }else if(c === 0){ // first column
          up = true
          r++ // go up one row
        }else{ // continue going down
          r++
          c--
        }
      }
    }
    return res;
  };