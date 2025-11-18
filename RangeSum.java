class RangeSum {
    private int sumArray[];

    public RangeSum(int[] nums) {
        sumArray = new int[nums.length];
        if (nums.length > 0){
            sumArray[0] = nums[0];
        }
        for (int i =1; i < nums.length; i ++){
            sumArray[i] = sumArray[i-1] + nums [i];
        }

    }

    public int sumRange(int left, int right) {
        if (left == 0)
            return sumArray[right];
        return sumArray[right] - sumArray[left-1];

    }
    public static void main(String[] args) {
        int[] arr = {-2, 0, 3, -5, 2, -1};
        RangeSum rs = new RangeSum(arr);
        System.out.println(rs.sumRange(2, 5));
    }


}