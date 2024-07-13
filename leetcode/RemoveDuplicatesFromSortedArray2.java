import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

public class RemoveDuplicatesFromSortedArray2 {

    public static  int removeDuplicates(int[] nums) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        Arrays.stream(nums).forEach(n->{
            if(map.containsKey(n)){
                map.put(n, map.get(n)+1);
            }else{
                map.put(n, 1);
            }
        });
        List<Integer> numbers = new ArrayList<>();
        map.entrySet().stream().forEach(entry->{
            int count = entry.getValue() > 2 ? 2 : entry.getValue();
            for (int i = 0; i < count; i++) {
                numbers.add(entry.getKey());
            }
        });
        for (int i = 0; i < nums.length; i++) {
            if(i < numbers.size()){
                nums[i] = numbers.get(i);
            }else{
                nums[i] = 999999999;
            }
        }
        return numbers.size();
    }
    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,1,1,2,3,3};
        RemoveDuplicatesFromSortedArray2.removeDuplicates(nums);
    }
}
