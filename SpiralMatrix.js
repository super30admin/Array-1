// Time Complexity : O(m * n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: Top, left, right, bottom is marked and traversed the matrix from left to right, top to bottom, right to left, bottom to top. To overcome index overflow, recheck top /bottom /left and right before every for loop.

/**
 * @param {number[][]} matrix
 * @return {number[]}
 */
var spiralOrder = function(matrix) {
  var m = matrix.length;
  var n = matrix[0].length;
  var top = 0;
  var left = 0;
  var right = n - 1;
  var bottom = m - 1;
  var result = new Array();

  while (top <= bottom && left <= right) {
    // move left to right
    for (var i = left; i <= right; i++) {
      result.push(matrix[top][i]);
    }
    top++;
    // move top to bottom
    if (left <= right) {
      for (var i = top; i <= bottom; i++) {
        result.push(matrix[i][right]);
      }
      right--;
    }

    // move right to left
    if (top <= bottom) {
      for (var i = right; i >= left; i--) {
        result.push(matrix[bottom][i]);
      }
      bottom--;
    }

    // move bottom to top
    if (left <= right) {
      for (var i = bottom; i >= top; i--) {
        result.push(matrix[i][left]);
      }
      left++;
    }
  }
  return result;
};
