import java.util.*;
import java.util.stream.Collectors;

public class StreamsCommonTerminal {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2, 4, 6, 4, 8, 2, 10);

        // Print all numbers
        nums.stream().forEach(n -> System.out.print(n + " "));
        System.out.println();

        // Collect to list
        System.out.println("collect (List): " + nums.stream().collect(Collectors.toList()));

        // Count
        long c = nums.stream().count();
        System.out.println("count: " + c);

        // Sum using reduce
        int sum = nums.stream().reduce(0, Integer::sum);
        System.out.println("reduce (sum): " + sum);

        // Min using Optional
        Optional<Integer> min = nums.stream().min(Integer::compareTo);
        System.out.println("min: " + min.orElse(null));

        // Min and Max with orElseThrow
        int mini = nums.stream().min(Integer::compareTo).orElseThrow();
        int maxi = nums.stream().max(Integer::compareTo).orElseThrow();
        System.out.println(mini + " and " + maxi);

        // anyMatch for even check
        boolean anyEven = nums.stream().anyMatch(n -> n % 2 == 0);
        System.out.println("anyMatch (even?): " + anyEven);

        // allMatch for even check
        boolean allEven = nums.stream().allMatch(n -> n % 2 == 0);
        System.out.println("allMatch (all even?): " + allEven);
    }
}
