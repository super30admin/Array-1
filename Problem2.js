//Time: O(n*m) n= rows, m=columns
//Space: O(1)
//Solutions runs on leetcode and is a accpted solution.
 var findDiagonalOrder = function(mat) {
    let r = 0;
    let c = 0;
    let n = mat[0].length;
    let m = mat.length;
    let dir=1,idx=0;
    let result = Array(m*n).fill(0);
    while(idx < m * n){
        result[idx] = mat[r][c];
        idx++;
        if(dir == 1){
            if(c == n-1 ){
               dir =-1;
                r++;
            }else if(r==0){
                dir =-1;
                c++;    
            }else{
               c++;
               r--;
            }
        }else{
             if( r == m-1){
                dir = 1;
                c++;
            }else if(c==0){
                dir = 1;
                r++;          
            }else{
               r++;
               c--;
            }
        }
    }
    return result
    
};