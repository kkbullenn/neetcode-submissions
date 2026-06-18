class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for (char character : s.toCharArray()) {
            sMap.merge(character, 1, Integer::sum);
        }

        for (char character : t.toCharArray()) {
            tMap.merge(character, 1, Integer::sum);
        }

        return sMap.equals(tMap);

    }
}
