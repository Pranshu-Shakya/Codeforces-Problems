// https://codeforces.com/problemset/problem/200/B
import java.util.Scanner; 
public class Codeforces {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mix = new int[n];
        double sum = 0;
        for(int i = 0; i<n; i++) {
            mix[i] = sc.nextInt();
            sum += mix[i];
        }
        System.out.println(sum / n);
    }
}
