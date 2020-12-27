package l191;

//191. 位1的个数(简单）

class Solution191 {
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        int sum = 0;
        while (n != 0) {
            sum++;
            n &= (n - 1); // n = n & ( n-1 )
        }
        return sum;
    }

    public static void main(String[] args) {
        final int result = hammingWeight(00000000000000000000000000001011);

        System.out.println(result);
    }
}