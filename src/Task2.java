/*
Найти элемент N в массиве из сгенерированных чисел и заменить его на минимальный элемент в массиве.
Если N не найден в массиве вывести сообщение, что элемент не найден!

пример: дано: {10,4,2,3, 1}, N = 2;. Результат: {10,4,1,3, 1}
 */

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        printArray(arr);
        fillArray(arr, 10, 99);
        printArray(arr);
        int index = search(arr, 83);
        System.out.println("Index = " + index);
        int min = minArray(arr);
        System.out.println("Min = " + min);
        int n = swapNOnMin(arr, 83);
        System.out.println("N = " + n);
        printArray(arr);


    }


    public static int swapNOnMin(int[] arr, int value) {
        int t = search(arr, value);
        int n = minArray(arr);
        t = n;
        n = t;
        return t;
    }

    public static int minArray(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int search(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static void fillArray(int[] arr, int min, int max) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (min + Math.random() * (max + 1 - min));
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

}
