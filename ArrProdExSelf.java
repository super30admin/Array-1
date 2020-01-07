package Day11;

//TC: O(2n) -> O(n)
//SC: O(1) as using the output array itself for computation
public class ArrProdExSelf {

    public int[] prod(int arr[]){

        int[] result = new int[arr.length];

        //Edge
        if(arr == null || arr.length == 0) return result;

        int rp = 1;
        int temp = 1;

        //Left Pass
        for(int i=0; i<arr.length; i++){
            rp = rp * temp;
            result[i] = rp;
            temp = arr[i];
        }

        //Right pass + updating the final result as well

        //Reinitialize rp and temp else huge, undesirable products appear
        rp = 1;
        temp = 1;
        for(int i=arr.length-1; i>=0; i--){
            rp = rp * temp;
            result[i] = result[i] * rp;
            temp = arr[i];
        }
        return result;
    }

    public static void main(String args[]){
        int[] arr = new int[]{2,3,4,5};

        ArrProdExSelf obj = new ArrProdExSelf();

        int[] res = obj.prod(arr);

        for(int i=0; i<res.length; i++){
            System.out.print(res[i] + " ");
        }

    }
}
