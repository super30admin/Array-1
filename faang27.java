package leetcode;

//time complexity =O(m*n)
//space complexity=O(m*n)

class Faang27 {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat.length==0||mat==null) return new int[0];
        int m =mat.length;int n=mat[0].length;
        int r = 0; int c = 0;
        int[] result= new int[m*n];
        int i=0;
        int dir=1;
        while(i < m*n){
            result[i]=mat[r][c];
            if(dir==1){
                if(c==n-1){
                    r++;dir =-1;
                }else if(r==0){
                    c++;dir=-1;
                }else {c++;r--;}
            }
            else{
                if(r==m-1){
                    c++;dir=1;
                }else if(c==0){
                    r++;dir =1;
                }else{c--;r++;}
            }
            i++;
        }
        return result;
    }
}