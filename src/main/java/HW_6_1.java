import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class HW_6_1 {

    public static void main(String[] args) {

        //Задача №1 необходимо вывести сумму всех значений массива.

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        System.out.println("сумма всех значений массива = " + Arrays.stream(array).sum());

        //Задача №2 необходимо вывести максимальное значение массива.

        System.out.println("максимальное значение массива = " + Arrays.stream(array).max().getAsInt());

        //Задача №3 необходимо вывести минимальное значение массива

        System.out.println("минимальное значение массива = " + Arrays.stream(array).min().getAsInt());

        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        //Задача №4 необходимо вывести среднее арифметическое всех значений массива.

        System.out.println("среднее арифметическое всех значений массива = " + Arrays.stream(array2).average().getAsDouble());

        //Задача №5 необходимо вывести сумму элементов массива.

        int[][] arrays = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int sum = 0;
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                sum += arrays[i][j];
            }
        }
        System.out.println("сумму элементов вложенного массива = " + sum);

        //Задача №6 необходимо вывести максимальное значение массива.

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                if(arrays[i][j] > max){
                    max = arrays[i][j];
                }
            }
        }
        System.out.println("максимальное значение вложенного массива = " + max);

        //Задача №7 необходимо вывести количество элементов в массиве.

        int count = 0;
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                count++;
            }
        }
        System.out.println("количество элементов вложенного массива = " + count);
    }
}
