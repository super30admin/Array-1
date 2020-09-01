//// Time Complexity : O(n) visiting all elements only once
//// Space Complexity : O(NxM) where n is the row length, m is the number of rows
//// Did this code successfully run on Leetcode : yes
//// Three line explanation of solution in plain english

// (0) start at pos 0, 0
// (1) go as far right as you can
// (2) go as far down as you can
// (3) go as far up
// (4) repeat from (1)

//// Your code here along with comments explaining your approach

// Pretty much the steps above, but
// update left, top, right, bottom pointers as you go
// check for boundaries (already hitting the end)
var spiralOrder;

spiralOrder = function(matrix) {
  var bottom, i, j, k, l, left, m, n, output, ref, ref1, ref2, ref3, ref4, ref5, ref6, ref7, right, top, x;
  if (matrix === null || matrix.length === 0 || matrix[0].length === 0) {
    return [];
  }
  output = [];
  n = matrix.length;
  m = matrix[0].length;
  top = 0;
  left = 0;
  bottom = n - 1;
  right = m - 1;
  while (top <= bottom && left <= right) {
// top row left -> right
    for (x = i = ref = left, ref1 = right; (ref <= ref1 ? i <= ref1 : i >= ref1); x = ref <= ref1 ? ++i : --i) {
      output.push(matrix[top][x]);
    }
    top += 1;
    // right column top -> bottom
    if (top <= bottom) {
      for (x = j = ref2 = top, ref3 = bottom; (ref2 <= ref3 ? j <= ref3 : j >= ref3); x = ref2 <= ref3 ? ++j : --j) {
        output.push(matrix[x][right]);
      }
      right -= 1;
    }
    // bottom row right -> left
    if (top <= bottom) {
      for (x = k = ref4 = right, ref5 = left; k >= ref5; x = k += -1) {
        output.push(matrix[bottom][x]);
      }
      bottom -= 1;
    }
    if (left <= right) {
// left column: bottom -> top
      for (x = l = ref6 = bottom, ref7 = top; l >= ref7; x = l += -1) {
        output.push(matrix[x][left]);
      }
      left += 1;
    }
  }
  return output;
};

//spiralOrder([
//  [ 1, 2, 3 ],
//  [ 4, 5, 6 ],
//  [ 7, 8, 9 ]
//])

//# sourceMappingURL=problem2.js.map
