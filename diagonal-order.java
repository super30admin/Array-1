// Time Complexity :
o(r*c) where r= rows and c=columns
// Space Complexity :
O(1) since we are not using any data structure to store the data
// Did this code successfully run on Leetcode :
YES
// Three line explanation of solution in plain english


// Your code here along with comments explaining your approach

/*
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
*/

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        
        if(matrix.length==0 || matrix==null) return new int[0];
        
        int rLength=matrix.length;
        int cLength=matrix[0].length;
        int noOfDiagonals=rLength+cLength-1;
        int [] res=new int[rLength * cLength];
        int resIndex=0;
        List<Integer> temp=new ArrayList<>();
        
        for(int i=0;i<noOfDiagonals;i++){
            temp.clear();
            /*set the row number and the column number for starting element
            of each diagonal
            */
            int m= i<cLength? 0: i-cLength+1;
            int n= i<cLength? i: cLength-1;
            
            /*now traverse from the element position calculated above by
            checking the base conditions of row and column
            */
            while(m<rLength && n>-1){
                temp.add(matrix[m][n]);
                ++m;
                --n;
            }
            
            //for alternate diagonals the elements should be printed in reverse order
            if(i%2 == 0){
                Collections.reverse(temp);
            }
            
            for(int k=0;k<temp.size();k++){
                res[resIndex++]=temp.get(k);
            }
            
        }
        
        return res;
        
    }
}