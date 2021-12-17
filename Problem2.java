//timecomplexity : O(m*n);
//spacecomplexity : o(1)
public class Problem2 {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat==null || mat.length ==0){
            return null;
        }
        int dir=1;
        int m = mat.length;
        int n=mat[0].length;
        int index=0,i=0,j=0;
        int[] result=new int[m*n];
       while(index<m*n){
           result[index]=mat[i][j];
           if(dir==1){
                if(j==n-1){
                   dir=-1;
                   i++;
               }else if(i==0){
                   dir=-1;
                   j++;
               }else{
                   j++;
                   i--;
               }
           }else{
             if(i==m-1){
                   dir=1;
                   j++;
               }else if(j==0){
                   dir=1;
                   i++;
               }else{
                   j--;
                   i++;
               }
           }
              index++;
       }
        
        return result;
    }
}
