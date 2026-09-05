class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> counts = new HashMap<>();
        for(char sChar : s.toCharArray()) {
            counts.merge(sChar, 1, Integer::sum);
        }

        for (char tChar : t.toCharArray()) {
            counts.merge(tChar, -1, Integer::sum);
            if (counts.get(tChar) < 0) return false;
        }

        return true;

    }
}
