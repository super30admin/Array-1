// Time Complexity : O(n*m)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: Using the direction variable to increment/decrement i and j values in the matrix.

/**
 * @param {number[][]} mat
 * @return {number[]}
 */
var findDiagonalOrder = function(mat) {
  if (mat.length === 0 || mat === null) {
    return [];
  }

  var m = mat.length;
  var n = mat[0].length;
  var result = new Array(n * m);
  var index = 0;
  var i = 0;
  var j = 0;
  var dir = 1;

  while (index < m * n) {
    result[index] = mat[i][j];
    index++;
    // 1: for upward direction with decreasing number of rows
    //-1: for downward direction with decreasing number of columns
    if (dir === 1) {
      if (j === n - 1) {
        dir = -1;
        i++;
      } else {
        if (i === 0) {
          dir = -1;
          j++;
        } else {
          i--;
          j++;
        }
      }
    } else {
      if (i === m - 1) {
        dir = 1;
        j++;
      } else if (j === 0) {
        dir = 1;
        i++;
      } else {
        i++;
        j--;
      }
    }
  }

  return result;
};
