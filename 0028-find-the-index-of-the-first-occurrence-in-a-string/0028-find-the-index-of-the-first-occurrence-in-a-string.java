class Solution {
    public int strStr(String haystack, String needle) {
        int a = haystack.length();
        int b = needle.length();
        
        if (b == 0) {
            return 0;
        }

        for (int i = 0; i <= a - b; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                int start = i;
                int place = b + i;
                boolean match = true;

                for (int j = i + 1, k = 1; j < place; j++, k++) {
                    if (needle.charAt(k) != haystack.charAt(j)) {
                        match = false;
                        break;
                    }
                }

                if (match) {
                    return start;
                }
            }
        }

        return -1;
    }
}
