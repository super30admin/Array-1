//Time complexity:O(mn)
//Space complexity:O(1)
// Did this code successfully run on Leetcode :YES

public class DiagonalTraverse {
        public int[] findDiagonalOrder(int[][] mat) {
            if(mat==null || mat.length==0){
                return new int[] {};
            }
            int dir=1;
            int m=mat.length;
            int n=mat[0].length;
            int [] res=new int[m*n];
            int index=0,i=0,j=0;
            while(index<m*n){
                res[index]=mat[i][j];
                index++;
                if(dir==1){
                    if(j==n-1){
                        dir=-1;
                        i++;
                    }
                    else if(i==0){
                        dir=-1;
                        j++;
                    }
                    else{
                        i--;
                        j++;
                    }
                }
                else{
                    if(i==m-1){
                        dir=1;
                        j++;
                    }
                    else if(j==0){
                        dir=1;
                        i++;
                    }
                    else{
                        i++;
                        j--;
                    }
                    
                }
            }
            return res;
        }
    
    public static void main(String args[]){
        DiagonalTraverse obj=new DiagonalTraverse();
        int [][]mat={{1,2,3},{4,5,6},{7,8,9}};
        int res[]=obj.findDiagonalOrder(mat);
        for(int x: res){
            System.out.print(x+" ");
        }
    }
}
