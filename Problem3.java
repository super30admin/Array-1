import java.util.List;

public class Problem3 {
	
	  public static int[] findDiagonalOrder(int[][] matrix) {
	        
	        if(matrix==null || matrix.length==0)
	            return new int[0];
	        
	        int n= matrix.length,m=matrix[0].length;
	        int i=0,j=0,idx=0;
	        int[] output= new int[n*m];
	        boolean dir=true;
	        
	        while(idx<n*m){
	            output[idx]=matrix[i][j];
	            idx++;
	            
	            if(dir){
	                if(j==m-1){
	                    dir=false;
	                    i++;
	                }else if(i==0)
	                {
	                    dir=false;
	                    j++;
	                }else{
	                    i--;
	                    j++;
	                }
	            }
	            else{
	                if(i==n-1)
	                {
	                    dir=true;
	                    j++;
	                }else if(j==0){
	                    dir=true;
	                    i++;
	                }else{
	                    i++;
	                    j--;
	                }
	               
	            }
	        }
	            
	        return output;
	        
	    }
	
	public static void main(String args[]) {
		int[][] arr = new int[][] {{ 1, 2, 3 },
			{ 4, 5, 6 },
			{ 7, 8, 9 }};
		int[] res= findDiagonalOrder(arr);
		for(int i : res) {
			System.out.println(i);
		}
	}

}
