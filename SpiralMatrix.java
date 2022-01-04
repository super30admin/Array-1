//Time complexity --- O(mn)  since we traversed through each element in matrix.
//Space Complexity -- O(1)   No extra space utilized
import java.util.ArrayList;

import java.util.*;

public class SpiralMatrix{

    public List<Integer> spiralOrder(int[][] matrix){
        List<Integer> res = new ArrayList<>();
        if(matrix.length ==0) return res;
        if(matrix[0].length ==0) return res;

        int rowBegin =0;
        int rowEnd = matrix.length-1;
        int colBegin =0;
        int colEnd = matrix[0].length-1;
        while(rowBegin <= rowEnd && colBegin <=colEnd){
            for(int i =colBegin; i<=colEnd; i++){
                res.add(matrix[rowBegin][i]);
            }
            rowBegin++;
            for(int i = colEnd; i<=rowEnd;i++){
                res.add(matrix[i][colEnd]);
            }
            colEnd--;
            if(rowBegin<=rowEnd){
                for(int i = colEnd; i>=colBegin;i--){
                    res.add(matrix[rowEnd][i]);
                }
                rowEnd--;
            }
            if(colBegin <= colEnd){
                for(int i =rowEnd; i>=rowBegin; i--){
                    res.add(matrix[i][colBegin]);
                }
                colBegin++;
            }
        }
        return res;

    }
}