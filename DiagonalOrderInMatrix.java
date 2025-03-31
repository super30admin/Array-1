/**
 * ## Problem 2
Given a matrix of M x N elements (M rows, N columns), return all elements of the matrix in diagonal order as shown in the below image.
Example:
Input:
[
[ 1, 2, 3 ],
[ 4, 5, 6 ],
[ 7, 8, 9 ]
]
Output: [1,2,4,7,5,3,6,8,9]
 */

 class DiagonalOrderMatrix {
    public int[] findDiagonalOrder(int[][] mat) {
    //     int[] res = new int[mat.length * mat[0].length];
    //     Map<Integer, List<Integer>> myMap = new HashMap<>();
    //     for (int i = 0; i < mat.length; i++) {
    //         for (int j = 0; j < mat[0].length; j++)
    //         {
    //             if (!myMap.containsKey(i + j)) {
    //                 List<Integer> newArrayList = new ArrayList<>();
    //                 newArrayList.add(mat[i][j]);
    //                 myMap.put(i + j, newArrayList);
    //             } else {
    //                 List<Integer> currentList = myMap.get(i+j);
    //                 currentList.add(mat[i][j]);
    //             }
    //         }
    //     }

    //     int index =0;
    //     for(Integer currentMap: myMap.keySet()){
    //         if(currentMap %2 == 0){
    //             //ReverseOrder
    //             for(int i= myMap.get(currentMap).toArray().length-1; i>=0; i--){
    //                 res[index++] = myMap.get(currentMap).get(i);
    //             }
    //         }
    //         else{
    //             for(int i= 0; i<myMap.get(currentMap).toArray().length; i++){
    //                 res[index++] = myMap.get(currentMap).get(i);
    //             }
    //         }
    //     }
    // return res;

    int m = mat.length;
    int n = mat[0].length;
    boolean dir = true;
    int row = 0;
    int col = 0;
    int[] res = new int[m*n];
    for(int i=0; i<m*n; i++){
        res[i] = mat[row][col];
        if(dir){
         if(row == 0 && col!= n-1){
            col++;
            dir = false;
         }   
         else if(col == n-1){
            row++;
            dir = false;
         }
         else{
            col++;
            row--;
         }
        }
        else{
            if(col == 0 && row != m-1){
                row++;
                dir = true;
            }
            else if(row ==  m-1){
                col++;
                dir = true;
            }
            else {
                col--;
                row++;
            }
        }
    }
    return res;
    }
}