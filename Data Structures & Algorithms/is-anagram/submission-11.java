class Solution {
    public boolean isAnagram(String s, String t) {

        List<Character> sList = new ArrayList<>();
        List<Character> tList = new ArrayList<>();

        for (char letter : s.toCharArray()) {
            sList.add(letter);
        }

        for (char letter : t.toCharArray()) {
            tList.add(letter);
        }

        sList.sort(null);
        tList.sort(null);

        return sList.equals(tList);

    }
}
