class Solution {
    public boolean isAnagram(String s, String t) {

        List<Character> sList = new ArrayList<>();
        List<Character> tList = new ArrayList<>();

        for (char chara : s.toCharArray()) {
            sList.add(chara);
        }

        for (char chara : t.toCharArray()) {
            tList.add(chara);
        }

        sList.sort(null);
        tList.sort(null);

        return sList.equals(tList);

    }
}
