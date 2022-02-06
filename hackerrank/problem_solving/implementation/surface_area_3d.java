import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class surface_area_3d {

    public static int surfaceArea(List<List<Integer>> A) {
        int surfaceArea = (A.size() * 1 * A.get(0).size() * 1) * 2;
        for (int i = 0; i < A.size(); i++) {
            for (int j = 0; j < A.get(i).size(); j++) {
                // W
                int w = 0;
                if (i == 0) {
                    w = A.get(i).get(j) * 1;
                } else if (i - 1 >= 0) {
                    if (A.get(i).get(j) > A.get(i - 1).get(j) * 1) {
                        w = A.get(i).get(j) * 1 - A.get(i - 1).get(j) * 1;
                    }
                }

                // L
                int l = 0;
                if (j == 0) {
                    l = A.get(i).get(j) * 1;
                } else if (j - 1 >= 0) {
                    if (A.get(i).get(j) > A.get(i).get(j - 1) * 1) {
                        l = A.get(i).get(j) * 1 - A.get(i).get(j - 1) * 1;
                    }
                }

                // F
                int f = 0;
                if (i == A.size() - 1) {
                    f = A.get(i).get(j) * 1;
                } else if (i + 1 <= A.size() - 1) {
                    if (A.get(i).get(j) > A.get(i + 1).get(j) * 1) {
                        f = A.get(i).get(j) * 1 - A.get(i + 1).get(j) * 1;
                    }
                }

                // R
                int r = 0;
                if (j == A.get(i).size() - 1) {
                    r = A.get(i).get(j) * 1;
                } else if (j + 1 <= A.get(i).size() - 1) {
                    if (A.get(i).get(j) > A.get(i).get(j + 1) * 1) {
                        r = A.get(i).get(j) * 1 - A.get(i).get(j + 1) * 1;
                    }
                }
                surfaceArea += w + l + f + r;
            }
        }
        return surfaceArea;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int H = Integer.parseInt(firstMultipleInput[0]);

        int W = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> A = new ArrayList<>();

        IntStream.range(0, H).forEach(i -> {
            try {
                A.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList()));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = surface_area_3d.surfaceArea(A);
        System.out.println(result);
        bufferedReader.close();
    }
}
