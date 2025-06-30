import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.*;

public class StreamsIntermediateOperations {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2, 5, 2, 8, 7, 3, 8, 1);
        List<Integer> evens = nums.stream()
                                  .filter(n -> n % 2 == 0)
                                  .collect(Collectors.toList());
        System.out.println("Even numbers: " + evens);
        List<Integer> squares = nums.stream()
                                    .map(n -> n * n)
                                    .collect(Collectors.toList());
        System.out.println("Squares: " + squares);
        List<Integer> unique = nums.stream()
                                   .distinct()
                                   .collect(Collectors.toList());
        System.out.println("Distinct: " + unique);
        List<Integer> reverseSorted = nums.stream()
                                          .sorted()
                                          .sorted(Comparator.reverseOrder())
                                          .collect(Collectors.toList());
        System.out.println("Reverse Sorted: " + reverseSorted);



    }

}
