/*
Дано два массива. Нужно в первом массиве найти индексы всех чисел из второго массива.
Найти индексы всех чисел из второго массива в первом массиве

пример: arr1 = {1, -10, 70, 101} arr2 = {1, 99}

Вывод: Число 1, найдено, индекс 0 Число 99, индекс не найдено
 */
public class Task5 {

    public static void main(String[] args) {
        int[] arr1 = new int[5];
        fillArray(arr1, 0, 10);
        printArray(arr1);
        int[] arr2 = new int[5];
        fillArray(arr2, 0, 10);
        printArray(arr2);

        findIndexes(arr1, arr2);
    }

    public static void findIndexes(int[] arr1, int[] arr2) {
        for (int j = 0; j < arr2.length; j++) {
            int num = arr2[j];
            boolean found = false;
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] == num) {
                    System.out.println("Число " + num + ", найдено, индекс " + i);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Число " + num + ", индекс не найдено");
            }
        }
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