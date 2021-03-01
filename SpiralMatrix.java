// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

/* Return the matrix elements by traversing through the matrix in spiral order.
To get the output list in spiral order, traverse the matrix through spiral order by 
incrementing and decrementing the row,col while traversing through col and row respectively.
Initially row-1 and col-n is traversed, then iteratively traverse through c1 - cn col with r as constant
and traverse through r1 - rn with c as constant. In the next iteration incrrement the c1,r1 - decrement cn,rn 
and repeat the same to get spiral order.
*/

// Your code here along with comments explaining your approach

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        if(matrix.length == 0) return list;
        int r1=0,r2=matrix.length-1,c1=0,c2=matrix[0].length-1;
        while(r1<=r2 && c1<=c2){
            for(int i=c1;i<=c2;i++) list.add(matrix[r1][i]);
            for(int j=r1+1;j<=r2;j++) list.add(matrix[j][c2]);
            if(r1<r2 && c1<c2){
                for(int i=c2-1;i>=c1;i--) list.add(matrix[r2][i]);
                for(int j=r2-1;j>r1;j--) list.add(matrix[j][c1]);
            }
            r1++;
            r2--;
            c1++;
            c2--;
        }
        return list;
    }
}
