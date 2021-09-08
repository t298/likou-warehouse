import java.util.HashMap;
import java.util.Map;

// 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
//你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。

// containsKey:检查 hashMap 中是否存在指定的 key 对应的映射关系。
// get:获取制定key对应的value
// put:将键/值对添加到 hashMap 中
public class twoSum {
    public static void main(String[] args) {
        int [] num={};
        int[] nums = {1, 2, 3, 4, 5, 6};
        int target = 7;

        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++) {
            if (map.containsKey(target - nums[i])) {
                num = new int[]{map.get(target - nums[i]), i};
        }
            map.put(nums[i], i);
        }
        for (int a:num
             ) {
            System.out.println(a);
        }
    }
}