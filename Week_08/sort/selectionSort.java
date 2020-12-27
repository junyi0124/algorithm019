package sort;

public class selectionSort {
    public int[] sort(int... numbers) {
        int len = numbers.length;
        int minIndex, temp;

        for (int i = 0; i < len - 1; i++) {
            minIndex = i;
            for (int j = i+1; j < len; j++) {
                if(numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }
            temp = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = temp;
        }
        return numbers;
    }

    public static void main(String[] args) {
        final int[] sort = new selectionSort().sort(4, 2, 7, 9, 5, 3, 1);
        for (int i : sort) {
            System.out.println(i);
        }
    }
}
