public class problem1 {

    public static int[] func(int[] arr) {
        int[] res = new int[arr.length];
        // calculating product from left to right
        int prod = 1;

        for(int i=0;i<arr.length;i++) {
            res[i] = prod;
            prod *= arr[i];
        }
        //reset prod to 1;
        prod = 1;
        // calculating product from right to left
        for(int i=arr.length-1;i>=0;i--) {
            res[i] *= prod;
            prod *= arr[i];
        } 
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        
        for(int i=0;i<func(arr).length;i++) {
            System.out.println(func(arr)[i]);
        }
    }
}