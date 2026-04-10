class Solution {
    public boolean isAnagram(String s, String t) {
        return sortString(s).equals(sortString(t));
    }

    public String sortString(String s) {
        char[] array = new char[s.length()];
        array = s.toCharArray();

        Arrays.sort(array);

        String results = "";

        for(int x = 0; x<s.length(); x++){
            results += array[x];
        }

        return results;
    }
}
