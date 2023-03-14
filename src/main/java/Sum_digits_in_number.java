import java.util.stream.IntStream;

public class Sum_digits_in_number {
    public static void main(String[] args) {
        int number = 8;
        int sum = IntStream.iterate(1, s -> s <= number , s -> s + 1).sum();

        System.out.println(sum);
    }
}
