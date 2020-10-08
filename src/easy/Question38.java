package easy;

public class Question38 {
    public static void main(String[] args) {
        Solution s1 = new Solution();
        System.out.println(s1.countAndSay(4));
    }

}

class Solution {
    public String countAndSay(int n) {
        // 递归终止条件
        if (n == 1) {
            return "1";
        }

        StringBuffer res = new StringBuffer();
        String str = countAndSay(n - 1);
        int length = str.length();
        int start = 0;

        for (int i = 1; i < length + 1; i++) {
            if (i == length) {
                res.append(i - start).append(str.charAt(start));
            } else if (str.charAt(i) != str.charAt(start) ) {
                res.append(i - start).append(str.charAt(start));
                start = i;
            }
        }
        return res.toString();
    }
}
