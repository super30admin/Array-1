class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map = new HashMap<>();
        int [] result = new int[2];
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
         for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i]) && map.get(target-nums[i])!=i ){
                result[0] = i;
                result[1] = map.get(target-nums[i]);
                break;
            }
         }
        return result;
}
}