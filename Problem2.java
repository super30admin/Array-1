import java.util.ArrayList;
import java.util.List;

public class Problem2 {
	 public static List<Integer> spiralOrder(int[][] matrix) {
	        if(matrix==null|| matrix.length==0)
	            return new ArrayList<>();
	        List<Integer> res = new ArrayList<>();
	        
	        int l=0,r=matrix[0].length-1;
	        int  t=0, b=matrix.length-1;
	        
	       
	        while(l<=r && t<=b){
	                //top row
	              for(int x=l;x<=r;x++)
	                  res.add(matrix[t][x]);
	              t++;
	             for(int x=t;x<=b;x++)
	                  res.add(matrix[x][r]);
	              r--;
	            if(t<=b){
	                 for(int x=r;x>=l;x--)
	                  res.add(matrix[b][x]);
	              b--;
	            }
	             if(l<=r){
	                 for(int x=b;x>=t;x--)
	                  res.add(matrix[x][l]);
	              l++;
	                
	             }
	            
	            }
	        
	         
	        return res;
	    }

	public static void main(String args[]) {
		int[][] arr = new int[][] {{ 1, 2, 3 },
			{ 4, 5, 6 },
			{ 7, 8, 9 }};
		List<Integer> res= spiralOrder(arr);
		for(int i : res) {
			System.out.println(i);
		}
	}
}
