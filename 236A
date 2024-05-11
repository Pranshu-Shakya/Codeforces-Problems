// https://codeforces.com/problemset/problem/236/A
import java.util.*;
public class BoyOrGirl {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String username = sc.next();
        int len = username.length();
        //toCharArray() method changes string int character array
        char[] letters = username.toCharArray();
        //sorting of characters
        Arrays.sort(letters);
        int count = 0;
        for(int i = 0; i<len-1; i++) {
            if(letters[i] != letters[i+1])
            count++;
        }
        if((count+1) % 2 == 0)
        System.out.print("CHAT WITH HER!");
        else
        System.out.println("IGNORE HIM!");
    }
}
