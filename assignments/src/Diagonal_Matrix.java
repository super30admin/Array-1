import java.util.*;

public class Diagonal_Matrix {

    // Time: O(m*n), Space: O(m*n)
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix==null|| matrix.length==0) return new int[0];
        int N=matrix.length;
        int M=matrix[0].length;
        int[] res=new int[N*M];
        Map<Integer, List<Integer>> dict = new HashMap<>();
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<M;j++)
            {
                int sum=i+j;
                if(!dict.containsKey(sum))
                {
                    dict.put(sum, new ArrayList<>());
                }
                dict.get(sum).add(matrix[i][j]);
            }
        }
        int ctr=0;
        for(Map.Entry<Integer,List<Integer>> entry:dict.entrySet())
        {
            List<Integer> temp_list=new ArrayList<>();
            if(entry.getKey()%2 == 0)
            {
                temp_list=entry.getValue();
                Collections.reverse(temp_list);
            }
            else
            {
                temp_list=entry.getValue();
            }
            for(int i=0;i<temp_list.size();i++)
            {
                res[ctr++]=temp_list.get(i);
            }
        }
        return res;
    }
}
