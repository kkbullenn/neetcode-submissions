class Solution {
    public boolean isAnagram(String s, String t) {

        List<Character> sList = new ArrayList<>();
        List<Character> tList = new ArrayList<>();

        for (char chars : s.toCharArray()) {
            sList.add(chars);
        }

        for (char chars : t.toCharArray()) {
            tList.add(chars);
        }

        sList.sort(null);
        tList.sort(null);

        return sList.equals(tList);

    }
}
