/*
Является ли массив строго возрастающей последовательностью

пример: 30, 31, 31, 39 - не является строго возрастающей последовательностью пример:
30, 31, 32, 39 - является строго возрастающей последовательностью
 */

import java.util.Arrays;


public class Task3 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        fillArray(arr, -10, 99);
        printArray(arr);

        Arrays.sort(arr);
        printArray(arr);

        boolean flag = isIncreasingSequence(arr);

        if (flag) {
            System.out.println("Массив является строго возрастающей последовательностью");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
    }

    public static boolean isIncreasingSequence(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
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



