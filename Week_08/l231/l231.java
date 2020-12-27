package l231;

//231. 2的幂
class Solution231 {
    public static boolean isPowerOfTwo(int n) {
        if (n == 0) return false;

        while (n % 2 == 0) {
            n = n >> 1;  // 等价 n / 2
        }
        return n == 1;
    }

    public static void main(String[] args) {
        boolean result = isPowerOfTwo(1);
        System.out.println(result);

        result = isPowerOfTwo(16);
        System.out.println(result);

        result = isPowerOfTwo(12);
        System.out.println(result);
    }
}