/*
Задача 1
Определить закономерность, согласно которой формируется та или иная числовая последовательность.
Написать методы, которые формируют первые N элементов данной последовательности
в виде целочисленного массива и выводит элементы массива на экран.
Дано:
последовательность 1: 2, 4, 6, 8, 10, 12, 14, 16, 18, 20
последовательность 2: 0, 0, 2, 0, 4, 0, 6, 0, 8, 0
последовательность 3: 0, 2, 0, 6, 0, 10, 0, 14, 0, 18
 */

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int arrayLength = 10; // число N из условия задачи
        int[] array = new int[arrayLength]; // длина массива 10
        sequence1(array);
        System.out.println(Arrays.toString(array));
        sequence2(array);
        System.out.println(Arrays.toString(array));
        sequence3(array);
        System.out.println(Arrays.toString(array));


    }

    // последовательность 1: 2, 4, 6, 8, 10, 12, 14, 16, 18, 20
    public static void sequence1(int[] array) {
        array[0] = 2;
        for (int i = 0; i < array.length - 1; i++) {
            array[i + 1] = array[i] + 2;
        }
    }

    //последовательность 2: 0, 0, 2, 0, 4, 0, 6, 0, 8, 0
    public static void sequence2(int[] array) {
        array[0] = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                array[i] = i;
            } else if (i % 2 != 0) {
                array[i] = 0;
            }
        }
    }

    //последовательность 3: 0, 2, 0, 6, 0, 10, 0, 14, 0, 18
    public static void sequence3(int[] array) {
        array[0] = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = i * 2;
            } else {
                array[i] = 0;
            }
        }
    }
}

