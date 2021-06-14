{\rtf1\ansi\ansicpg1252\cocoartf2513
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fmodern\fcharset0 Courier;}
{\colortbl;\red255\green255\blue255;\red0\green0\blue0;}
{\*\expandedcolortbl;;\cssrgb\c0\c0\c0;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\partightenfactor0

\f0\fs24 \cf2 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 // Time Complexity : O(M*N)\
// Space Complexity : O(1) - No auxillary space except result list O(M*N)\
// Did this code successfully run on Leetcode :Yes\
// Any problem you faced while coding this :No\
\
class Solution \{\
    public List<Integer> spiralOrder(int[][] matrix) \{\
        if(matrix == null || matrix.length == 0) return new ArrayList<>();\
        List<Integer> result = new ArrayList<>();\
        int m = matrix.length;\
        int n = matrix[0].length;\
        int top = 0; int left = 0; int bottom = m - 1; int right = n - 1;\
        while(left<= right && top<= bottom)\{\
            if( top<= bottom)\{\
                for(int i = left; i <= right; i++)\{\
                    result.add(matrix[top][i]);\
                \}\
                top++;\
            \}\
            if(left<= right )\{\
                for(int i = top; i <= bottom; i++)\{\
                    result.add(matrix[i][right]);\
                \}\
                right--;\
            \}\
            if( top<= bottom)\{\
                for(int i = right; i>= left; i--)\{\
                    result.add(matrix[bottom][i]);\
                \}\
                bottom--;\
            \}\
            if(left<= right )\{\
                for(int i = bottom; i>= top; i--)\{\
                    result.add(matrix[i][left]);\
                \}\
                left++;\
            \}\
        \}\
        return result;\
    \}\
\}\
s}