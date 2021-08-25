package misc.fsc3;

import java.util.Arrays;
import java.util.Locale;

public class Session13 {
    public static void main(String[] args) {

        isAnagram("quickbrownfoxjumpedoverthelazydog", "");

    }

    /*


    hellohello


    s1 = s1.concat(s1);
    return s1.contains(s2);

    s2


    hello
    elloh
    llohe
    lohel
    ohell


     */
    public static boolean isAnagram(String s1, String s2) {
        int[] freq = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                System.out.println("Lower case!");
            }

            int index = ch - 97;
            freq[index]++;
        }

        System.out.println(Arrays.toString(freq));


        return true;
    }

    public static void fancy(int ele) {
        System.out.println(ele);
    }

    /*




     */
}
