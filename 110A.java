// https://codeforces.com/problemset/problem/110/A
import java.util.Scanner;
public class NearlyLuckyNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int len = n.length();
        int count = 0; 
        for(int i = 0; i<len; i++)
        if((n.charAt(i) == '4') || (n.charAt(i) == '7'))
        count++;
        if((count == 4) || (count == 7))
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}
