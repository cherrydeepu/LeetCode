class Solution {
    public int getLucky(String s, int k) {
        String num = "";

        for (char ch : s.toCharArray()) {
            num += (ch - 'a' + 1);
        }

        while (k-- > 0) {
            int sum = 0;

            for (char ch : num.toCharArray()) {
                sum += ch - '0';
            }

            num = String.valueOf(sum);
        }

        return Integer.parseInt(num);
    }
}