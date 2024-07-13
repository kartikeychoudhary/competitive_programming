import java.util.ArrayList;
import java.util.List;

public class RotateArray {

    public static void rotate(int[] nums, int k) {
        int rotateBy = nums.length > k ? k : k % nums.length;
        List<Integer> result = new ArrayList<>();
        for(int i = nums.length - rotateBy; i < nums.length; i++){
            result.add(nums[i]);
        }
        for (int i = 0; i < nums.length - rotateBy; i++) {
            result.add(nums[i]);
        }
        for (int i = 0; i < result.size(); i++) {
            nums[i] = result.get(i);
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        RotateArray.rotate(nums, 8);
    }
}
