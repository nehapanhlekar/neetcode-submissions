class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        String a = new String(sChars);
        String b = new String(tChars);
        if(a.equals(b))
        {
            return true;
        }
        return false;
    }
}