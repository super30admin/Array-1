//time complexity: O(r*c) where r is number of rows and c is number of coulmns
//space complexity: O(1)
// Did this code successfully run on Leetcode : Yes
public class diagonalMatrix {
        public int[] findDiagonalOrder(int[][] mat) {
            int r = mat.length;
            int c = mat[0].length;
            int[] res = new int[r*c];
            int i=0,j=0,d=1,index=0;
            while(index<r*c){
                //System.out.println(mat[i][j]);
                res[index] = mat[i][j];
                index++;
                if(d==1){
                    if(i==0 && j!=c-1){
                       j++;
                       d=0;
                    }  
                    else if(j==c-1){
                        i++;
                        d = 0;
                    }
                    else{  
                        i--;
                        j++;
                    }
                }
                else{
                    if(j==0 && i!= r-1){
                        i++;
                        d=1;
                    }
                    else if(i==r-1){
                        j++;
                        d=1;
                    }
                    else{
                        i++;
                        j--;
                    }
                }
            }
            return res;
        }
    }

