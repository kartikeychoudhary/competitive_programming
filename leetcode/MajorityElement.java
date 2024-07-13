
/*
* Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.



Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2


Constraints:

n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109


Follow-up: Could you solve the problem in linear time and in O(1) space?
* */

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        Arrays.stream(nums).forEach(n->{
            if(map.containsKey(n)){
                map.put(n, map.get(n)+1);
            }else{
                map.put(n, 1);
            }
        });
        AtomicInteger max = new AtomicInteger(0);
        AtomicInteger key = new AtomicInteger(0);
        map.forEach((key1, value) -> {
            if (value > max.get()) {
                key.set(key1);
                max.set(value);
            }
        });
        return key.get();
    }
    public static void main(String[] args) {
        int[] nums = new int[]{2,2,1,1,1,2,2};
        MajorityElement.majorityElement(nums);
    }
}
