class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) { return false; }

        Map<Character, Integer> counts = new HashMap<>();

        for(char letter : s.toCharArray()) {
            counts.merge(letter, 1, Integer::sum);
        }

        for (char letter : t.toCharArray()) {
            counts.merge(letter, - 1, Integer::sum);
            if (counts.get(letter) < 0) return false;
        }

        return true;
    }
}
