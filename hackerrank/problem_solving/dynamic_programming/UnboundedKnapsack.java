import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class UnboundedKnapsack {
    static HashMap<Integer, Integer> memo = new HashMap<>();

    public static int solve(int target, List<Integer> arr){
        List<Integer> results = new LinkedList<Integer>();
        if(memo.containsKey(target)){
            return memo.get(target);
        }
        for (int i = 0; i < arr.size(); i++) {
            if(target - arr.get(i) == 0){
               results.add(0);
            }else if(target - arr.get(i) < 0){
                results.add(target);
            }else{
                results.add(solve(target - arr.get(i), arr));
            }  
        }
        if(results.size()>0){
            int min = results.stream().mapToInt(Integer::intValue).min().getAsInt();
            if(memo.containsKey(target)){
                if(min < memo.get(target)){
                    memo.put(target, min);
                    return min;
                }else{
                    return memo.get(target);
                }
            }else{
                memo.put(target, min);
            }
            return min;
        }
        return target;
    }


    public static int solution(int target, List<Integer> arr){
        System.out.println(solve(target, arr));
        return 0;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // int t = Integer.parseInt(bufferedReader.readLine().trim());

        // String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        // int n = Integer.parseInt(firstMultipleInput[0]);

        // int k = Integer.parseInt(firstMultipleInput[1]);

        // List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        //     .map(Integer::parseInt)
        //     .collect(toList());

        int result = UnboundedKnapsack.solution(2000, Arrays.asList(new Integer[]{1999,1999}));


        bufferedReader.close();
    }
}
