package com.company;

import java.util.ArrayList;
import java.util.List;

public class SpiralArray {
        int[][] dir = new int[][]{{0,1}, {1,0}, {0, -1}, {-1,0} };
        int choseDir = 0;
        public List<Integer> spiralOrder(int[][] matrix) {
            int m = matrix.length;
            int n = matrix[0].length;

            boolean[][] visited = new boolean[m][n];
            int i=0,j=0;
            List<Integer> out = new ArrayList();
            int count = 0;

            while(count<m*n){
                out.add(matrix[i][j]);
                visited[i][j]=true;
                count++;
                int[] param = choseNext(i,j,m,n, visited);
                i=param[0];
                j=param[1];
            }
            return out;
        }

        private int[] choseNext(int i,int j,int m, int n,boolean[][] visited){
            int k = i+dir[choseDir][0];
            int l = j+dir[choseDir][1];
            if(k<0 || k==m || l<0 || l==n || visited[k][l]){
                choseDir = (choseDir+1)%4;
                k = i+dir[choseDir][0];
                l = j+dir[choseDir][1];
            }
            return new int[]{k,l};
        }
}
