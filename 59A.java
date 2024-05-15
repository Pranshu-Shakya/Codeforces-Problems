// https://codeforces.com/problemset/problem/59/A
import java.util.*;
public class Word{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int len = word.length();
        int u = 0;
        int l = 0;
        for(int i = 0; i<len; i++) {
            if(Character.isUpperCase(word.charAt(i)))
            u++;
            else
            l++;
        }
        if(u > l)
        System.out.println(word.toUpperCase());
        else if (u < l)
        System.out.println(word.toLowerCase());
        else
        System.out.println(word.toLowerCase());
    }
}
