{\rtf1\ansi\ansicpg1252\cocoartf2513
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fmodern\fcharset0 Courier;}
{\colortbl;\red255\green255\blue255;\red0\green0\blue0;}
{\*\expandedcolortbl;;\cssrgb\c0\c0\c0;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\partightenfactor0

\f0\fs24 \cf2 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 // Time Complexity :  O(M*N) -  dimensions of matrix0 \
// Space Complexity : O(N) - Hashmap and List\
// Did this code successfully run on Leetcode :Yes\
// Any problem you faced while coding this :No\
\
\
class Solution \{\
    public int[] findDiagonalOrder(int[][] matrix) \{\
        int m = matrix.length;\
        if(matrix.length == 0)\{return new int[0];\}\
        int n = matrix[0].length;\
        Map<Integer,List<Integer>> map = new HashMap<>();\
        for(int i=0;i<m;i++)\
        \{\
            for(int j=0;j<n;j++)\{\
                int key = i+j;\
                if(!map.containsKey(key))\{\
                    map.put(key, new ArrayList<>());\
                \}\
                if(key % 2 == 0)\{\
                    map.get(key).add(0, matrix[i][j]);  //   \
                \}\
                else if(key % 2 == 1)\{\
                    map.get(key).add(matrix[i][j]);\
                \}\
            \}\
        \}\
        int[] res = new int[m*n];\
        int j =0;\
        for(int i=0; i<m+n-1;i++)\{ // no of diagonals\
            List<Integer> l = map.get(i);\
            System.out.println(i+ " "+l);\
            for(Integer element:l)\{\
                res[j++] = element;  // adding all the diagonals in the list\
            \}\
        \}\
        return res;\
    \}\
\}\
\
\
}