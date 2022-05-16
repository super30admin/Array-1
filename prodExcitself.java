class prodExcitself {

    public int[] productExceptSelf(int[] nums) {

        // edge

        if (nums == null || nums.length == 0)
            return new int[0];

        int[] result = new int[nums.length];

        int rp = 1;
        int temp = 1;

        // left pass

        for (int i = 0; i < nums.length; i++) {

            rp = rp * temp;

            result[i] = rp;

            temp = nums[i];

        }

        // [1,1,2,6]

        rp = 1;
        temp = 1;

        // right pass

        for (int i = nums.length - 1; i >= 0; i--) {

            rp = rp * temp;

            result[i] = result[i] * rp;

            temp = nums[i];

        }

        return result;

    }

}