import java.util.stream.IntStream;

public class Sum_digits_in_number {
    public static void main(String[] args) {
        int number = 8;
        int sum = IntStream.iterate(1, s -> s <= number , s -> s + 1).sum();
        System.out.println(sum);

        int a = 7;
        IntStream.iterate(a, s-> s * 2).limit(5).forEach(System.out::println);
    }
}
