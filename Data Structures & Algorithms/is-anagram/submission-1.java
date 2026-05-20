class Solution {
    public boolean isAnagram(String s, String t) {
        int[] letters1 = new int[26];
        for (int i = 0; i < s.length() ; i++) {
            letters1[s.charAt(i) - 'a']++;
        }

        int[] letters2 = new int[26];
        for (int i = 0; i < t.length() ; i++) {
            letters2[t.charAt(i) - 'a']++;
        }

        if(Arrays.equals(letters1, letters2)) return true;
        return false;
    }
}
