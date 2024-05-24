// https://codeforces.com/problemset/problem/486/A
import java.util.Scanner;
public class CalculatingFunctions {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(n % 2 == 0)
        System.out.println(n/2);
        else
        System.out.println(-(n/2 + 1));
    }
}
