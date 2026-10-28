class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int start = 0;
        int[] arr = new int[128];

        for (int end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);

            start = Math.max(start, arr[ch]);
            maxLen = Math.max(maxLen, end - start + 1);

            arr[ch] = end + 1;
        }

        return maxLen;
    }
}