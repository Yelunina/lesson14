import java.util.Arrays;
/*
Дан массив чисел, найдите все четные числа в массиве и запишите эти числа в другой массив.
 Отсортируйте только **второй ** массив и распечатайте оба массива.
 */
public class Task6 {
    public static void main(String[] args) {
        int[] source = {2,10, 8,25, 32, 4, 55};
        int[] destination = new int[source.length];
        for (int i = 0; i < source.length; i++) {
            if (source[i] % 2 == 0) {
                destination[i] = source[i];
            }

        }
        System.out.println(Arrays.toString(source));
        System.out.println(Arrays.toString(destination));
    }

}
