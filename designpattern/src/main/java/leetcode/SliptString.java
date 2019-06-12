package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 给定字符串输出字符出现的次数
 */
public class SliptString {

    public static void main(String[] args) {
        getNum("abbcccdddde");
    }

    private static void getNum(String str) {
        List<String> arr = new ArrayList<String>();
        for (int i = 0; i < str.length(); i++) {
            arr.add(String.valueOf(str.charAt(i)));
            System.out.println(arr.get(i));
        }

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (String a : arr) {

            if(map.get(a) != null) {
                int num = map.get(a);
                map.put(a, num + 1);
            }

            if(map.get(a) == null) {
                map.put(a, 1);
            }

        }

        for(String m : map.keySet()) {
            System.out.println(m + "出现了：" + map.get(m) + "次");
        }
    }

}
