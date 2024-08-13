// https://codeforces.com/problemset/problem/520/A
import java.util.HashMap;
import java.util.Scanner;
public class Codeforces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        if (len < 26) {
            System.out.println("NO");
            System.exit(0);
        }
        String ss = sc.next();
        String s = ss.toLowerCase();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<len; i++) {
            if(map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i), 1);
        }
        if(map.size() == 26)
        System.out.println("YES");
        else 
        System.out.println("NO");

        sc.close();
    }
}
