// https://codeforces.com/problemset/problem/546/A
import java.util.*;
public class Elephant {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int money = sc.nextInt();
        int banana = sc.nextInt();
        int totalAmt = 0;
        for(int i = 1; i<=banana; i++)
        totalAmt += i*price;
        if(totalAmt > money)
        System.out.println(totalAmt - money);
        else
        System.out.println(0);
    }
}
