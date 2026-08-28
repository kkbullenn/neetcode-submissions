class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        return set.size() != nums.length;
    }
}