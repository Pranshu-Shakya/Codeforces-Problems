// https://codeforces.com/problemset/problem/1030/A
import java.util.Scanner;
public class Problem {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int opinion[] = new int[n];
        for(int i = 0; i<n; i++) {
            opinion[i] = sc.nextInt();
            if(opinion[i] == 1) {
                System.out.println("HARD");
                System.exit(0);
            }
        }
        System.out.println("EASY");
    }
}
