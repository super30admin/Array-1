//Time Complexity: O(mn)
//Space Complexity: O(1)


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DiagonalTraverse {

    public int[] findDiagonalOrder(int[][] mat) {

        if(mat.length == 0 || mat == null){

            return new int[0];
        }

        //Calculate number of rows and column.

        int N = mat.length;
        int M = mat[0].length;

        // declare the result array

        int[] res = new int[N*M];

        // Declare the intermediate array

        List<Integer> list = new ArrayList<>();

        int k=0;


        for(int i=0;i<N+M-1;i++){

            list.clear();




            int r = i<M?0:i-M+1;
            int c = i<M?i:M-1;

            while(r<N && c>-1){

                list.add(mat[r][c]);
                r++;
                c--;
            }


            if(i % 2 ==0){
                Collections.reverse(list);
            }

            for(int j=0;j<list.size();j++){

                res[k] = list.get(j);
                k++;
            }
        }

        return res;

    }
}
