class Solution {

    public String encode(List<String> strs) {
        List<String> appendedString = new ArrayList<>();
        for (String string : strs) {
            appendedString.add(string.length() + "#" + string);
        }

        String encoded_string = String.join("", appendedString);

        return encoded_string;

    }

    public List<String> decode(String encoded_string) {
        char delimiter = '#';
        List<String> decoded_string = new ArrayList<>();
        int i = 0;
        while ( i < encoded_string.length()) {
        
            int j = encoded_string.indexOf(delimiter, i);
            int currentLength = Integer.parseInt(encoded_string.substring(i, j));

            String word = encoded_string.substring(j + 1, j + 1 + currentLength);
            decoded_string.add(word);
        i = j + currentLength + 1;
    }

        return decoded_string;
    }
}
