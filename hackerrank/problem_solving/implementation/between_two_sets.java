import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class between_two_sets {
    public static int lcm(List<Integer> array) {
        int result = array.get(0);
        for (int i = 1; i < array.size(); i++) {
            result = lcm(result, array.get(i));
        }
        return result;
    }

    public static int gcd(List<Integer> array) {
        int result = array.get(0);
        for (int i = 1; i < array.size(); i++) {
            result = gcd(result, array.get(i));
        }
        return result;
    }

    public static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }

    public static int gcd(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void getTotalX(List<Integer> a, List<Integer> b) {
        int lcm = lcm(a);
        int gcd = gcd(b);
        int count = 0;
        for (int i = lcm, j = 2; i <= gcd; i = lcm * j, j++) {
            if (gcd % i == 0) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        int n = Integer.parseInt(firstMultipleInput[0]);
        int m = Integer.parseInt(firstMultipleInput[1]);
        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        between_two_sets.getTotalX(arr, brr);

        bufferedReader.close();
    }
}
