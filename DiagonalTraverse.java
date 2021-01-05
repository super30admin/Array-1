class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix==null || matrix.length==0 || matrix.length*matrix[0].length==0)
            return new int[]{};
        int total = matrix.length * matrix[0].length;
        
        int[] res = new int[total];
        res[0] = matrix[0][0];
        
        int count=1;
        int row = 0;
        int col = 0;
        
        while(count<total){
            
            if(row == 0 && col != matrix[0].length-1){
                col = col+1;
                while(row>=0 && row<=matrix.length-1 && col<=matrix[0].length-1 && col>=0 && count<total){
                    res[count] = matrix[row][col];
                    count++;
                    if(row==matrix.length-1 || col==0)
                        break;
                    else{
                        row++;
                        col--;
                    }
                }
            }
            if(col == 0 && row!=matrix.length-1){
                row = row + 1;
                while(row>=0 && row<=matrix.length-1 && col<=matrix[0].length-1 && col>=0 && count<total){
                    res[count] = matrix[row][col];
                    count++;
                    if(row==0 || col==matrix[0].length-1)
                        break;
                    else{
                        row--;
                        col++;
                    }
                }
            }
            if(row == matrix.length-1){
                col = col+1;
                while(row>=0 && row<=matrix.length-1 && col<=matrix[0].length-1 && col>=0 && count<total){
                    res[count] = matrix[row][col];
                    count++;
                    if(row==0 || col==matrix[0].length-1)
                        break;
                    else{
                        row--;
                        col++;
                    }
                }
            }
            if(col == matrix[0].length-1){
                row = row + 1;
                while(row>=0 && row<=matrix.length-1 && col<=matrix[0].length-1 && col>=0 && count<total){
                    res[count] = matrix[row][col];
                    count++;
                    if(row==matrix.length-1 || col==0)
                        break;
                    else{
                        row++;
                        col--;
                    }
                }
            }
        }
        return res;
    }
}

//Time complexity : O(M*N) M is the number of rows and N is the number of columns
//Space complexity : O(M*N)
