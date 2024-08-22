// https://codeforces.com/problemset/problem/61/A
import java.util.Scanner;
public class MyClass {
  public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int len = a.length();
        String s = "";
        for(int i=0; i<len; i++) {
            if(a.charAt(i) != b.charAt(i))
            s += "1";
            else
            s += "0";
        }
        System.out.println(s);
  }
}
