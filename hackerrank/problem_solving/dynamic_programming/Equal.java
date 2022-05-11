import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class Equal {

    public static int solution(List<Integer> arr){
        Integer[] possibilities = new Integer[5];
        int min = arr.stream().mapToInt(Integer::intValue).min().getAsInt();
        for (int i = 0; i < possibilities.length; i++) {
            int sum = 0;
            for (Integer value : arr) {
                int diff = value - min;
                int steps = diff/5 + (diff%5)/2 + (diff%5)%2;
                sum+=steps;
            }
            possibilities[i] = sum;
            min--;
        }
        return Arrays.stream(possibilities).mapToInt(Integer::intValue).min().getAsInt();
    }

    public static void main(String[] args)throws IOException  {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

                int result = solution(arr);
                System.out.println(result);
            
            
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    
    }
}
