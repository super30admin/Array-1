class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int left,right,bottom,top,i,j;
        List<Integer> result = new ArrayList<>();
        left=bottom=top=right=0;
        for(int k=1;k<=mat.length+mat[0].length-1;k++){
            if(k%2==1){
                if(k>mat.length){
                    i=mat.length-1;
                    j=k-(mat.length);
                }
                else{
                    i=k-1;
                    j=0;
                }
            }
            else{
                if(k>mat[0].length){
                    i=k-(mat[0].length);
                    j=mat[0].length-1;
                }
                else{
                    i=0;
                    j=k-1;
                }
            }
            while(i>=0 && i<mat.length && j>=0 && j<mat[0].length){
                result.add(mat[i][j]);
                i+=k%2==1?-1:1;
                j+=k%2==1?1:-1;
            }
        }
        return result.stream().mapToInt(l->l).toArray();
    }
}