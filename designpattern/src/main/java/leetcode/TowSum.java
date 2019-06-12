package leetcode;

import java.util.HashMap;
import java.util.Map;


public class TowSum {

    /**
     * 1加到100不用循环
     */
    private static int sumMethod(int num){
        if(num == 1){
            return 1;
        }
        if(num > 1) {
            return num + sumMethod(num - 1);
        }
        return 0;
    }

    /**
     * 给定和 在数组里找到这两个数
     */
    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (map.containsKey(target - x)) {
                return new int[]{map.get(target - x), i};
            }
            map.put(x, i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /**
     * 冒泡排序
     * o(n^2)
     */
    private static int[] bubble(int[] array) {
        int temp;
        for(int i = 0; i < array.length - 1; i++) {
            for(int j = 0; j < array.length - 1 - i; j++){
                if(array[j] < array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

    /**
     *快排
     */

    public static void main(String[] args) {
//        System.out.println(sumMethod(100));
        int[] arr = {2,4,5,1,7,0};
//        int[] a = twoSum(arr, 6);
        int[] a = bubble(arr);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
}
