class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] splitString = strs[i].toCharArray();
            Arrays.sort(splitString);
            String sortedString = new String(splitString);

            List<String> group = groups.getOrDefault(sortedString, new ArrayList<>());
            group.add(strs[i]);
            groups.put(sortedString, group);
        }

        return new ArrayList<>(groups.values());
        
    }
}
