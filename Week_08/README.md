## 学习笔记

### 初级排序 O(n^2)
#### 选择排序 (selection sort)
每次找最小值，然后放到放到待排序数组的起始位置
```java
class selectionSort {
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
```
#### 插入排序 (insertion sort)
从前到后逐渐构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应的位置（比当前值小的）插入。
```java
class insertionSort {
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
```
#### 冒泡排序 (bubble sort)
循环嵌套，每次查看相邻的元素，如果逆序则交换。
```java
class bubbleSort {
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
        for(int i : sort) {
            System.out.println(i);
        }
    }
}
```
### 课后作业
#### 简单
- 位 1 的个数（Facebook、苹果在半年内面试中考过）
颠倒二进制位（苹果在半年内面试中考过）
- 用自己熟悉的编程语言，手写各种初级排序代码，提交到学习总结中。
- 2 的幂（谷歌、亚马逊、苹果在半年内面试中考过）
- 数组的相对排序（谷歌在半年内面试中考过）
- 有效的字母异位词（Facebook、亚马逊、谷歌在半年内面试中考过）

#### 中等
- LRU 缓存机制（亚马逊、字节跳动、Facebook、微软在半年内面试中常考）
- 力扣排行榜（Bloomberg 在半年内面试中考过）
- 合并区间（Facebook、字节跳动、亚马逊在半年内面试中常考）
#### 困难
- N 皇后（字节跳动、亚马逊、百度在半年内面试中考过）
- N 皇后 II （亚马逊在半年内面试中考过）
- 翻转对（字节跳动在半年内面试中考过）

