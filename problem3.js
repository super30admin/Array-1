//// https://leetcode.com/problems/diagonal-traverse/
//// Time Complexity : O(NxM) n and m are row length and num columns
//// Space Complexity : O(NxM) creating as much storage space as the input 2d array
//// Did this code successfully run on Leetcode : yes
//// Three line explanation of solution in plain english

// handle direction upwards and a separate direction downwards
// reverse direction if you can't go up (check bounds top and right)
// reverse direction if you can't go down (check bounds bottom and left)

//// Your code here along with comments explaining your approach
var findDiagonalOrder;

findDiagonalOrder = function(matrix) {
  var DOWNWARD, UPWARD, colx, dirs, index, output, rowy, x, y;
  if (matrix === null || matrix.length === 0 || matrix[0].length === 0) {
    return [];
  }
  UPWARD = 1;
  DOWNWARD = -1;
  rowy = matrix.length;
  colx = matrix[0].length;
  output = Array(colx * rowy);
  index = 0;
  dirs = UPWARD;
  y = 0;
  x = 0;
  while (index < colx * rowy) {
    output[index] = matrix[y][x];
    index += 1;
    if (dirs === UPWARD) {
      if (x === colx - 1) {
        dirs = DOWNWARD;
        y += 1;
      } else if (y === 0) {
        dirs = DOWNWARD;
        x += 1;
      } else {
        y -= 1;
        x += 1; //DOWNWARD
      }
    } else {
      if (y === rowy - 1) {
        dirs = UPWARD;
        x += 1;
      } else if (x === 0) {
        dirs = UPWARD;
        y += 1;
      } else {
        y += 1;
        x -= 1;
      }
    }
  }
  return output;
};

findDiagonalOrder([[1, 2, 3], [4, 5, 6], [7, 8, 9]]);

findDiagonalOrder([[2, 3]]);

//# sourceMappingURL=problem3.js.map
