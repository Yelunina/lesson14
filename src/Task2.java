/*
Найти элемент N в массиве из сгенерированных чисел и заменить его на минимальный элемент в массиве.
Если N не найден в массиве вывести сообщение, что элемент не найден!

пример: дано: {10,4,2,3, 1}, N = 2;. Результат: {10,4,1,3, 1}
 */


public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int elementN = 83;
        printArray(arr);
        fillArray(arr, 10, 99);
        printArray(arr);

        int index = searchElementIndex(arr, 83);
        System.out.println("ElementIndex = " + index);
        int min = searchMinElementArray(arr);
        System.out.println("MinElementIndex = " + min);

        if (index >= 0) {
            arr[index] = arr[min];
        } else {
            System.out.println("Element " + elementN + " not found");
        }
        printArray(arr);

    }
    public static int searchMinElementArray(int[] arr) {
        int minElementIndex = 0;
        int min = arr[minElementIndex];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minElementIndex = i;
            }
        }
        return minElementIndex;
    }

    public static int searchElementIndex(int[] arr, int elementN) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elementN) {
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
