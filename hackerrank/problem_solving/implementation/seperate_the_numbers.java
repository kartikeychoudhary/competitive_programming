import java.io.*;
import java.math.*;
import java.util.stream.*;

class Result {

    public static void separateNumbers(String s) {
        boolean flag = false;
        BigInteger theChoosenOne = new BigInteger("0");
        for (int i = 1; i < Math.floor(s.length() / 2) + 1; i++) {
            String test = "";
            BigInteger initial = new BigInteger(s.substring(0, i));
            while (test.length() < s.length()) {
                test += initial.toString();
                initial = initial.add(new BigInteger("1"));
            }
            if (test.equals(s)) {
                theChoosenOne = new BigInteger(s.substring(0, i));
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("YES " + theChoosenOne);
        } else {
            System.out.println("NO");
        }

    }

}

public class seperate_the_numbers {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                Result.separateNumbers(s);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}
