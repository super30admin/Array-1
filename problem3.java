import java.util.*;
public class problem3 {

    public static List<Integer> spiral(int[][] arr) {
        List<Integer> returnArr = new ArrayList<Integer>();
        int rowStart = 0, rowEnd = arr.length-1,
        colStart = 0, colEnd = arr[0].length-1;
        while(rowStart<=rowEnd && colStart<=colEnd) {
            for(int i=colStart;i<=colEnd;i++) {
                returnArr.add(arr[rowStart][i]);
            }
            rowStart++;
            for(int i=rowStart;i<=rowEnd;i++) {
                returnArr.add(arr[i][colEnd]);
            }
            colEnd--;
            if(rowStart<=rowEnd) {
            for(int i=colEnd;i>=colStart;i--) {
                returnArr.add(arr[rowEnd][i]);
            }
            }
            rowEnd--;
            if(colStart<=colEnd) {
            for(int i=rowEnd;i>=rowStart;i--) {
                returnArr.add(arr[i][colStart]);
            }
            }
            colStart++;

        }
                return returnArr;
            }
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                   {4, 5, 6},
                   {7, 8, 9}
        };
        System.out.println(spiral(arr));
    }
}