#// Time Complexity : O(n) visiting all elements only once
#// Space Complexity : O(NxM) where n is the row length, m is the number of rows
#// Did this code successfully run on Leetcode : yes
#// Three line explanation of solution in plain english
#
# (0) start at pos 0, 0
# (1) go as far right as you can
# (2) go as far down as you can
# (3) go as far up
# (4) repeat from (1)
#
#
#// Your code here along with comments explaining your approach
#
# Pretty much the steps above, but
# update left, top, right, bottom pointers as you go
# check for boundaries (already hitting the end)

spiralOrder = (matrix) ->
  return [] if matrix == null or matrix.length == 0 or matrix[0].length == 0

  output = []

  n = matrix.length
  m = matrix[0].length

  top = 0
  left = 0
  bottom = n - 1
  right = m - 1

  while top <= bottom and left <= right
    # top row left -> right
    for x in [left..right]
      output.push(matrix[top][x])
    top += 1

    # right column top -> bottom
    if top <= bottom
      for x in [top..bottom]
        output.push(matrix[x][right])
      right -= 1

    # bottom row right -> left
    if top <= bottom
      for x in [right..left] by -1
        output.push(matrix[bottom][x])
      bottom -= 1

    if left <= right
      # left column: bottom -> top
      for x in [bottom..top] by -1
        output.push(matrix[x][left])
      left += 1

  output

#spiralOrder([
#  [ 1, 2, 3 ],
#  [ 4, 5, 6 ],
#  [ 7, 8, 9 ]
#])
