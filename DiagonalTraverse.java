// Time Complexity : O(N*M)
// Space Complexity : O(N*M)
// Did this code successfully run on Leetcode : YES
// Three line explanation of solution in plain english

/*

Since we are asked to do zig zag traversal,
every number in matrix has row and column index sum associated with it. 

the unique sum and it's respective elements are  stored in hashmap.

If the sum is divisible by 2 then that particular elements list need to be reversed. 


*/

// Your code here along with comments explaining your approach
import java.util.*;
public class DiagonalTraverse {

    public static int[] findDiagonalOrder(int[][] mat) {
        
        if(mat==null || mat.length==0) return new int[]{};

        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();

        for(int i =0;i<mat.length;i++)
        {
            for(int j =0;j<mat[0].length;j++)
            {
                int sum = i+j;

                if(!map.containsKey(sum))
                {
                    map.put(sum, new ArrayList<Integer>());                   
                }                
                map.get(sum).add(mat[i][j]);
            }
        }

        int[] ans = new int[mat.length*mat[0].length];
        int k=0;

        for(Map.Entry<Integer,ArrayList<Integer>> entry: map.entrySet())
        {
            ArrayList<Integer> temp = new ArrayList<>();
            if(entry.getKey()%2==0)
            {
                temp = entry.getValue();
                Collections.reverse(temp);
            }
            else{
                temp = entry.getValue();
            }


            for(int i =0;i<temp.size();i++)
            {
                ans[k++]=temp.get(i);
            }
        }
        return ans;
    }

    public static void main(String args[])
    {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int[] ans = findDiagonalOrder(arr);

        for(int i:ans)
        {
            System.out.print(i+" ");
        }
    }
    
}
