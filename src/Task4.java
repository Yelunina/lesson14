/*
Дан массив чисел, найдите все четные числа в массиве и запишите эти числа в другой массив.
 Отсортируйте только **второй ** массив и распечатайте оба массива.
 */
public class Task4 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        fillArray(arr, 10, 99);

        // Подсчет количества четных чисел в массиве
        int evenCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            }
        }
        // Создание массива для четных чисел
        int[] evenArr = new int[arr.length];
        int index = 0;
        // Заполнение массива четными числами
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenArr[i] = arr[i];
            }
        }
        // Сортировка второго массива
        for (int i = 0; i < evenArr.length; i++) {
            for (int j = 0; j < evenArr.length - i - 1; j++) {
                if (evenArr[j] > evenArr[j + 1]) {
                    int temp = evenArr[j];
                    evenArr[j] = evenArr[j + 1];
                    evenArr[j + 1] = temp;
                }
            }
        }
        // Вывод обоих массивов
        System.out.print("Исходный массив: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Массив четных чисел: ");
        for (int num : evenArr) {
            System.out.print(num + " ");
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
