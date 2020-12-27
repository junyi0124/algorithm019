package l190;

//190. 颠倒二进制位(简单）

class Solution190 {
    // you need treat n as an unsigned value
    public static int reverseBits(int n) {

        System.out.printf("n =%s\n" , Integer.toBinaryString(n));
        int n1 = (n >>> 16);  // 无符号操作
        System.out.printf("n1=%s\n" , Integer.toBinaryString(n1));
        int n2 = (n << 16);
        System.out.printf("n2=%s\n" , Integer.toBinaryString(n2));
        n = n1 | n2;
        System.out.printf("n =%s\n" , Integer.toBinaryString(n));

        n1 = ((n & 0xff00ff00) >>> 8);
        System.out.printf("n1=%s\n" , Integer.toBinaryString(n1));
        n2 = ((n & 0x00ff00ff) << 8);
        System.out.printf("n2=%s\n" , Integer.toBinaryString(n2));
        n = n1 | n2;
        System.out.printf("n =%s\n" , Integer.toBinaryString(n));

        n1 = ((n & 0xf0f0f0f0) >>> 4);
        System.out.printf("n1=%s\n" , Integer.toBinaryString(n1));
        n2 = ((n & 0x0f0f0f0f) << 4);
        System.out.printf("n2=%s\n" , Integer.toBinaryString(n2));
        n = n1 | n2;
        System.out.printf("n =%s\n" , Integer.toBinaryString(n));

        n1 = ((n & 0xcccccccc) >>> 2);
        System.out.printf("n1=%s\n" , Integer.toBinaryString(n1));
        n2 = ((n & 0x33333333) << 2);
        System.out.printf("n2=%s\n" , Integer.toBinaryString(n2));
        n = n1 | n2;
        System.out.printf("n =%s\n" , Integer.toBinaryString(n));

        n1 = ((n & 0xaaaaaaaa) >>> 1);
        System.out.printf("n1=%s\n" , Integer.toBinaryString(n1));
        n2 = ((n & 0x55555555) << 1);
        System.out.printf("n2=%s\n" , Integer.toBinaryString(n2));
        n = n1 | n2;
        System.out.printf("n =%s\n" , Integer.toBinaryString(n));
        return n;
    }

    public static void main(String[] args) {
        final int bits = reverseBits(43261596);
        System.out.println(bits);
    }
}