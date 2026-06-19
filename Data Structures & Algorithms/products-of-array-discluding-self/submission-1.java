class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftProducts = new int[nums.length];
        int[] rightProducts = new int[nums.length];

        rightProducts[nums.length - 1] = 1;
        leftProducts[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            leftProducts[i] = leftProducts[i - 1] * nums[i - 1];
        }

        for (int i = nums.length - 2; i >= 0; i--) {
            rightProducts[i] = rightProducts[i + 1] * nums[i + 1];
        }

        int[] output = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            output[i] = leftProducts[i] * rightProducts[i];
        }

        return output;
    }
}
