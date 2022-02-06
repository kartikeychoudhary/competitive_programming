import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class apple_and_orange {

    public static boolean collisionDetection(int c1, int c2, int object) {
        if (object >= c1 && object <= c2) {
            return true;
        }
        return false;
    }

    public static int transposeToAxisX(int object, int tree) {
        return object + tree;
    }

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        AtomicInteger resultApples = new AtomicInteger(0);
        AtomicInteger resultOranges = new AtomicInteger(0);
        apples.forEach(apple -> {
            if (collisionDetection(s, t, transposeToAxisX(apple, a))) {
                resultApples.getAndIncrement();
            }
        });
        oranges.forEach(orange -> {
            if (collisionDetection(s, t, transposeToAxisX(orange, b))) {
                resultOranges.getAndIncrement();
            }
        });
        System.out.println(resultApples);
        System.out.println(resultOranges);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int s = Integer.parseInt(firstMultipleInput[0]);

        int t = Integer.parseInt(firstMultipleInput[1]);

        String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int a = Integer.parseInt(secondMultipleInput[0]);

        int b = Integer.parseInt(secondMultipleInput[1]);

        String[] thirdMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(thirdMultipleInput[0]);

        int n = Integer.parseInt(thirdMultipleInput[1]);

        List<Integer> apples = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> oranges = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        apple_and_orange.countApplesAndOranges(s, t, a, b, apples, oranges);

        bufferedReader.close();
    }
}
