// https://codeforces.com/problemset/problem/266/B
import java.util.Scanner;

public class MyClass {
  public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        String s = sc.next();
        char str[] = s.toCharArray();
        for(int j=1; j<=t; j++) {
            int len = str.length;
            for(int i = 0; i<len; ) {
                if(str[i] == 'B') {
                    if(((i+1) < len) && (str[i+1] == 'G')) {
                        char temp = str[i];
                        str[i] = str[i+1];
                        str[i+1] = temp;
                        i+=2;
                    } else {
                        i++;
                    }
                } else {
                    i++;
                }
            }
        }
        System.out.println(new String(str));
  }
}
