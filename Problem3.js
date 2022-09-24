//Time: O(n*m), Space: O(1)
//Solution is accepted and runs on leetcode

 var spiralOrder = function(matrix) {
    if(matrix.length == 0 ) return [];
    let rows = matrix.length;
    let columns = matrix[0].length;
    let left= 0, right= columns-1, top= 0, bottom = rows-1;
    let result = [];
    while(top<=bottom && left <= right){
        for(let i=left; i<=right; i++){
            result.push(matrix[top][i])
        }
        top++;
        if(top<=bottom && left <= right){
            for(let i=top; i<=bottom; i++){
                result.push(matrix[i][right])
            }
            right--;
        }
        if(top<=bottom && left <= right){
            for(let i=right; i>=left; i--){
                result.push(matrix[bottom][i])
            }
            bottom--;
        }
        if(top<=bottom && left <= right){
             for(let i=bottom; i>=top; i--){
                result.push(matrix[i][left])
            }
            left++;
        }
    }
    return result;
};