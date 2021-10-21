using System;
// Time complexity is O(n)
// Space Complexity : O(1)

namespace DiagonalTraverse
{
  public class Solution {
    public int[] FindDiagonalOrder(int[][] mat) {
        int count = mat.Length * mat[0].Length;
        int flagUp = 1; int flagDown =0;
        int[] result = new int[count];
        int i=0; int j=0;
        int z = 0;
        while(z < count) {
            
            if(flagUp == 1) {
                    while(i >= 0 && j < mat[0].Length) {
                        result[z] = mat[i][j];
                        z++;
                        i--;
                        j++;
                    }
                    if(i < 0) {
                        i = 0;
                    }
                    if(j > (mat[0].Length-1)) {
                        j = mat[0].Length-1;
                        i = i+1;
                    }
                    flagUp = 0;
                    flagDown =1;
            }
            if(z < count){
                if(flagDown == 1) {
                     while(i < mat.Length && j >=0 ) {
                        result[z] = mat[i][j];
                        z++;
                        i++;
                        j--;
                    }
                     if(j < 0) {
                        j = 0;
                    }
                    if(i > mat.Length - 1) {
                        i = mat.Length - 1;
                        j = j+2;
                    }
                    flagUp = 1;
                    flagDown = 0;

                }
            }
        }
         return result;
    }
   
}
}
