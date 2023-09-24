/*
Дан массив чисел, найдите все четные числа в массиве и запишите эти числа в другой массив.
 Отсортируйте только **второй ** массив и распечатайте оба массива.
 */
public class Task4 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        fillArray(arr, 10, 99);
        printArray(arr);
        int[] arr2 = new int[arr.length];
        evenNumberArray(arr);
        printArray(arr2);

    }

    public static int[] evenNumberArray(int[] arr) {
        int[] arr2 = new int[arr.length];
        int j =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
                arr[i]=i;
                    j++;
                }
            }
        return arr2;
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
