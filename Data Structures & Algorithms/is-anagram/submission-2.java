class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
            Map<Character, Integer> sMap = new HashMap<>();
            Map<Character, Integer> tMap = new HashMap<>();

            for (char i : s.toCharArray()) {
                sMap.merge(i, 1, Integer::sum);
            }

            for (char j : t.toCharArray()) {
                tMap.merge(j, 1, Integer::sum);
            }
        

        return sMap.equals(tMap);
    }
}