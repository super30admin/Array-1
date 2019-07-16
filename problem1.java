public class problem1 {

    public static void func(int[] arr) {
    int prod = 1;
        for(int i=0;i<arr.length;i++) {
            prod = prod*arr[i];
        }
        for(int i=0;i<arr.length;i++) {
            arr[i] = prod/arr[i];
        }
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        func(arr);
    }
}