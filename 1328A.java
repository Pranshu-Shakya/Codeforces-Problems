// https://codeforces.com/problemset/problem/1328/A 
import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int count = 0;
            if(a % b == 0)
            System.out.println(0);
            else {
                int rem = a % b;
                System.out.println(b-rem);
            }
            t--;
        }
    }
}
