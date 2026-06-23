class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        Set<Integer> numbers = new HashSet<>();
        for (int num : nums) {
            numbers.add(num);
        }

        return nums.length != numbers.size();
    }
}