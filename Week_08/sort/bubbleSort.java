package sort;

public class bubbleSort {
    public int[] sort(int... numbers) {
        int len = numbers.length;
        int temp = 0;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    temp = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers;
    }

    public static void main(String[] args) {
        final int[] sort = new bubbleSort().sort(4, 2, 7, 9, 5, 3, 1);
        for (int i : sort) {
            System.out.println(i);
        }
    }
}
