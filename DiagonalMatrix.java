class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        // two pointer for 2 direction up & down
        /* m = mat.length; n = mat[0].length;
          intially up
          loop till Array i < m * n

             if up
        //      loop till  r >= 0 , col < n
                  row dec , col inc
                if r < 0
                   r++
                else
                  C--
                  R = R + 2
             if down
                loop till c > = 0 , r < m
                  row inc , col dec
                IF C < 0
                    C++
                ELSE
                  R--
                  C=C+2
             dir change

         */

        int m = mat.length; // rows
        int n = mat[0].length; // cols

        int[] res = new int[m*n];

        boolean up = true;

        int r = 0; int c = 0;
        int i = 0;
        while( i < m*n ){
            if(up){ // when up
                while( c < n && r >= 0 ){
                    res[i] = mat[r][c]; //2 , 0
                    c++;
                    r--;
                    i++;
                }
                if (r < 0 && c < n){
                    r++;
                }
                else {
                    c--;
                    r = r + 2;
                }


            }
            else{ // when down
                while( c >= 0 && r < m ){
                    res[i] = mat[r][c]; // 0 , 1
                    c--; //0
                    r++; //1
                    i++;
                }
                if (c < 0 && r < m){
                    c++;
                }

                else{
                    r--;
                    c = c + 2;

                }

            }

            up = !up; // to change direction each time so that appropriate code runs
        }
        return res;


    }
}