import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class breaking_the_record {

    public static List<Integer> breakingRecords(List<Integer> scores) {
        AtomicInteger maxRecord = new AtomicInteger(scores.get(0));
        AtomicInteger maxCounter = new AtomicInteger(0);
        AtomicInteger minRecord = new AtomicInteger(scores.get(0));
        AtomicInteger minCounter = new AtomicInteger(0);

        scores.forEach(score -> {
            if (maxRecord.get() > score) {
                maxRecord.set(score);
                maxCounter.incrementAndGet();
            }
            if (minRecord.get() < score) {
                minRecord.set(score);
                minCounter.incrementAndGet();
            }
        });
        return Arrays.asList(new Integer[] { minCounter.get(), maxCounter.get() });
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = breaking_the_record.breakingRecords(scores);
        System.out.println(result.stream()
                .map(Object::toString)
                .collect(joining(" "))
                + "\n");

        bufferedReader.close();
    }
}
