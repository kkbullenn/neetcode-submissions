class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int number : nums) {
            set.add(number);
        }

        return set.size() != nums.length;
    }   
}