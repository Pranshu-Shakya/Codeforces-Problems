// https://codeforces.com/problemset/problem/41/A
import java.util.Scanner;
public class Translation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int len = s.length();
        String ns = "";
        for(int i = len-1; i>=0; i--) {
            ns+=s.charAt(i);
        }
        if(ns.equals(t))
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}
