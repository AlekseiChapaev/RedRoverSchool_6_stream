public class HW_5 {
    public static void main(String[] args) {
//        0  1  2  3  4  5  6  7  8  9
//        0  1  2  3  4  5  6  7  8
//        0  1  2  3  4  5  6  7
//        0  1  2  3  4  5  6
//        0  1  2  3  4  5
//        0  1  2  3  4
//        0  1  2  3
//        0  1  2
//        0  1
//        0

        int digit = 10;
        String doubleSpace = "  ";
        String space = " ";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < digit; j++) {
                System.out.print(j + space);
            }
            digit--;
            System.out.println();
        }

//        0  1  2  3  4  5  6  7  8  9
//           0  1  2  3  4  5  6  7  8
//              0  1  2  3  4  5  6  7
//                 0  1  2  3  4  5  6
//                    0  1  2  3  4  5
//                       0  1  2  3  4
//                          0  1  2  3
//                             0  1  2
//                                0  1
//                                   0


        System.out.println();
        digit = 10;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < digit; j++) {
                System.out.print(j + space);
            }
            System.out.println();
            digit--;
            System.out.print(sb.append(doubleSpace));
        }

//        9 8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8 9
//          8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8
//            7 6 5 4 3 2 1 0 1 2 3 4 5 6 7
//              6 5 4 3 2 1 0 1 2 3 4 5 6
//                5 4 3 2 1 0 1 2 3 4 5
//                  4 3 2 1 0 1 2 3 4
//                    3 2 1 0 1 2 3
//                      2 1 0 1 2
//                        1 0 1
//                          0

        System.out.println();
        digit = 9;
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            for (int j = digit; j > 0 ; j--) {
                System.out.print(j + space);
            }
            for (int j = 0; j <= digit; j++) {
                System.out.print(j + space);
            }
            digit--;
            System.out.println();
            System.out.print(sb2.append(doubleSpace));

        }

    }


}
