class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] stringSplit = strs[i].toCharArray();
            Arrays.sort(stringSplit);
            String sortedString = new String(stringSplit);

            List<String> group = groups.getOrDefault(sortedString, new ArrayList<>());
            group.add(strs[i]);
            groups.put(sortedString, group);
            }

            return new ArrayList<>(groups.values());
        }
    }
