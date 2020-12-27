package sort;

public class insertionSort {
    public int[] sort(int... numbers) {
        int len = numbers.length;
        int index, temp;
        for (int i = 0; i < len; i++) {
            index = i - 1;
            temp = numbers[i];
            while (index >= 0 && numbers[index] > temp) {
                numbers[index + 1] = numbers[index];
                index--;
            }
            numbers[index + 1] = temp;
        }
        return numbers;
    }

    public static void main(String[] args) {
        final int[] sort = new insertionSort().sort(4, 2, 7, 9, 5, 3, 1);
        for (int i : sort) {
            System.out.println(i);
        }
    }
}
