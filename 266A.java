// https://codeforces.com/problemset/problem/266/A
import java.util.Scanner;
public class Stones {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String s = sc.next();
      int count = 0;
      for(int i = 1; i<s.length(); i++) {
          if (s.charAt(i-1) == s.charAt(i))
          count++;
      }
      System.out.println(count);
    }
}

