//time Complexity:O(n^2)
//space Complexity: O(1)


public class ProductOfArrayExceptItself {
    public int[] productExceptSelf(int[] nums) {



        int[] tempArray = new int[nums.length];
        int counter =0;

        for(int i=0;i<nums.length;i++){

            int sum =1;

            if(i==0){

                for(int j=1;j<nums.length;j++){

                    sum = sum*nums[j];
                }
                tempArray[counter]=sum;
                counter++;

            }else{

                int temp = nums[i];
                nums[i] = nums[0];
                nums[0] = temp;

                for(int j=1;j<nums.length;j++){

                    sum = sum * nums[j];
                }
                tempArray[counter]= sum;
                counter++;
            }

        }

        return tempArray;

    }
}
