// Time Complexity :O(n^2)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
//we need to follow the below show order for printing the elements of the matrix.

//[[ 1, 2, 3 ],[ 4, 5, 6 ],[ 7, 8, 9 ]]
//00  =0
//01,10 =1
//20,11,02  =2
//12,21  =3
//22  =4

//Below is the approach using the hashmap.Where I am string the elements at a particular (i+j)
 //and storing them in y array at the end
 
 class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix.length==0) return new int[]{};
        int[] arr = new int[matrix.length * matrix[0].length];
		HashMap<Integer, List<Integer>> hash = new HashMap<Integer, List<Integer>>();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				// System.out.println(hash);
				if (hash.containsKey((i + j))) {
					List<Integer> li = hash.get((i + j));
					li.add(matrix[i][j]);
					hash.put((i + j), li);
				} else {
					List<Integer> list = new ArrayList<Integer>();
					list.add(matrix[i][j]);
					hash.put((i + j), list);
				}
			}
		}
		//System.out.println(hash);
		int k = 0;

		for (int i : hash.keySet()) {
			if (i % 2 != 0) {
				for (int j : hash.get(i)) {
					arr[k] = j;
					k = k + 1;

				}
			} else {
				for (int j = hash.get(i).size() - 1; j >= 0; j--) {
					arr[k] = hash.get(i).get(j);
					k=k+1;
				}
			}
			
		}
		return arr;
    }
}

//below is the apprach without using the extra space.
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix.length==0) return new int[]{};
        int[] arr = new int[matrix.length * matrix[0].length];
       // System.out.println(arr.length);
        int i=0;
        int j=0;
        int direction=1;
        int totalSize=0;
        while(totalSize<arr.length){
            arr[totalSize]=matrix[i][j];
            if(direction==1){
                if(j==matrix[0].length-1){
                    i=i+1;
                    direction=-1;
                }else if(i==0){
                    j=j+1;
                    direction=-1;
                }else{
                    i=i-1;
                    j=j+1;
                }
                
            }else{
                if(i==matrix.length-1){
                    j=j+1;
                    direction=1;
                }else if(j==0){
                    i=i+1;
                    direction=1;
                }else{
                    i=i+1;
                    j=j-1;
                }
            }
            totalSize=totalSize+1;
        }
		
		return arr;
    }
}

