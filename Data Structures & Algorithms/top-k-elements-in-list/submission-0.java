class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            freqMap.put(nums[i], freqMap.getOrDefault(nums[i], 0) + 1);
        }

        List<Integer> numbers = new ArrayList<>();

        for (int key : freqMap.keySet()) {
            numbers.add(key);
        }

        Collections.sort(numbers, (a, b) -> Integer.compare(freqMap.get(b), freqMap.get(a)));
        int[] elements = new int[k];
        
        for (int i = 0; i < k; i++) {
            elements[i] = numbers.get(i);
        }

        return elements;
        

        
    }
}
