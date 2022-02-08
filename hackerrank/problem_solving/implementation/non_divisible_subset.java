
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
        counter.put(0, 0);
        for (int i = 0; i < s.size(); i++) {
            if (counter.containsKey(s.get(i) % k)) {
                counter.put(s.get(i) % k, counter.get(s.get(i) % k) + 1);
            } else {
                counter.put(s.get(i) % k, 1);
            }
        }
        int count = 1;
        if(counter.containsKey(0)){
           count = Math.min(1, counter.get(0));
        }
        for(int i=1;i<Math.floor(k/2)+1;i++){
            if(i != k-i){
                if(counter.containsKey(i) && counter.containsKey(k-i)){
                    count+=Math.max(counter.get(i), counter.get(k-i));
                }else if(counter.containsKey(i)){
                    count+=counter.get(i);
                }else if(counter.containsKey(k-i)){
                    count+=counter.get(k-i);
                }
            }
        }
        if(k%2 == 0){
            count+=1;
        }

        return count;
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
