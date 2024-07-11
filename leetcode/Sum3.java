import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sum3 {

    
    public static List<List<Integer>> threeSum(int[] nums) {
        HashMap<Integer, List<List<Integer>>> map = new HashMap<>();

        // calculate sum for 2 integers
        for(int i = 0; i< nums.length-1; i++){
            for(int j = i + 1; j<nums.length; j++){
                Integer sum = nums[i] + nums[j];
                List<Integer> array = new ArrayList<>();
                if(nums[i] > nums[j]){
                    array.add(j);
                    array.add(i);
                }else{
                    array.add(i);
                    array.add(j);
                }
                if(map.containsKey(sum)){
                    if(!map.get(sum).contains(array)){
                        map.get(sum).add(array);
                    }
                }else{
                    map.put(sum, new ArrayList<>());
                    map.get(sum).add(array);
                }
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(-nums[i])){
                List<List<Integer>> temp = map.get(-nums[i]);
                for(List<Integer> t : temp){
                    List<Integer> tempList = new ArrayList<>();
                    if(i == t.get(0) || i == t.get(1)){
                        break;
                    }
                    int f = nums[t.get(0)];
                    int l = nums[t.get(1)];
                    int n = nums[i];
                    if(n < f){
                        tempList.add(n);
                        tempList.add(f);
                        tempList.add(l);
                    }else if(n >= f && n <= l){
                        tempList.add(f);
                        tempList.add(n);
                        tempList.add(l);
                    }else{
                        tempList.add(f);
                        tempList.add(l);
                        tempList.add(n);
                    }
                    if(!result.contains(tempList)){
                        result.add(tempList);
                    }
                }
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        int[] test = new int[]{-7,-4,-6,6,4,-6,-9,-10,-7,5,3,-1,-5,8,-1,-2,-8,-1,5,-3,-5,4,2,-5,-4,4,7};
        System.out.println(threeSum(test));
    }
}
