
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class non_divisible_subset {

    public static int nonDivisibleSubset(int k, List<Integer> s) {
        HashMap<Integer, Integer> counter = new HashMap<>();
        for (int i = 0; i < s.size(); i++) {
            if (counter.containsKey(s.get(i) % k)) {
                counter.put(s.get(i) % k, counter.get(s.get(i) % k) + 1);
            } else {
                counter.put(s.get(i) % k, 1);
            }
        }
        AtomicInteger max = new AtomicInteger(0);
        List<Integer> keys = new ArrayList<Integer>(counter.keySet());
        keys.forEach(item -> {
            if (max.get() < counter.get(item)) {
                max.set(counter.get(item));
            }
        });

        return max.get();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        int n = Integer.parseInt(firstMultipleInput[0]);
        int k = Integer.parseInt(firstMultipleInput[1]);
        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        int result = non_divisible_subset.nonDivisibleSubset(k, s);
        System.out.println(result);
        bufferedReader.close();
    }
}
