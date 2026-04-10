class Solution {
    public boolean isSubsequence(String s, String t) {
        int lastIndex = -1;
        for(int x=0; x<s.length(); x++){
            char ch = s.charAt(x);
            int index = t.indexOf(ch, lastIndex + 1);
            if (index == -1){
                return false;
            } 

            lastIndex = index;
        }

        return true;
    }
}