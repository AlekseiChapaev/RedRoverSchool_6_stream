import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class HW_4 {
    /**
     * Задача №1
     * Необходимо вывести числа от 0 до 15.
     *
     * Задача №2
     *Необходимо вывести все положительные степени числа 5 которые меньше 10000, вывести результат возведения в степень.
     *
     * Задача №3
     * Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
     * Реализовать 2 варианта:
     * использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
     * без использования конструкции if (шаг цикла на ваше усмотрение).
     */

    public static void main(String[] args) {
        IntStream.rangeClosed(0, 15).forEach(System.out::println);

        Stream.iterate(1, s -> s < 1000, s -> s * 5).forEach(System.out::println);

        for (int i = 40; i < 60; i++) {
            if(i % 4 == 0){
                System.out.println(i);
            }
        }

        IntStream.rangeClosed(40, 60).filter(s -> s % 4 == 0).forEach(System.out::println);
        List<Integer> list = IntStream.rangeClosed(40, 60).filter(s -> s % 4 == 0).boxed().collect(Collectors.toList());
        System.out.println(list);
    }
}
