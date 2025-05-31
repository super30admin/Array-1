// ## Problem 2
// Given a matrix of M x N elements (M rows, N columns), return all elements of the matrix in diagonal order as shown in the below image.
// Example:
// Input:
// [

// [ 1, 2, 3 ],

// [ 4, 5, 6 ],

// [ 7, 8, 9 ]

// ]
// Output: [1,2,4,7,5,3,6,8,9]
// Did this code successfully run on Leetcode : YES
var findDiagonalOrder = function(mat) {
        //*Time Complexity : O(N X M) */
    //*Space Complexity : O(1)/
    let n = mat.length
    let m = mat[0].length
    let travelUp = true
    let res = []
    let i = 0
    let j = 0
    while(res.length < n*m){
        //Push the ele
        res.push(mat[i][j])
        if(travelUp){
            if(i==0 && j!=m-1){
                //ONLY TOP wall crossed
                //this means we are not at the last ele where both top and right walls are crossed 
            travelUp = false //set flag to false -> READY TO GO DOWN
            j++ //Move to right and 
        }
        else if(j==m-1){
            //Touched right wall -> that mean get ready to go down
            travelUp = false
            i++
        }
        else{
            //no walls breached
            i--
            j++
        }
            // res.push(mat[i][j])

        }
        else {
            if(j==0 && i!=n-1){ 
                //This means we have touched the left border but not the bottom one -> so move the pointer 
                travelUp=true //set flag to go up
                i++ // move down
            }   
            else if(i==n-1){
                //This means we have breached the bottom wall but not the left
                travelUp = true //ready to go left
                j++ // go left
            }
            else{
                //No walls breached
                // res.push(mat[i][j])
                i++
                j--
            }
        }
    }
    return res
};