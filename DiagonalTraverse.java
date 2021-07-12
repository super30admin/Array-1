import java.io.*;
import java.util.*;
public class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){

                int sum = i+j;

                if(map.containsKey(sum)){
                    ArrayList<Integer> list = map.get(sum);
                    list.add(mat[i][j]);
                    map.put(sum,list);
                }else{
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(mat[i][j]);
                    map.put(sum,list);
                }
            }
        }
        int max = mat.length-1 + mat[0].length-1;
        int length = mat.length*mat[0].length;

        int [] result = new int[length];

        int start =0;
        for(int i=0;i<=max;i++){

            if(i%2!=0){
                for(int j=0;j<map.get(i).size();j++){
                    result[start++] = map.get(i).get(j);
                }
            }else{
                Collections.reverse(map.get(i));
                for(int j=0;j<map.get(i).size();j++){
                    result[start++] = map.get(i).get(j);
                }
            }
        }
        return result;
    }
    public static void main(String[] args){
        DiagonalTraverse d = new DiagonalTraverse();
        int [][]nums = {{1,2,3},{4,5,6},{7,8,9}};
        int []result2 = d.findDiagonalOrder(nums);
        for(int i=0;i<result2.length;i++){
            System.out.print(result2[i]+" ");
        }

    }
}