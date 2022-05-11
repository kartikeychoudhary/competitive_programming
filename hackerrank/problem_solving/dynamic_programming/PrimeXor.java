import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PrimeXor {
    public static final HashMap<Integer, Integer> counter = new HashMap<>();
    public static boolean checkPrime(int subject){
            Boolean prime = true;
            for(int j = 2; j < subject; j++){
                if(subject%j == 0){
                    prime = false;
                    break;
                }
            }
           return prime;
    }

    public static boolean calculatePrimeArray(List<Integer> arr){
        int t = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            t ^= arr.get(i);
        }
        return checkPrime(t);
    }

    public static int getXOR(List<Integer> arr){
        int t = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            t ^= arr.get(i);
        }
        return t;
    }

    public static int memo(Integer key, Integer value){
        if(counter.containsKey(key)){
            return counter.get(key);
        }else{
            counter.put(key, value);
        }
        return value;
    }

    public static int magicFunction(int count, List<Integer> arr){
        if(arr.size() == 1){
            if(counter.containsKey(arr.get(0))){return counter.get(arr.get(0));}
            return checkPrime(arr.get(0)) ? memo(arr.get(0), ++count): memo(arr.get(0), count);
        }else{
            for(int i = 0; i < arr.size();i++){
                final Integer it = arr.get(i);
                List<Integer> temp = arr.stream().filter((item)-> it!=item).collect(Collectors.toList());
                count += magicFunction(count, temp);
            }
            int xor = getXOR(arr);
            if(counter.containsKey(xor)){return counter.get(xor);}
            int t = checkPrime(xor) ? memo(xor, ++count) : memo(xor, count);
        }
        return count;
    }

    public static void solution(List<Integer> arr){
        System.out.println(magicFunction(0, arr));
    }

    public static void main(String[] args) {
        solution(Arrays.asList(new Integer[]{3511,3671,4153}));
    }
}
