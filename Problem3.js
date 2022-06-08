
// Time Complexity : O(m*n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/**
 * @param {number[][]} matrix
 * @return {number[]}
 */

// Easy understanding
  var spiralOrder = function(matrix) {
    const ret = [];
    let top = 0,
        bottom = matrix.length - 1,
        left = 0,
        right = matrix[0].length -1;
    
    let direction = 'right';
    let row = 0, 
        column = 0;
    const total  = matrix.length * matrix[0].length; 
    while(ret.length < total) {
        if(direction === 'right') {
            if(column === right) {
                direction = 'down';
                top += 1; 
            } else {
                ret.push(matrix[row][column]);
                column += 1;
            }
        }
        if(direction === 'down') {
            if(row === bottom) {
                direction = 'left';
                right -= 1; 
            } else {
                ret.push(matrix[row][column]);
                row += 1;
            }
        }
        if(direction === 'left') {
            if(column === left) {
                direction = 'up';
                bottom -= 1; 
            } else {
                ret.push(matrix[row][column]);
                column -= 1;
            }
        }
        if(direction === 'up') {
            if(row === top) {
                direction = 'right';
                left += 1; 
            } else {
                ret.push(matrix[row][column]);
                row -= 1;
            }
        }
    }
    return ret;
};

// Lesser lines of code, similar approach.

var spiralOrder = function(matrix) {
    var n = matrix.length;
    var m = (matrix[0] || []).length;
    var res = [];
    var x1 = 0;
    var x2 = m - 1;
    var y1 = 0;
    var y2 = n - 1;
    while (x1 <= x2 && y1 <= y2) {
      for (var x = x1; x <= x2; x++) res.push(matrix[y1][x]);
      for (var y = y1 + 1; y <= y2; y++) res.push(matrix[y][x2]);
      if (x1 < x2 && y1 < y2) {
        for (var x = x2 - 1; x > x1; x--) res.push(matrix[y2][x]);
        for (var y = y2; y > y1; y--) res.push(matrix[y][x1]);
      }
      x1++;
      x2--;
      y1++;
      y2--;
    }
    return res;
  };