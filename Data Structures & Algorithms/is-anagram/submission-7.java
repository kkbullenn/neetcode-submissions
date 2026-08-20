class Solution {
    public boolean isAnagram(String s, String t) {

        List<Character> sList = new ArrayList<>();
        List<Character> tList = new ArrayList<>();

        for (char character : s.toCharArray()) {
            sList.add(character);
        }

        for (char character : t.toCharArray()) {
            tList.add(character);
        }

        sList.sort(null);
        tList.sort(null);

        return sList.equals(tList);

    }
}
