class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] letters1 = new int[26];
        for (int i = 0; i < s.length() ; i++) {
            letters1[s.charAt(i) - 'a']++;
            letters1[t.charAt(i) - 'a']--;
        }

        for (int value : letters1) {
            if (value != 0) {
                return false;
            }
        }
        return true;
    }
}
