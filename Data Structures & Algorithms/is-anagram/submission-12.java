class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for (char sCharacter : s.toCharArray()) {
           sMap.merge(sCharacter, 1, Integer::sum);
        }

        for (char tCharacter : t.toCharArray()) {
           tMap.merge(tCharacter, 1, Integer::sum);
        }

        return sMap.equals(tMap);



    }
}
