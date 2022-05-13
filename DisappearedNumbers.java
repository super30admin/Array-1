class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer,Integer>map = new HashMap<>();
        List<Integer>result = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=1;i<=nums.length;i++){
            if(!map.containsKey(i)){
                result.add(i);
            }
        }
        return result;
    }
}