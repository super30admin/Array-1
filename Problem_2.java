// Time Complexity :O(M*N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
//IN the below code I have taken the border and after every iteration of the for loop I am constricting the borders.

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<Integer>();
        int topBorder=0;
        int bottomBorder=matrix.length;
        int leftBorder=0;
        int rightBorder=matrix[0].length;
        int totalSize=matrix.length*matrix[0].length;
        while(list.size()<totalSize){
            for(int i=leftBorder;i<rightBorder &&(list.size()<totalSize);i++){
               // System.out.println(matrix[topBorder][i]);
                list.add(matrix[topBorder][i]);
            }
            topBorder=topBorder+1;
            for(int i=topBorder;i<bottomBorder &&(list.size()<totalSize);i++){
                //System.out.println(matrix[i][rightBorder-1]);
                list.add(matrix[i][rightBorder-1]);
            }
            rightBorder=rightBorder-1;
           // System.out.println("="+rightBorder);
            for(int i=rightBorder-1;i>=leftBorder &&(list.size()<totalSize);i--){
                //System.out.println(matrix[bottomBorder-1][i]);
                list.add(matrix[bottomBorder-1][i]);
            }
            bottomBorder=bottomBorder-1;
            for(int i=bottomBorder-1;i>=topBorder &&(list.size()<totalSize) ;i--){
                //System.out.println(matrix[i][leftBorder]);
                list.add(matrix[i][leftBorder]);
            }
            leftBorder=leftBorder+1;
           // break;
        }
        return list;
    }
}





























//Code for my reference.This version is failing few test case.Need to Check!!.

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<Integer>();
        int k=0;
        int m=0;
        while(list.size()<(matrix.length*matrix[0].length)){
            // System.out.println("m=="+m);
            // System.out.println("k=="+k);
            while(m<matrix[k].length && list.size()<(matrix.length*matrix[0].length)){
                System.out.println(matrix[k][m]);
                list.add(matrix[k][m]);
                m=m+1;
            }


            m=m-1;
            k=k+1;
            while(k<matrix.length && list.size()<(matrix.length*matrix[0].length)){
                System.out.println(matrix[k][m]);
                list.add(matrix[k][m]);
                k=k+1;
            }


            k=k-1;
            m=m-1;
            while(m>=0 && list.size()<(matrix.length*matrix[0].length)){
                System.out.println(matrix[k][m]);
                list.add(matrix[k][m]);
                m=m-1;
            }
            m=0;
            k=k-1;


            
        }
        return list;
    }
}