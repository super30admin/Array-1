//Product of all except itselt
//Time O(n)
//Space O(n) ,  we do not count input array space and the return array space.
class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        if(nums.length==0||nums ==null) return new int[]{};;

        int n = nums.length;

        int[] l = new int[n];
        int[] r = new int[n];

        int p = 1;
        //left
        for(int i = 0; i<n ; i++){
            l[i] = p;
            p*=nums[i];
        }

        p = 1;
        //right
        for(int i= n-1 ; i>=0 ; i--){
            r[i] = p;
            p*=nums[i];
        }

        for(int i = 0 ; i<n ; i++){
            l[i] = l[i] * r[i];
        }
        return l;
    }
}
// DIAGONAL TRAVERSE
//Time O(m*n)
//Space O(1) ,  we do not count input array space and the return array space.
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {

        if(mat.length ==0|| mat == null) return new int[]{};

        // m = rows, n = columns
        int m = mat.length;
        int n = mat[0].length;
        int dir = 1;
        int[] out = new int[m*n];

        int i =0;
        int j = 0;
        out[0] = mat[i][j];
        for(int k = 1 ; k< out.length ;k++){
            
            if(dir==1){
                if(i==0){
                    if(j== n-1){
                        i++;
                    } else {
                        j++;
                           }
                    dir = -1;
                } else if(j==n-1) {                    
                        i++;
                        dir =-1;
                    }
                else {
                    i--;
                    j++;
                }
            } else if(dir== -1) {
                if(j==0){
                    if(i==m-1){
                        j++;
                    } else {
                        i++;
                            }
                    dir = 1;
                } else if(i==m-1) {                    
                        j++;
                        dir =1;
                    }
                    else {
                    i++;
                    j--;
                }
            }
            out[k] = mat[i][j];
        }  
        return out;
    }
}

//SPIRAL TRAVERSE
//Time O(m*n)
//Space O(1) ,  we do not count input array space and the return array space.
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        if(matrix.length==0||matrix ==null) return new ArrayList<>();

        //is horizontal or vertical iteration going on
        boolean isH = true;
        //positive direction i.e. left to right or top to down. Similarly negative is right to left and down to up
        int dir = 1;
        //end column i.e. initially it will be last column and once last column of spiral is complete ,no need to revisit last column
        int lastCol = matrix[0].length-1;
        int firstCol = 0;
        int firstRow = 0;
        int lastRow = matrix.length-1;
        int r = 0;
        int c = 0;
        int i = 0;
        ArrayList<Integer> result = new ArrayList<>();
        while(result.size() < matrix[0].length*matrix.length){
            result.add(Integer.valueOf(matrix[r][c]));
            if(isH && dir ==1){
                if(c==lastCol){
                    firstRow++;
                    r++;
                    isH = false;
                }else{
                    c++;
                }               
            } else if(!isH && dir==1){
                if(r==lastRow){
                    lastCol--;
                    c--;
                    isH = true;
                    dir = -1;
                }else{
                    r++;
                }
            }

             else if(isH && dir ==-1){
                if(c==firstCol){
                    lastRow--;
                    r--;
                    isH = false;
                }else{
                    c--;
                }               
            } else if(!isH && dir==-1){
                if(r==firstRow){
                    firstCol++;
                    c++;
                    isH = true;
                    dir = +1;
                }else{
                    r--;
                }
            }
        }
        return result;
    }
}




