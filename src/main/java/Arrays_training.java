import java.util.Arrays;

public class Arrays_training {

    public static void main(String[] args) {

        // Task 1: 1, 2, 3, 4, 5…
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] =  i + 1;
        }
        System.out.println(Arrays.toString(array));

        //Task 2: 2,  4,  6,   8,  10...
        for (int i = 0; i < array.length; i++) {
            array[i] = (i + 1) * 2;
        }
        System.out.println(Arrays.toString(array));

        //Task 3: 1,  4,  9,  16,  25...
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)Math.pow((i + 1), 2);
        }
        System.out.println(Arrays.toString(array));

        //Task 4:  1,  8, 27,  64, 125...
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)Math.pow((i + 1), 3);
        }
        System.out.println(Arrays.toString(array));

        //Task 5: 1, -1,  1,  -1,   1,  -1...
        int num = 1;
        for (int i = 0; i < array.length; i++) {
            if(i % 2 == 0) {
                array[i] = - num;
            } else{
                array[i] = num;
            }
        }
        System.out.println(Arrays.toString(array));

        //Task 6: 1, -2,  3,  -4,   5,  -6...
        for (int i = 0; i < array.length; i++) {
            if(i % 2 == 0) {
                array[i] = i + 1;
            } else{
                array[i] = - (i + 1);
            }
        }
        System.out.println(Arrays.toString(array));

        //Task 7: 1, -4,  9, -16,  25
        for (int i = 0; i < array.length; i++) {
            if(i % 2 == 0) {
                array[i] = (int)(Math.pow((i + 1), 2));
            } else{
                array[i] = - (int)(Math.pow((i + 1), 2));
            }
        }
        System.out.println(Arrays.toString(array));

        //Task 8: 1,  0,  2,   0,   3
        int count = 1;
        for (int i = 0; i < array.length; i++) {
            if(i % 2 == 0) {
                array[i] = count++;
            } else{
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));

        //Task 9:   1  ,   2,     6  ,   24 ,   120 ,   720
        //        1 * 1; 1 * 2; 2 * 3; 6 * 4; 24 * 5; 120 * 6

        int a = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = a * (i + 1);
            a = array[i];
        }
        System.out.println(Arrays.toString(array));

        //Task 10: 0, 1, 1, 2, 3, 5, 8...
        for (int i = 0; i < 2; i++) {
            array[i] = i;
        }
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];;
        }
        System.out.println(Arrays.toString(array));
    }
}
