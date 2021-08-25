package misc.fsc3;

import java.util.*;

public class Revision4 {

    public static void main(String[] args) {
        /*

        ['a', 10]
        ['z', 5]


        [1, 2, 3, 5, 6, 7, 8, 9]

        arr[4]

         */

        fun("hellohowareyou");

    }

    public static void fun(String s1) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);

            if (map.containsKey(c)) {
                int oldFreq = map.get(c);
                oldFreq++;
                map.put(c, oldFreq);
            } else {
                map.put(c, 1);
            }

        }

        map.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        });

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);



        for(int i = 0; i < list.size(); i++) {
            int temp = list.get(i);
            System.out.println(temp);
        }

        list.forEach(Session13::fancy);


    }
}
