
// ## Problem 3
// Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

// Example 1:

// Input:

// [

// [ 1, 2, 3 ],

// [ 4, 5, 6 ],

// [ 7, 8, 9 ]

// ]
// Output: [1,2,3,6,9,8,7,4,5]
// Example 2:

// Input:

// [

// [1, 2, 3, 4],

// [5, 6, 7, 8],

// [9,10,11,12]

// ]
// Output: [1,2,3,4,8,12,11,10,9,5,6,7]

var spiralOrder = function(matrix) {
    //**Time Complexity: O(N X M) */
    //**Space Complexity: O(1) */
    let left = 0
    let top = 0
    let right = matrix[0].length-1
    let bottom = matrix.length-1
    let res = []
    while(left<=right && top<=bottom){
        //Travel left to right
        for(let j=left;j<=right;j++){
            res.push(matrix[top][j])
        }
        top++ 
        //Travel Top to Bottom
        for(let i=top;i<=bottom;i++){
            res.push(matrix[i][right])
        }
        right--
        //Travel Right to left
        if(top<=bottom){
            //Check again if top is less than equal to bottom
            for(let j=right;j>=left;j--){
            res.push(matrix[bottom][j])
        }
        bottom--

        }
        //Travel bottom to top
        if(left<=right){
            //Check again if left is less than right
            for(let i=bottom;i>=top;i--){
            res.push(matrix[i][left])
        }
        }
        left++
    }   
    return res
} 